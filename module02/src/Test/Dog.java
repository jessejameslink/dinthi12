package Test;

public class Dog extends Animal {
    private String firstName;

    public Dog() {
    }

    public Dog(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    void tiengKeu(int a,int b) {

        System.out.println("my name is "+ this.name + " "+ this.getFirstName());
        System.out.println("i know do math");
        System.out.println(a + b);
    }
    @Override
    String noiChuoi(String a, String b) {
        return a + " " + b;
    }

    @Override
    public double tinhthong(double so1, double so2) {
        return so1 + so2;
    }
}
