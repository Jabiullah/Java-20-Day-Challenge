package stack_and_queue;

import java.util.Stack;

public class stack_basic_3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Is stack empty ? "+stack.empty());
        stack.push(10);
        System.out.println("After adding 1st element (current Peek) : " +stack.peek());
        stack.push(9);
        stack.push(8);
        stack.push(7);
        stack.push(6);
        stack.push(5);
        stack.push(4);

        System.out.println("Peek : " +stack.peek());
        System.out.println("Printing All the stack data : ");
        while (!stack.empty()){
            System.out.println(stack.pop());
        }
        System.out.println("Is stack empty ? "+stack.empty());

    }
}
