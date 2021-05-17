package b1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class docSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int number = scanner.nextInt();

        int hangTram = number / 100;  //chia lấy hàng trăm
        int test2 = (number % 100);  //tách hàng chục với hàng đơn vị
        int hangChuc = test2 / 10;      //chia lấy hàng chục
        int hangDonVi = test2 % 10;     //lấy hàng đơn vị

        System.out.println(hangTram);
        System.out.println(hangChuc);
        System.out.println(hangDonVi);
        readNumber(number, hangTram, hangChuc, hangDonVi);
    }

    private static void readNumber(int number, int hangTram, int hangChuc, int hangDonVi) {
        switch (hangTram) {
            case 1:
                System.out.print("một trăm ");
                break;
            case 2:
                System.out.print("hai trăm ");
                break;
            case 3:
                System.out.print("ba trăm ");
                break;
            case 4:
                System.out.print("bốn trăm ");
                break;
            case 5:
                System.out.print("năm trăm ");
                break;
            case 6:
                System.out.print("sáu trăm ");
                break;
            case 7:
                System.out.print("bảy trăm ");
                break;
            case 8:
                System.out.print("tám trăm ");
                break;
            case 9:
                System.out.print("chín trăm ");
                break;

        }
        switch (hangChuc) {
            case 1:
                System.out.print("mười ");
                break;
            case 2:
                System.out.print("hai mươi ");
                break;
            case 3:
                System.out.print("ba mươi ");
                break;
            case 4:
                System.out.print("bốn mươi ");
                break;
            case 5:
                System.out.print("năm mươi ");
                break;
            case 6:
                System.out.print("sáu mươi ");
                break;
            case 7:
                System.out.print("bảy mươi ");
                break;
            case 8:
                System.out.print("tám mươi ");
                break;
            case 9:
                System.out.print("chín mươi ");
                break;

        }
        switch (hangDonVi) {
            case 1:
                System.out.print("mốt");
                break;
            case 2:
                System.out.print("hai ");
                break;
            case 3:
                System.out.print("ba ");
                break;
            case 5:
                System.out.print("năm ");
                break;
            case 6:
                System.out.print("sáu ");
                break;
            case 7:
                System.out.print("bảy ");
                break;
            case 8:
                System.out.print("tám ");
                break;
            case 9:
                System.out.print("chín ");
                break;
        }
    }
}
