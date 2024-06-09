package stack_and_queue_week_2;

public class stack_basic {

    static class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        public static Node head; // single head.
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(String data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            // Easy approach.Because whenever is new data inputting on stack head will be the last one.
            newNode.next = head;
            head = newNode;
        }
        public static String pop(){
            if(isEmpty()){
                return "Stack is empty";
            }
            String data = head.data;

            head = head.next; // new head is head next.
            return data;
        }
        public static String peek(){
            if(isEmpty()){
                return "Stack is empty";
            }
            String data = head.data;
            return data;
        }

    }
    public static void main(String[] args) {
        // Last in Fast Out - LIFO

        // Push - Top in the stack
        // Pop  - Remove from the top.
        // Peek - Top element from stack

        // Using Linked List.

        Stack s1 = new Stack();
        System.out.println("Current Peek of stack: "+s1.peek());
        s1.push("A");
        System.out.println("Current Peek of stack: "+s1.peek());
        s1.push("AN");
        s1.push("THE");
        System.out.println("Remove one element from top: "+s1.pop());
        System.out.println("After removing one element Peek of stack: "+s1.peek());
        s1.push("THE");
        int size = 0;
        while (!s1.isEmpty()){
            System.out.println("Stack All element Pop: "+s1.pop());
            size++;
        }
        System.out.println("\nStack size was : "+size);

    }
}
