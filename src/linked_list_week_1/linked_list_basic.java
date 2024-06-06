package linked_list_week_1;

public class linked_list_basic {
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

    // add first
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head; // new node will point to the current head
        head = newNode;      // current head will change to new node.
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
    public void print(){
        Node currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println();
        System.out.println("Linked List Current Size: "+size);
    }
    public int getSize(){
        return size;
    }

    public void firstRemove(){
        Node currentNode = head;
        size--;
        if(head==null){
            System.out.println("Linked List is empty.");
            return;
        }
        head = currentNode.next;

    }
    public void lastRemove(){
        Node currentNode = head;
        size--;
        if(head==null){
            return;
        }
        if(head.next==null){ // there is a corner case that
                            // if my linked list has "only one element" then
                            // while loop wouldn't execute at all.
                            // That's why I have done this.
            head = null;
            size--;
            return;
        }

        while (currentNode.next.next != null){
            currentNode = currentNode.next;
            // before the 2nd last we just move the current Node
        }
        currentNode.next = null;

        // 2nd last to null point.
    }


    public static void main(String[] args) {
        linked_list_basic linked_list_basic = new linked_list_basic();
        // add operation
        // Either add first , neither add last
        linked_list_basic.addFirst("This is Prottoy.");

        //Print the first.
        System.out.println("Print List: ");
        linked_list_basic.print();
        System.out.println();

        linked_list_basic.addLast("Spring Boot next Target.");
        // Print linked list last.
        System.out.println("\nAdded on Last: ");
        linked_list_basic.print();

        //
        System.out.println();
        System.out.println("\nRemoved head Element: ");
        linked_list_basic.firstRemove();
        linked_list_basic.print();

        linked_list_basic.addFirst("This is Jabiullah.");
        linked_list_basic.addLast("Delete this One!!");
        System.out.println();
        System.out.println();
        linked_list_basic.print();

        // Remove last element
        System.out.println();
        System.out.println("\nRemoved last Element: ");
        linked_list_basic.lastRemove();
        linked_list_basic.print();

        //
        System.out.println("==========================================");
        System.out.println("At the end size: "+linked_list_basic.size);
    }
}
