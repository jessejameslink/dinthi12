package Test3.Models;

public class Vinfast extends Vehicle {
    private String engine;
    private String address;

    public Vinfast(){
    }

    public Vinfast(String id, String name, String firm, String year, double price, String engine, String address) {
        super(id, name, firm, year, price);
        this.engine = engine;
        this.address = address;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
   public void print() {
        System.out.println(this.toString());
    }


    @Override
    public String toString() {
        return "Vinfast{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", firm='" + firm + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                "engine='" + engine + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
