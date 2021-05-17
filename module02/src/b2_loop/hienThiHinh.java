package b2_loop;
import java.util.Scanner;
public class hienThiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.in hinh chu nhat " + "\n" +
                "2.in hinh tam giac" + "\n" +
                "3.in hinh tam giac vuong can " + "\n" +
                "4.exit");
        System.out.println("Enter number: ");

        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println("in hinh chu nhat");
                hinhChuNhat(1);
                break;
            case 2:
                System.out.println("in hinh tam giac");
                hinhtamgiac(2);
                break;
            case 3:
                System.out.println("in hinh tam giac vuong can");
                hinhTamGiacCan(3);
                break;
            case 4:
                System.out.println("exit");
                break;
            default:
                System.out.println("not chose");
        }
    }



    public static void hinhChuNhat(int number) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter chieu dai: ");
        int height = scanner.nextInt();
        System.out.println("enter chieu rong: ");
        int weight = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= weight; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }

    public static void hinhtamgiac(int number) {

        int height;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter height: ");
            height = scanner.nextInt();
        } while (height <= 0);
        {
            for (int i = 1; i < height; i++) {
                for (int j = 1; j <= height - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }

        }
        scanner.close();
    }

    public static void hinhTamGiacCan(int number) {
        int height;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("enter height: ");
            height = scanner.nextInt();
        } while (height <= 0);
        {
            for (int i = 0; i < height; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
        scanner.close();
    }
}
