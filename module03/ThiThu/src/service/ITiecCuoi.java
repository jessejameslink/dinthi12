package service;

import bean.DichVu;
import bean.TiecCuoi;

import java.sql.SQLException;
import java.util.List;

public interface ITiecCuoi {
    void insertTiecCuoi(TiecCuoi tiecCuoi) throws SQLException;

    TiecCuoi selectTiecCuoi(int id) throws SQLException;

    List<TiecCuoi> selectAllTiecCuoi() throws SQLException;

    boolean deleteTiecCuoi(int id) throws SQLException;

    boolean updateTiecCuoi(TiecCuoi tiecCuoi ) throws SQLException;

//    List<TiecCuoi> selectTiecCuoiByName(String name) throws SQLException;

    List<DichVu> selectAllDichVu()throws SQLException;

    DichVu selsectDichVuId(int id)throws SQLException;
}
