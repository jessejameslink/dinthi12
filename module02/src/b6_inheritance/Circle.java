package b6_inheritance;

public class Circle {
    public String color;
    public float radius;
    final float PI = 3.14f;

    public Circle() {
    }

    public Circle(String color, float radius) {
        this.color = color;
        this.radius = radius;
    }

    public float acreage(float radius){
        return radius*radius*PI;
    }
    public float perimeter(float radius){
        return 2*radius*PI;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}
