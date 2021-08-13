package Models.Service;

import Models.Bean.Product;
import Models.DAO.ConnetDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductIm implements ProductService {
    private ConnetDB connetDB = new ConnetDB();
    private static final String INSERT_PRODUCT = "INSERT INTO product" + "  (name_Product, price_Product, description_Product,manufacturer) VALUES " + " (?, ?, ?,?);";
    private static final String SELECT_PRODUCT_ID = "select id,name_Product,price_Product,description_Product,manufacturer from product where id =?";
    private static final String SELECT_ALL_PRODUCT = "select * from product";
    private static final String DELETE_PRODUCT_ID = "delete from product where id = ?;";
    private static final String UPDATE_PRODUCT_ID = "update product set name_Product = ?,price_Product= ?, description_Product =?,manufacturer =? where id = ?;";
    private static final String SELECT_PRODUCT_BY_NAME = "select * from product where name_Product like ?";

    //chưa có tìm kiếm theo tên
    @Override
    public boolean insertProduct(Product product) throws SQLException {
        int row = 0;
        try {
            PreparedStatement statement = this.connetDB.getConnection().prepareStatement(INSERT_PRODUCT);
            statement.setString(1, product.getNameProduct());
            statement.setString(2, product.getPriceProduct());
            statement.setString(3, product.getDescriptionProduct());
            statement.setString(4, product.getManufacturer());

            System.out.println(statement);
            row = statement.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return row > 0;
    }

    @Override
    public Product selectProduct(int id) {
        Product product = null;
        try {
            PreparedStatement preparedStatement = connetDB.getConnection().prepareStatement(SELECT_PRODUCT_ID);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            System.out.println(preparedStatement);

            while (rs.next()) {
                String nameProduct = rs.getString("name_Product");
                String priceProduct = rs.getString("price_Product");
                String descriptionProduct = rs.getString("description_Product");
                String manufacturer = rs.getString("manufacturer");

                product = new Product(id, nameProduct, priceProduct, descriptionProduct, manufacturer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        {
            return product;
        }
    }

    @Override
    public boolean deleteProduct(int id) throws SQLException {
        boolean rowDeleted = false;
        try {
            PreparedStatement statement = this.connetDB.getConnection().prepareStatement(DELETE_PRODUCT_ID);
            statement.setInt(1, id);
            System.out.println(statement);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowDeleted;
    }

    @Override
    public boolean updateProduct(Product product) throws SQLException {
        boolean rowUpdated = false;
        try {
            PreparedStatement statement = this.connetDB.getConnection().prepareStatement(UPDATE_PRODUCT_ID);
            statement.setString(1, product.getNameProduct());
            statement.setString(2, product.getPriceProduct());
            statement.setString(3, product.getDescriptionProduct());
            statement.setString(4, product.getManufacturer());
            statement.setInt(5, product.getId());

            rowUpdated = statement.executeUpdate() > 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return rowUpdated;
    }

    @Override
    public List<Product> selectAllProduct() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connetDB.getConnection().prepareStatement(SELECT_ALL_PRODUCT);
            System.out.println(preparedStatement);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String nameProduct = rs.getString("name_Product");
                String priceProduct = rs.getString("price_Product");
                String descriptionProduct = rs.getString("description_Product");
                String manufacturer = rs.getString("manufacturer");

                products.add(new Product(id, nameProduct, priceProduct, descriptionProduct, manufacturer));
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return products;
    }

    @Override
    public List<Product> selectProductByName(String name) throws SQLException {
        List<Product> productList = new ArrayList<>();
        try {
            PreparedStatement statement = this.connetDB.getConnection().prepareStatement(SELECT_PRODUCT_BY_NAME);
            statement.setString(1,"%"+name+"%");
            ResultSet resultSet = statement.executeQuery();
            System.out.println(statement);

            Product product = null;
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String nameProduct = resultSet.getString("name_Product");
                String priceProduct = resultSet.getString("price_Product");
                String descriptionProduct = resultSet.getString("description_Product");
                String manufacturer = resultSet.getString("manufacturer");

                product = new Product(id,nameProduct,priceProduct,descriptionProduct,manufacturer);

                productList.add(product);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }
}
