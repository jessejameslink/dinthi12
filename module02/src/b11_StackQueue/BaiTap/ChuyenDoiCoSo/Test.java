package b11_StackQueue.BaiTap.ChuyenDoiCoSo;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String str2="";
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("enter decimal");
        int number = scanner.nextInt();
        while (number != 0) {
            int num = number % 16;

             str2 = hex[num]+str2;
            number /= 16;
        }
        System.out.println("value binary");
        System.out.println(str2);


    }
}
