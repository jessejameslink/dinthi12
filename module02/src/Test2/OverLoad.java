package Test2;

public class OverLoad {
   public String name;
   private String address;

    public OverLoad() {
    }

    public OverLoad(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display(){
        System.out.println(this.name);

    }



    public int tong2so(int a, int b){
        return a+b;
    }
    public float tong2so(float a, int b){
        return a+b;
    }
    public long tong2so(long a, int b, long c){
        return  (a+b+c);
    }
}
