package b7_abstractAndInterface.Resizeable;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        Random random = new Random();
        double random1 = random.nextInt(10) + 1;

        double random2 = random.nextInt(10) + 1;

        Shape[] shapes = new Shape[3];
        Square square = new Square();
        shapes[0] = new Circle("bLUE", true, random1);
        shapes[1] = new Square("RED", false, random1);
        shapes[2] = new Rectangle("YELLOW", true, random1, random2);

        System.out.println("before increase percent");
        for (int i = 0; i < 3; i++) {

            if (shapes[i]==square){
                square.howtocolor();
            }
            System.out.println(shapes[i]);
        }

        double percent = random.nextInt(100)+1;


        for(Shape a : shapes){
            a.resize(percent);
        }
        System.out.println("\n");
        System.out.println("after increase percent");
       Shape.printShape(shapes);


    }
}
//ok