package Test2;

public class OverRide extends OverLoad {
  public String name;
  private String addressOver;

    public OverRide(String name, String address){
        super(name, address);
    }


    public OverRide(String name, String address, String name1, String addressOver) {
        super(name, address);
        this.name = name1;
        this.addressOver = addressOver;
    }

    public String getAddressOver() {
        return addressOver;
    }

    public void setAddressOver(String addressOver) {
        this.addressOver = addressOver;
    }

    @Override
    public void display() {
        super.display();
        System.out.println(this.name);
    }

    @Override
    public float tong2so(float a, int b) {
       return a * b;
    }

    @Override
    public long tong2so(long a, int b, long c) {
        System.out.println(super.tong2so(10,20,30));
        return a +b *c;
    }
}
