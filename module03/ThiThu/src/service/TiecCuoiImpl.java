package service;

import bean.DichVu;
import bean.TiecCuoi;
import reponsitory.ConnectDB;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TiecCuoiImpl implements ITiecCuoi {
    String INSERT_TIECCUOI = "INSERT INTO thong_tin_tiec_cuoi" + "  (NgayToChuc,TenCoDau,TenChuRe,SoLuongBan,id_DichVu,TienNoThanhToan,NgayDatCoc,GhiChu,TrangThai)" +
            " VALUES " + " (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    String SELECT_TIECCUOI_ID = "select id,NgayToChuc,TenCoDau,TenChuRe,SoLuongBan,id_DichVu,TienNoThanhToan,NgayDatCoc,GhiChu,TrangThai from thong_tin_tiec_cuoi where id =?";
    String SELECT_ALL_TIECCUOI = "select * from thong_tin_tiec_cuoi";
    String DELETE_TIECCUOI_ID = "delete from thong_tin_tiec_cuoi where id = ?;";
    String UPDATE_TIECCUOI_ID = "update thong_tin_tiec_cuoi set NgayToChuc = ?,TenCoDau= ?, TenChuRe =?, SoLuongBan =?, id_DichVu =?, TienNoThanhToan =?, NgayDatCoc =?, GhiChu =?, TrangThai =? where id = ?;";
    String SELECT_TIECCUOI_BY_NAME = "select * from thong_tin_tiec_cuoi where TenCoDau like ?";
    String SELECT_DICH_VU_ID = "select TenDichVu from dich_vu where id_DichVu = ?;";
    String SELECT_ALL_DICH_VU = "select * from dich_vu";

    ConnectDB connectDB = new ConnectDB();

    @Override
    public void insertTiecCuoi(TiecCuoi tiecCuoi) throws SQLException {
        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(INSERT_TIECCUOI);
            statement.setString(1, tiecCuoi.getNgayToChuc());
            statement.setString(2, tiecCuoi.getTenCoDau());
            statement.setString(3, tiecCuoi.getTenChuRe());
            statement.setString(4, tiecCuoi.getSoLuongBan());
            statement.setInt(5, tiecCuoi.getId_DichVu());
            statement.setString(6, tiecCuoi.getTienNoThanhToan());
            statement.setString(7, tiecCuoi.getNgayDatCoc());
            statement.setString(8, tiecCuoi.getGhiChu());
            statement.setString(9, tiecCuoi.getTrangThai());

            System.out.println(statement);

            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    @Override
    public TiecCuoi selectTiecCuoi(int id) throws SQLException {
        TiecCuoi tiecCuoi = null;

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_TIECCUOI_ID);

            statement.setInt(1, id);

            System.out.println(statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String NgayToChuc = rs.getString("NgayToChuc");
                String TenCoDau = rs.getString("TenCoDau");
                String TenChuRe = rs.getString("TenChuRe");
                String SoLuongBan = rs.getString("SoLuongBan");
                int id_DichVu = rs.getInt("id_DichVu");
                String TienNoThanhToan = rs.getString("TienNoThanhToan");
                String NgayDatCoc = rs.getString("NgayDatCoc");
                String GhiChu = rs.getString("GhiChu");
                String TrangThai = rs.getString("TrangThai");

                tiecCuoi = new TiecCuoi(id, NgayToChuc, TenCoDau, TenChuRe, SoLuongBan, id_DichVu, TienNoThanhToan, NgayDatCoc, GhiChu, TrangThai);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tiecCuoi;
    }

    @Override
    public List<TiecCuoi> selectAllTiecCuoi() throws SQLException {
        List<TiecCuoi> tiecCuoiList = new ArrayList<>();
        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_ALL_TIECCUOI);
            System.out.println(statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String NgayToChuc = rs.getString("NgayToChuc");
                String TenCoDau = rs.getString("TenCoDau");
                String TenChuRe = rs.getString("TenChuRe");
                String SoLuongBan = rs.getString("SoLuongBan");
                int id_DichVu = rs.getInt("id_DichVu");
                String TienNoThanhToan = rs.getString("TienNoThanhToan");
                String NgayDatCoc = rs.getString("NgayDatCoc");
                String GhiChu = rs.getString("GhiChu");
                String TrangThai = rs.getString("TrangThai");

                tiecCuoiList.add(new TiecCuoi(id, NgayToChuc, TenCoDau, TenChuRe, SoLuongBan, id_DichVu, TienNoThanhToan, NgayDatCoc, GhiChu, TrangThai));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return tiecCuoiList;
    }

    @Override
    public boolean deleteTiecCuoi(int id) throws SQLException {
        boolean rowDeleted = false;
        PreparedStatement statement = null;
        try {
            statement = this.connectDB.getConnection().prepareStatement(DELETE_TIECCUOI_ID);

            statement.setInt(1, id);

            rowDeleted = statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return rowDeleted;
    }

    @Override
    public boolean updateTiecCuoi(TiecCuoi tiecCuoi) throws SQLException {
        boolean rowUpdated = false;
        PreparedStatement statement = null;
        try {
            statement = this.connectDB.getConnection().prepareStatement(UPDATE_TIECCUOI_ID);

            statement.setString(1, tiecCuoi.getNgayToChuc());
            statement.setString(2, tiecCuoi.getTenCoDau());
            statement.setString(3, tiecCuoi.getTenChuRe());
            statement.setString(4, tiecCuoi.getSoLuongBan());
            statement.setInt(5, tiecCuoi.getId_DichVu());
            statement.setString(6, tiecCuoi.getTienNoThanhToan());
            statement.setString(7, tiecCuoi.getNgayDatCoc());
            statement.setString(8, tiecCuoi.getGhiChu());
            statement.setString(9, tiecCuoi.getTrangThai());
            statement.setInt(10, tiecCuoi.getId());

            System.out.println(statement);

            rowUpdated = statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return rowUpdated;
    }

//    @Override
//    public List<TiecCuoi> selectTiecCuoiByName(String name) throws SQLException {
//        List<TiecCuoi> tiecCuoiList = new ArrayList<>();
//        try {
//            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_TIECCUOI_BY_NAME);
//            statement.setString(1,"%"+name+"%");
//            ResultSet rs = statement.executeQuery();
//
//            System.out.println(statement);
//
//            TiecCuoi tiecCuoi = null;
//
//            while (rs.next()){
//                int id = rs.getInt("id");
//                String NgayToChuc = rs.getString("NgayToChuc");
//                String TenCoDau = rs.getString("TenCoDau");
//                String TenChuRe = rs.getString("TenChuRe");
//                String SoLuongBan = rs.getString("SoLuongBan");
//                int id_DichVu = rs.getInt("id_DichVu");
//                String TienNoThanhToan = rs.getString("TienNoThanhToan");
//                String NgayDatCoc = rs.getString("NgayDatCoc");
//                String GhiChu = rs.getString("GhiChu");
//                String TrangThai = rs.getString("TrangThai");
//                tiecCuoi = new TiecCuoi(id,NgayToChuc,TenCoDau,TenChuRe,SoLuongBan,id_DichVu,TienNoThanhToan,NgayDatCoc,GhiChu,TrangThai);
//
//                tiecCuoiList.add(tiecCuoi);
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return tiecCuoiList;
//    }

    @Override
    public List<DichVu> selectAllDichVu() {
        List<DichVu> dichVuList = new ArrayList<>();

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_ALL_DICH_VU);
            System.out.println(statement);

            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_DichVu");
                String TenDichVu = rs.getString("TenDichVu");
//                String DonGia = rs.getString("DonGia");

                dichVuList.add(new DichVu(id, TenDichVu));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dichVuList;
    }

    @Override
    public DichVu selsectDichVuId(int id) {
        DichVu dichVu = null;

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_DICH_VU_ID);

            statement.setInt(1, id);

            System.out.println(statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String TenDichVu = rs.getString("TenDichVu");
//                String DonGia = String.valueOf(rs.getFloat("DonGia"));

                dichVu = new DichVu(id, TenDichVu);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return dichVu;
    }
}

