package stack_and_queue_week_2;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queue_basic {
    // FIFO
    // First in first out.
    // Simple example : Bazaar Line

    // Enqueue - Add
    // Dequeue - Remove
    // Front   - Peek

    // Using Collection Framework
    // ****
    // Queue interface not a class. [With the Two class help. They are ArrayDeque and LinkedList.]

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");

        Stack<String> stack = new Stack<>();
        stack.add("One");
        stack.add("Two");
        stack.add("Three");
        stack.add("Four");
        stack.add("Five");

        System.out.println("After adding 5 elements on queue and stack.");
        System.out.println("Queue : "+queue);
        System.out.println("Stack : "+stack);
        System.out.println();
        System.out.println("First element pop from queue : "+ queue.peek()+ queue.remove() +"\nand remaining queue: "+queue);

        System.out.println();
        System.out.println("First element pop from stack : "+ stack.peek()+ stack.pop() +"\nand remaining queue: "+stack);

    }
}
