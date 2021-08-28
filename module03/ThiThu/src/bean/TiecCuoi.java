package bean;

import java.sql.Date;

public class TiecCuoi {
    private int id;
    private String NgayToChuc;
    private String TenCoDau;
    private String TenChuRe;
    private String SoLuongBan;
    private int id_DichVu;
    private String TienNoThanhToan;
    private String NgayDatCoc;
    private String GhiChu;
    private String TrangThai;

    public TiecCuoi(){}

    public TiecCuoi(int id, String NgayToChuc, String tenCoDau, String tenChuRe, String soLuongBan, int id_DichVu, String tienNoThanhToan, String ngayDatCoc, String ghiChu, String trangThai) {
        this.id = id;
        this.NgayToChuc = NgayToChuc;
        this.TenCoDau = tenCoDau;
        TenChuRe = tenChuRe;
        SoLuongBan = soLuongBan;
        this.id_DichVu = id_DichVu;
        TienNoThanhToan = tienNoThanhToan;
        NgayDatCoc = ngayDatCoc;
        GhiChu = ghiChu;
        TrangThai = trangThai;
    }

    public TiecCuoi(String NgayToChuc, String tenCoDau, String tenChuRe, String soLuongBan, int id_DichVu, String tienNoThanhToan, String ngayDatCoc, String ghiChu, String trangThai) {
        this.NgayToChuc = NgayToChuc;
        TenCoDau = tenCoDau;
        TenChuRe = tenChuRe;
        SoLuongBan = soLuongBan;
        this.id_DichVu = id_DichVu;
        TienNoThanhToan = tienNoThanhToan;
        NgayDatCoc = ngayDatCoc;
        GhiChu = ghiChu;
        TrangThai = trangThai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNgayToChuc() {
        return NgayToChuc;
    }

    public void setNgayToChuc(String ngayToChuc) {
        this.NgayToChuc = ngayToChuc;
    }

    public String getTenCoDau() {
        return TenCoDau;
    }

    public void setTenCoDau(String tenCoDau) {
        TenCoDau = tenCoDau;
    }

    public String getTenChuRe() {
        return TenChuRe;
    }

    public void setTenChuRe(String tenChuRe) {
        TenChuRe = tenChuRe;
    }

    public String getSoLuongBan() {
        return SoLuongBan;
    }

    public void setSoLuongBan(String soLuongBan) {
        SoLuongBan = soLuongBan;
    }

    public int getId_DichVu() {
        return id_DichVu;
    }

    public void setId_DichVu(int id_DichVu) {
        this.id_DichVu = id_DichVu;
    }

    public String getTienNoThanhToan() {
        return TienNoThanhToan;
    }

    public void setTienNoThanhToan(String tienNoThanhToan) {
        TienNoThanhToan = tienNoThanhToan;
    }

    public String getNgayDatCoc() {
        return NgayDatCoc;
    }

    public void setNgayDatCoc(String ngayDatCoc) {
        NgayDatCoc = ngayDatCoc;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String ghiChu) {
        GhiChu = ghiChu;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String trangThai) {
        TrangThai = trangThai;
    }
}
