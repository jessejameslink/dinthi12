package b11_StackQueue.BaiTap.ChuyenDoiCoSo;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("enter decimal");
        int number = scanner.nextInt();
        while (number!= 0){
            int num = number%2;
            stack.push(num);
            number/=2;
        }
        System.out.println("value binary");
        while (!(stack.isEmpty()))
        {
            System.out.print(stack.pop());
        }
    }
}
