package b7_abstractAndInterface.Resizeable;

public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.round(radius*radius*Math.PI);
    }
    public double getPerimeter(){
        return Math.round(radius*2*Math.PI);
    }

    @Override
    public String toString() {
        return "hình tròn có bán kính = "+getRadius()+" thì có diện tích = "+getArea()
                +" có chu vi = "+getPerimeter()+" màu sắc và filled lần lượt là "+super.toString();
    }
    @Override
    public void resize(double percent) {
        radius += (radius+percent/100);
    }
}
