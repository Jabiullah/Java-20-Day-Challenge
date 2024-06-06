package linked_list_week_1;

public class linked_list_m {
    Node head;
    private int size = 0;

    class Node{ // Node is represented as 'Class'.
        String data; // DataType and data.
        Node next;
        Node(String data){
            this.data = data;
            this.next = null; // Next is byDefault null for all.
            size++;
        }
    }
    // add last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while (currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode; // last node will point current node and
        // current next is by default null.
    }
    public void addMiddle(int index, String data){
        Node newNode = new Node(data);
        Node currentNode = head;
        Node prevNode = head;

        if(head == null){ // if no element in the linked list
            head = newNode;
            return;
        }

        while (index!=1){
            index--;
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        prevNode.next = newNode;
        newNode.next = currentNode;
    }
    public void print(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
        System.out.println("Linked List [Current Size]: "+size);
    }

    public static void main(String[] args) {
        linked_list_m linkedListM = new linked_list_m();

        linkedListM.addLast("What");
        linkedListM.addLast("Why");
        linkedListM.addLast("Who");
        linkedListM.addLast("Whom");
        linkedListM.addLast("Which");
        linkedListM.addLast("HOW");

        linkedListM.print();
        System.out.println("\n\nI want to add 2th position -> ? ");
        linkedListM.addMiddle(2, "?");
        linkedListM.print();

    }
}
