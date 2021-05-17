package b4_classAndMethods;
import java.util.Scanner;
public class phuongTrinhBac2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        double a = scanner. nextDouble();
        System.out.println("enter b");
        double b = scanner. nextDouble();
        System.out.println("enter c");
        double c = scanner.nextDouble();
        phuongTrinhBac2 s1 = new phuongTrinhBac2(a,b,c);
        if (s1.getDental() > 0){
            System.out.println(s1.getX1());
            System.out.println(s1.getX2());
        }else if (s1.getDental() == 0){
            System.out.println(s1.getX1());
        }else {
            System.out.println("ptvn");
        }
    }
}
