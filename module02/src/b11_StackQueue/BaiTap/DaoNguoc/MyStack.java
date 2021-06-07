package b11_StackQueue.BaiTap.DaoNguoc;


import java.util.Stack;

public class MyStack {
    static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
    }

    static void stackPop(Stack<Integer> stack) {
        System.out.println("in");

        for (int i = 0; i < 5; i++) {
            int y = stack.pop();
            System.out.println(y);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stackPush(stack);
        stackPop(stack);
    }
}
