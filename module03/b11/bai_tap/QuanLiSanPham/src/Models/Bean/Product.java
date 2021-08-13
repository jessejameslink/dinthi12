package Models.Bean;

public class Product {
    private int id;
    private String nameProduct;
    private String priceProduct;
    private String descriptionProduct;
    private String manufacturer;

    public Product(int id, String nameProduct, String priceProduct, String descriptionProduct, String manufacturer) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.descriptionProduct = descriptionProduct;
        this.manufacturer = manufacturer;
    }

    public Product() {
    }

    public Product(String name, String price, String description, String manufacturer) {
        this.nameProduct = name;
        this.priceProduct = price;
        this.descriptionProduct = description;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
