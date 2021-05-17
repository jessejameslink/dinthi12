package b7_abstractAndInterface.Resizeable;

public class Square extends Shape implements Colorable{
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //tính diện tích
    public double getArea() {
        return Math.round(side*side);
    }

    public double getPerimeter() {
        return Math.round(side * 4);
    }

    @Override
    public String toString() {
        return "hình vuông có cạnh = " + getSide() + " thì có diện tích = " + getArea()
                + " có chu vi = " + getPerimeter() + " màu sắc và filled lần lượt là " + super.toString();
    }

    @Override
    public void resize(double percent) {
        side += (side + percent/100);
    }


    @Override
    public void howtocolor() {
        System.out.println("Color all four sides..");
    }
}
