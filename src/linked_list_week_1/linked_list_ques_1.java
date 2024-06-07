package linked_list_week_1;

import java.util.Scanner;

public class linked_list_ques_1 {
    // Question 1: nth node from last & delete nth node
    //
    Node head;
    private int size = 0;

    class Node{

        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addElement(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node current = head;

        while (current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void print(){
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.print("Null.");
    }
    public int getSize(){
        return size;
    }

    public void find_remove(int index){
        int target = size - index;

        Node current = head;
        Node prev = head;

        while (target !=0){
            prev = current;
            current = current.next;
            target--;
        }
        prev.next = current.next;

    }


    public static void main(String[] args) {
        linked_list_ques_1 l5 = new linked_list_ques_1();
        l5.addElement("AA");
        l5.addElement("BB");
        l5.addElement("CC");
        l5.addElement("DD");
        l5.addElement("EE");
        l5.addElement("FF");

        l5.print();
        System.out.println("\n");
        System.out.println("Linked List size: "+l5.getSize());
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input nth index value for removing data from last ");
        int index = sc.nextInt();

        if(index>l5.getSize()){
            System.out.println("It is not possible to delete "+index+"-th data. Because your expectation is greater than size. ");
            return;
        }
        l5.find_remove(index);
        System.out.println("After successfully remove");
        l5.print();
    }
}
