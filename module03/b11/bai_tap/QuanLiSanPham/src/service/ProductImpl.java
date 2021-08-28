package service;

import bean.Product;
import reponsitory.ConnectDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductImpl implements IProduct {

    String INSERT_Product = "INSERT INTO product" + "  (name,price,description,manufacturer) VALUES " + " (?, ?, ?, ?);";
    String SELECT_Product_ID = "select id,name,price,description,manufacturer from product where id =?";
    String SELECT_ALL_Product = "select * from product";
    String DELETE_Product_ID = "delete from product where id = ?;";
    String UPDATE_Product_ID = "update product set name = ?,price= ?, description =?, manufacturer =? where id = ?;";
    String SELECT_Product_BY_NAME = "select * from product where name like ?";

    ConnectDB connectDB = new ConnectDB();

    @Override
    public void insertProduct(Product product) throws SQLException, ClassNotFoundException {
        try{
            PreparedStatement statement =  this.connectDB.getConnection().prepareStatement(INSERT_Product);
            statement.setString(1,product.getName());
            statement.setString(2,product.getPrice());
            statement.setString(3,product.getDescription());
            statement.setString(4,product.getManufacturer());

            System.out.println(statement);

            statement.executeUpdate();


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Product selectProduct(int id) throws SQLException, ClassNotFoundException {
        Product product = null;

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_Product_ID);
            statement.setInt(1,id);

            System.out.println(statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                String name = rs.getString("name");
                String price = rs.getString("price");
                String description = rs.getString("description");
                String manufacturer = rs.getString("manufacturer");

                product = new Product(id,name,price,description,manufacturer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public List<Product> selectAllProduct() throws ClassNotFoundException {
        List<Product> productList = new ArrayList<>();

        try{
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_ALL_Product);
            System.out.println(statement);

            ResultSet rs = statement.executeQuery();

            while (rs.next()){
                int id= rs.getInt("id");
                String name = rs.getString("name");
                String price = rs.getString("price");
                String description = rs.getString("description");
                String manufacturer = rs.getString("manufacturer");

                productList.add(new Product(id,name,price,description,manufacturer));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        boolean rowDeleted = false;

        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(DELETE_Product_ID);

            statement.setInt(1,id);

            rowDeleted = statement.executeUpdate() > 0;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        boolean rowUpdated = false;

        try{
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(UPDATE_Product_ID);

            statement.setString(1,product.getName());
            statement.setString(2,product.getPrice());
            statement.setString(3,product.getDescription());
            statement.setString(4,product.getManufacturer());
            statement.setInt(5,product.getId());

            rowUpdated = statement.executeUpdate() > 0;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public List<Product> selectProductByName(String name) throws SQLException {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement statement = this.connectDB.getConnection().prepareStatement(SELECT_Product_BY_NAME);
            statement.setString(1,"%"+name+"%");
            ResultSet rs = statement.executeQuery();

            System.out.println(statement);

            Product product = null;

            while (rs.next()){
                int id= rs.getInt("id");
                String name1 = rs.getString("name");
                String price = rs.getString("price");
                String description = rs.getString("description");
                String manufacturer = rs.getString("manufacturer");
                product = new Product(id,name1,price,description,manufacturer);

                productList.add(product);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

}
