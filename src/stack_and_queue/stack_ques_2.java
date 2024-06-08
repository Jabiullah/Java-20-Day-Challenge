package stack_and_queue;

import java.util.ArrayList;
import java.util.Stack;

public class stack_ques_2 {
    // reverse a stack using O(1) space complexity
    static class Stack{

        ArrayList<Integer> arrayList = new ArrayList<>();

        public boolean isEmpty(){
            return arrayList.isEmpty();
        }
        public void push(int data){
            arrayList.add(data);
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty.");
                return -1;
            }
            return arrayList.remove(arrayList.size()-1);
        }

        public void reverse(){
            int i = 0;
            int j = arrayList.size()-1;
            while (i<j){
                int temp = arrayList.get(i);
                arrayList.set(i,arrayList.get(j));
                arrayList.set(j,temp);
                i++;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(1000);

        System.out.println(stack.arrayList);

        System.out.println("Popped element : "+stack.pop());

        System.out.println("Reverse function.");
        stack.reverse();
        System.out.println("Reversed stack : "+ stack.arrayList);
    }
}
