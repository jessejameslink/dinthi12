package b7_abstractAndInterface.Resizeable;

public class Rectangle extends Shape {
    private double with;
    private double length;

    public Rectangle() {
    }

    public Rectangle(double with, double length) {
        this.with = with;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double with, double length) {
        super(color, filled);
        this.with = with;
        this.length = length;
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        this.with = with;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return Math.round(with * length);
    }

    public double getPerimeter() {
        return Math.round((with + length) * 2);
    }

    @Override
    public String toString() {
        return "hình chữ nhật có chiều dài = " + getLength() + " chiều rộng = " + getWith() + " thì có diện tích = " + getArea()
                + " có chu vi = " + getPerimeter() + " màu sắc và filled lần lượt là " + super.toString();
    }
    @Override
    public void resize(double percent) {
        with += (with+percent/100);
        length += (length+percent/100);

    }
}
