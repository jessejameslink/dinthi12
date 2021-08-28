package Service;

import bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUser {
     void insertUser(User user) throws SQLException;

     User selectUser(int id) throws SQLException;

     List<User> selectAllUser() throws SQLException;

     boolean deleteUser(int id) throws SQLException;

     boolean updateUser(User user) throws SQLException;

    List<User> selectUserByName(String name) throws SQLException;
}
