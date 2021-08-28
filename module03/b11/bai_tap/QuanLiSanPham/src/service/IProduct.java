package service;

import bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProduct {
    void insertProduct(Product product) throws SQLException, ClassNotFoundException;

    Product selectProduct(int id) throws SQLException, ClassNotFoundException;

    List<Product> selectAllProduct() throws SQLException, ClassNotFoundException;

    boolean deleteProduct(int id) throws SQLException;

    boolean updateProduct(Product product) throws SQLException;

    List<Product> selectProductByName(String name) throws SQLException;
}
