package Test;

public class Cat extends Animal implements Vehice {
    private String FirstName;

    public Cat(String firstName) {
        FirstName = firstName;
    }

    public Cat() {
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Override
    void tiengKeu(int a, int b) {
        System.out.println("meo meo");
    }


    @Override
    public String run(String a, String b) {
        return a+ " "+ b;
    }

    @Override
    public int run(float a, int b, int c) {
        return (int) (a + b * c);
    }

    @Override
    public void notice() {

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
