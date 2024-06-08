package stack_and_queue;

import java.util.ArrayList;

public class stack_basic_2 {
    static class Stack{
        static ArrayList<String> arrayList = new ArrayList<>();

        public static boolean isEmpty(){
            return arrayList.isEmpty();
        }
        public static void push(String data){
            arrayList.add(data);
        }
        public static String pop(){
            if(isEmpty()){
                return "Stack is empty";
            }
            String s = arrayList.get(arrayList.size()-1);
            arrayList.remove(arrayList.size()-1);
            return s;
        }
        public static String peek(){
            if(isEmpty()){
                return "Stack is empty";
            }
            return arrayList.get(arrayList.size()-1);
        }
    }
    public static void main(String[] args) {
        // Using array list.
        Stack s2 = new Stack();
        System.out.println("Peek of stack : "+s2.peek());
        s2.push("Four");
        s2.push("Three");
        s2.push("Two");
        System.out.println("Peek of stack : "+s2.peek());
        s2.push("One");
        System.out.println("Removing one element from peek : "+s2.pop());
        System.out.println("Peek of stack : "+s2.peek());
        s2.push("One");

        System.out.println("All the elements of stack: \n");
        while (!s2.isEmpty()){
            System.out.println(s2.peek());
            s2.pop();
        }
        System.out.println();
        System.out.println("Is the stack Empty ? "+s2.isEmpty());

    }
}
