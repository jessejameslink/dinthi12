package b15_Exception;

import java.util.Scanner;

public class IllegalTriangleException {
    private static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        try{
            System.out.println("enter cạnh a");
            int a  = scanner.nextInt();
            System.out.println("enter cạnh b");
            int b  = scanner.nextInt();
            System.out.println("enter cạnh c");
            int c  = scanner.nextInt();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
