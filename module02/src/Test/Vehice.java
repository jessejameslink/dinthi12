package Test;

public interface Vehice extends Person{
    String vin = "vin";
    int muoi = 10;

    String run(String a, String b);

    int run(float a, int b, int c);

    void notice();

}
