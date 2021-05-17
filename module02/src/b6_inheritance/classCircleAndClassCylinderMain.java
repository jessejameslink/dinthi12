package b6_inheritance;

import java.util.Scanner;

public class classCircleAndClassCylinderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập bán kính hình tròn");

        float radius = scanner.nextFloat();
        Circle circle = new Circle();

        cylinder hinhtru = new cylinder();

        System.out.println(circle.acreage(radius));

        System.out.println("nhập chiều cao hình trụ");

        float height = scanner.nextFloat();
        System.out.println(hinhtru.volume(radius,height));
    }
}
