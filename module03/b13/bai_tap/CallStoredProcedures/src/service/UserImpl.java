package service;

import reponsitory.ConnectDB;
import bean.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class UserImpl implements IUser {
    String INSERT_USER = "INSERT INTO users" + "  (id,name,email,country) VALUES " + " (?, ?, ?, ?);";

    String SELECT_ALL_USER_STOREE = "{call get_all_users()};";

    String DELETE_USER_ID = "{call delete_user_by_id(?)};";

    String UPDATE_USER_ID = "{call update_user_by_id(?, ?, ?, ?)};";

    String SELECT_USER_BY_NAME = "select * from users where name like ?";

    String GET_USER_BY_ID = "{CALL get_user_by_id(?)}";

    String INSERT_USER_STOREE = "{CALL insert_user(?,?,?)}";

    ConnectDB connectDB = new ConnectDB();


    @Override
    public List<User> selectAllUser() throws SQLException {
        List<User> users = new ArrayList<>();
        try {
            CallableStatement callableStatement = this.connectDB.getConnection().prepareCall(SELECT_ALL_USER_STOREE);

            ResultSet rs = callableStatement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                int id = rs.getInt("id");

                users.add(new User(id, name, email, country));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowdeleted = false;

        try {
            CallableStatement callableStatement = this.connectDB.getConnection().prepareCall(DELETE_USER_ID);
            callableStatement.setInt(1, id);

            System.out.println(callableStatement);

            rowdeleted = callableStatement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowdeleted;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated = false;

        try {
            CallableStatement callableStatement = this.connectDB.getConnection().prepareCall(UPDATE_USER_ID);
            callableStatement.setInt(1, user.getId());
            callableStatement.setString(2, user.getName());
            callableStatement.setString(3, user.getEmail());
            callableStatement.setString(4, user.getCountry());


            rowUpdated = callableStatement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return rowUpdated;

    }

    @Override
    public List<User> selectUserByName(String name) {
        return null;
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        try {
            CallableStatement callableStatement = this.connectDB.getConnection().prepareCall(GET_USER_BY_ID);

            callableStatement.setInt(1, id);

            ResultSet rs = callableStatement.executeQuery();

            System.out.println(callableStatement);

            while (rs.next()) {

                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");

                user = new User(id, name, email, country);

            }

        } catch (SQLException e) {
            e.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public void insertUserStore(User user) {
        try {
            CallableStatement callableStatement = this.connectDB.getConnection().prepareCall(INSERT_USER_STOREE);

            callableStatement.setString(1, user.getName());

            callableStatement.setString(2, user.getEmail());

            callableStatement.setString(3, user.getCountry());

            System.out.println(callableStatement);

            callableStatement.executeUpdate();

        } catch (SQLException e) {

            e.getMessage();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addUserTransaction() throws SQLException {
        Connection connection = null;

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(INSERT_USER);

            connection.setAutoCommit(false);

            statement.setInt(1, 7);
            statement.setString(2, "CD");
            statement.setString(3, "thi884641@gmail.com");
            statement.setString(4, "VietNam");

            statement.execute();

            statement.setInt(1, 7);
            statement.setString(2, "BD");
            statement.setString(3, "thi884641@gmail.com");
            statement.setString(4, "VietNam");

            statement.execute();

            connection.commit();

            connection.setAutoCommit(true);

        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}