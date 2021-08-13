package Models.Service;

import Models.Bean.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductService {
    boolean insertProduct (Product product) throws SQLException;
     Product selectProduct(int id);
     boolean deleteProduct(int id) throws SQLException;
     boolean updateProduct(Product product) throws SQLException;
    List<Product> selectAllProduct();
    List<Product> selectProductByName(String name) throws SQLException;
}
