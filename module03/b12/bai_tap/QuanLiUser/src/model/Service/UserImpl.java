package model.Service;

import model.Reponsitory.ConnectDB;
import model.bean.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserImpl implements IUserDao {

    ConnectDB connectDB = new ConnectDB();

    @Override
    public void insertUser(User user) throws SQLException {
        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(connectDB.INSERT_USER);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());

            System.out.println(statement);

            statement.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    @Override
    public User selectUser(int id) {
        User user = null;

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(connectDB.SELECT_USER_ID);
            statement.setInt(1, id);

            System.out.println(statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");

                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> users = new ArrayList<>();

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(connectDB.SELECT_ALL_USER);
            System.out.println(statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");

                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted = false;
        PreparedStatement statement = null;
        try {
            statement = this.connectDB.getConnection().prepareStatement(connectDB.DELETE_USER_ID);

            statement.setInt(1, id);

            rowDeleted = statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return rowDeleted;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated = false;
        PreparedStatement statement = null;
        try {
            statement = this.connectDB.getConnection().prepareStatement(connectDB.UPDATE_USER_ID);
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return rowUpdated;

    }

    @Override
    public List<User> selectProductByName(String name) throws SQLException {
        List<User> userList = new ArrayList<>();
        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(connectDB.SELECT_USER_BY_NAME);
            statement.setString(1,"%"+name+"%");
            ResultSet resultSet = statement.executeQuery();

            System.out.println(statement);

            User user = null;

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name1 = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id,name1,email,country);

                userList.add(user);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return userList;
    }
    }


