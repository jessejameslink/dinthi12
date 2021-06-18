package b_17Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhone {
    private static final String PHONE ="[(][0-9]{2}[)][-][(][0][0-9]{8}[)]";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        Pattern pattern = Pattern.compile(PHONE);
        while (true) {
            String a = scanner.nextLine();
            if (pattern.matcher(a).find()) {
                System.out.println("right");
                break;
            } else System.out.println("enter wrong phone, please enter again");
        }
    }
}
