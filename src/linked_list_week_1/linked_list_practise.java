package linked_list_week_1;

public class linked_list_practise {
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
        Node newElement = new Node(data);

        if(head == null){
            //System.out.println("Initially List was empty.");
            head = newElement;
            return;
        }

        Node currentNode = head;

        while(currentNode.next!=null){
            currentNode = currentNode.next;
        }

        currentNode.next = newElement;
    }
    public void print(){
        Node currentNode = head;
        if(head==null){
            System.out.println("Linked List is empty.");
        }
        while (currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.print("Null.");
        System.out.println();
        System.out.println("Size of Linked List : "+size);;
    }
    public void reverseLinkedList(){
        if(head==null){
            System.out.println("Empty Linked List.");
            return;
        }
        if(head.next==null){
            System.out.println("For one element No Need to reverse the linked list.");
            return;
        }

        Node prev = head;
        Node curr = prev.next;

        while(curr!=null){

            Node nxt = curr.next;
            curr.next = prev; // reverse here

            prev = curr;       // Update the three pointer
            curr = nxt;
        }
        // removing the extra link
        head.next = null;
        head = prev;    // Previous 'Node' is your new head.
    }

    public static void main(String[] args) {
        linked_list_practise l4 = new linked_list_practise();
        l4.print();

        l4.addElement("0ne");
        l4.addElement("Four");
        l4.addElement("Five");
        l4.addElement("Ten");
        l4.addElement("Eleven");
        l4.addElement("Twenty");

        l4.print();

        l4.reverseLinkedList();

        l4.print();
    }
}
