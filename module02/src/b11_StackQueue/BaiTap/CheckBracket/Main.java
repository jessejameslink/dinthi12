package b11_StackQueue.BaiTap.CheckBracket;

import java.util.Stack;

public class Main {
    static boolean check(Stack<Character> stack, String str) {
        char[] result;
        result = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (result[i] == '(') {
                stack.push(result[i]);
            } else if (result[i] == ')') {
                if (stack.empty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.empty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "s * (s – a) * s – b) * (s – c)   ";
        System.out.println(check(stack,str));
    }


}



