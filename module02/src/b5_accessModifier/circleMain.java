package b5_accessModifier;

public class circleMain {
    public static void main(String[] args) {
        circle ci = new circle();

        System.out.println("color "+ci.getColor("red") );
        System.out.println("radius "+ci.getRadius(12.0));
    }
}
