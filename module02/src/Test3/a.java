package Test3;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            try {
                System.out.println("enter name");
                int value = scanner.nextInt();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
