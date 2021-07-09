package Test3.Models;

public abstract class Vehicle  {
    String id;
    String name;
    String firm;
    String year;
    double price;

    public Vehicle() {
    }

    Vehicle(String id, String name, String firm, String year, double price) {
        this.id = id;
        this.name = name;
        this.firm = firm;
        this.year = year;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void print();

}
