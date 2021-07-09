package Test3.Models;


public class Kawasaki extends Vehicle {

    private String colorKawa;

    public Kawasaki() {

    }

    public Kawasaki(String id, String name, String firm, String year, double price, String colorKawa) {
        super(id, name, firm, year, price);
        this.colorKawa = colorKawa;
    }

    public String getColorKawa() {
        return colorKawa;
    }

    public void setColorKawa(String colorKawa) {
        this.colorKawa = colorKawa;
    }

    @Override
   public void print() {
        System.out.println(this.toString());
    }



    @Override
    public String toString() {
        return "Kawasaki{" +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", firm='" + firm + '\'' +
                ", year='" + year + '\'' +
                ", price='" + price + '\'' +
                ", colorKawa='" + colorKawa + '\'' +
                '}';
    }
}
