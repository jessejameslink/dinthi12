package model.Reponsitory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    public  final String INSERT_USER = "INSERT INTO users" + "  (name,email,country) VALUES " + " (?, ?, ?);";
    public  final String SELECT_USER_ID = "select id,name,email,country from users where id =?";
    public  final String SELECT_ALL_USER = "select * from users";
    public  final String DELETE_USER_ID = "delete from users where id = ?;";
    public  final String UPDATE_USER_ID = "update users set name = ?,email= ?, country =? where id = ?;";
    public  final String SELECT_USER_BY_NAME = "select * from users where name like ?";

    private String jdbcURL = "jdbc:mysql://localhost:3306/demo";
    private String jdbcUsername = "root";
    private String jdbcPassword = "";

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        Connection connection = null;
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);

        return connection;
    }
}
