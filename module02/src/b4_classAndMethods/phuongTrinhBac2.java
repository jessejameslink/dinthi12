package b4_classAndMethods;

public class phuongTrinhBac2 {
    private double a;
    private double b;
    private double c;


    public phuongTrinhBac2() {
    }

    public phuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDental() {
        return b * b - 4 * a * c;
    }

    public double getX1() {
        return (-b - Math.sqrt(getDental())) / (2 * a);
    }


    public double getX2() {
        return (-b + Math.sqrt(getDental())) / (2 * a);
    }
}
