import service.ProductImpl;

public class test {
    public static void main(String[] args) throws ClassNotFoundException {
        ProductImpl product = new ProductImpl();
        product.selectAllProduct();
    }
}
