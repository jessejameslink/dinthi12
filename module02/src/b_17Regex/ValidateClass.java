package b_17Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS ="[ACP][0-9]{4}[GHIKLM]";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter");
        Pattern pattern = Pattern.compile(CLASS);
        while (true) {
            String a = scanner.nextLine();
            if (pattern.matcher(a).find()) {
                System.out.println("right");
                break;
            } else System.out.println("enter wrong class, please enter again");
        }
    }
}
