package b7_abstractAndInterface.Resizeable;

public class testColor {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("bLUE", true, 1);
        shapes[1] = new Square("RED", false, 2);
        shapes[2] = new Rectangle("YELLOW", true, 3, 4);


        for (Shape a:
             shapes) {
            if (a instanceof Square){

                ((Square) a).howtocolor();
                Shape.printShape(shapes);

            }
        }

    }
}

