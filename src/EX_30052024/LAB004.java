package EX_30052024;

import java.util.Stack;

public class LAB004 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.add("D");
        System.out.println(stack);
//        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
