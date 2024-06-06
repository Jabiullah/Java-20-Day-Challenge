package linked_list_week_1;

public class linked_list_reverse {
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
    public void reverse(){
        // Classical Approach
        // Using three pointers.
        // Prev -  Curr - Nxt
        Node prev = head;
        Node curr = head.next;

        if(head==null){
            System.out.println("Linked List is empty.");
            return;
        }
        if (head.next==null){
            System.out.println("Single node can not be reversed.");
        }

        while (curr != null) {
            Node nxt = curr.next;
            // Example
            //                     (Head)
            // Initial Linked list : 3 ->  4 ->  5-> Null.
            //                      prev  curr  nxt

            //  1. Update curr.next = PREV
            //  (After 1st step)
            //        Linked list : 3 <- -> 4   5-> Null.
            //                      prev   curr  nxt
            // 2. Now prev become current + Last curr become next
            //  (After 2nd step)
            //        Linked list : 3 <- -> 4 <- 5 -> Null.
            //                            prev  curr  next
            // 3. That extra link from 3 to 4 need to remove.

            // reverse
            curr.next = prev;

            // Update data
            prev = curr;
            curr = nxt;
        }
        //rule 3.
        head.next = null;
        head = prev;
    }
    public void print(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.println("null.");
        System.out.println("Linked List [Current Size]: "+size);
    }


    public static void main(String[] args) {
        linked_list_reverse l3 = new linked_list_reverse();

        l3.addLast("One");
        l3.addLast("Two");
        l3.addLast("Three");
        l3.addLast("Four");
        l3.addLast("Five");

        // Iterative approach.
        System.out.println("Initial List: ");
        l3.print();
        System.out.println("");
        System.out.println("Now reverse the List: ");
        l3.reverse();
        l3.print();
    }

}


















