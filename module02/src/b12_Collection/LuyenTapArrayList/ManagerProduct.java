package b12_Collection.LuyenTapArrayList;

import java.util.ArrayList;
import java.util.List;

public class ManagerProduct {
    List<Product> products;

    public ManagerProduct() {
        this.products = new ArrayList<>();
    }

    public void add(Product product) {
        this.products.add(product);
    }

    public void show() {
        this.products.forEach(o -> System.out.println(o.toString()));
    }

    public void searchOfName(long id) {
        this.products.stream().filter(o -> o.getIdProduct() == id).forEach(o -> System.out.println(o.toString()));
    }

    public boolean removed(long id) {
        Product product = this.products.stream().filter(o -> o.getIdProduct() == id).findFirst().orElse(null);
        if (product == null) {
            return false;
        }
        this.products.remove(product);
        System.out.println("delete successful");
        show();
        return true;
    }
}
