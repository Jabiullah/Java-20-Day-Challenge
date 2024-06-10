package stack_and_queue_week_2;

public class queue_basic_2 {
    // Using fixed array in Queue
    static class Queue{
        static int nums[];
        static int size;
        Queue(int size){
            nums = new int[size];
            this.size = size;
        }
        static int front = -1; // It would be fixed at start
        static int rear  = -1; // It will shift forward.

        public static boolean isEmpty(){
            return rear ==-1;
        }
        // Add function
        public static void enqueue(int data){
            if (rear == size-1){
                System.out.println("Full enqueue.");
                return;
            }
            rear++;
            nums[rear] = data;
        }
        // Remove function
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is already empty.");
                return -1;
            }

            int front = nums[0]; // front is always 0-th index data.

            // Data is swapped. Time complexity O(n).
            for(int i=1; i<=rear;i++){
                nums[i-1] = nums[i];
            }
            rear--; // This is an important line.
            return front;
        }
        // peek function
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return nums[0];
        }

    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        System.out.println("Initial stage of Queue : Is queue empty ?\nAns."+queue.isEmpty());
        System.out.println("Initial peek of Queue : "+queue.peek());
        System.out.println("Data added 101. ");
        queue.enqueue(101);
        System.out.println("Data added 201.");
        queue.enqueue(201);
        System.out.println("After adding 2 value on queue, peek of Queue : "+queue.peek());

        System.out.println("Queue elements are in below: (without removing elements)");
        for (int i =0; i<=queue.rear; i++){
            System.out.print(queue.nums[i]+"->");
        }
        System.out.print("null.");
        System.out.println();

        System.out.println("Data added 301.");
        queue.enqueue(301);

        System.out.println("Queue elements are in below: ");
        for (int i =0; i<=queue.rear; i++){
            System.out.print(queue.nums[i]+"->");
        }
        System.out.print("null.");
        System.out.println();

        System.out.println("Data is removed from queue: "+queue.dequeue());

        System.out.println("After removing 101, peek of Queue : "+queue.peek());

        System.out.println("Queue elements are in below: ");
        for (int i =0; i<=queue.rear; i++){
            System.out.print(queue.nums[i]+"->");
        }
        System.out.print("null.");

    }
}
