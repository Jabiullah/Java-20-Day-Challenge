package stack_and_queue_week_2;

public class queue_basic_3 {
    //    Using linked list.
    //*** This is the most efficient way.
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }

    }
    static class Queue{
        static Node head = null; // Traditional Front
        static Node tail = null; // Rear

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        public static void add(int data){
            Node newNode = new Node(data);

            if(tail == null){ // if the current linked list is empty.
                head = tail = newNode;
                return;
            }
            // Insert will be rear = tail
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){ // no element in queue.
                System.out.println("Empty Queue.");
                return -1;
            }
            if(head.next==null){ // single element in queue
                tail = null;
            }
            int front = head.data;
            head = head.next;

            return front;
        }
        public static int peek(){
            if(isEmpty()){ // no element in queue.
                System.out.println("Empty Queue.");
                return -1;
            }
            return head.data;
        }


    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.add(12);
        queue.add(13);
        queue.add(15);

        System.out.println("Queue: ");
        while (!queue.isEmpty()){
            System.out.print(queue.peek()+" -> ");
            queue.remove();
        }
        System.out.print("null.");
        System.out.println();

        System.out.println("Queue is empty ?\nAns. "+queue.isEmpty());
        System.out.println("=========================================");
        System.out.println();

        queue.add(12);
        queue.add(13);
        queue.add(15);

        Node currentNode = queue.head;
        while (currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }

        System.out.print("null.");
        System.out.println();

        queue.remove();

        // again relocate the head
        currentNode = queue.head;
        System.out.println("after remove method call.");
        while (currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }

        System.out.print("null.");
        System.out.println();



    }
}
