package linked_list_week_1;

public class linked_list_ques_2 {
    // Question 2:
    // Linked List either Palindrome or not ?
    Node head;
    private int size;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addEle(String data){
        Node newNode = new Node(data);

        if (head==null){
            head = newNode;
            return;
        }
        Node currentNode = head;

        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }
    public void print(){
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null.");
        System.out.println();
    }
    public int getSize(){
        return size;
    }
    public Node reverse( Node getMiddle){
        Node prev = null;
        Node curr = getMiddle;
        if(head==null){
            System.out.println("Linked List is empty.");
            return head;
        }
        if (head.next==null){
            return head;
        }
        while (curr!=null){
            Node nxt = curr.next;

            curr.next = prev;
            // Update data
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    public Node middle(){
        int middle = 0;
        if(size%2==0){
            middle = size/2;
            middle--;
        }else{
            middle = size/2;
        }

        Node currentNode = head;
        while (middle!=0){
            currentNode = currentNode.next;
            middle--;
        }
        return currentNode;
    }

    public boolean isPalindrome(){
        // Case : Space O(1)
        // 1. check size of linked List
        // 2.
        if(head==null || head.next ==null){
            return true;
        }
        Node firstEnd  = middle();
        Node secondEnd = reverse(firstEnd);

        Node current = head;

        while (current!=null){
//            System.out.println("current Data "+ current.data);
//            System.out.println("Second Data "+ secondEnd.data);

            if(current.data != secondEnd.data){
                return false;
            }
            current = current.next;
            secondEnd = secondEnd.next;
        }
        return true;
    }

    public static void main(String[] args) {
        linked_list_ques_2 l7 = new linked_list_ques_2();

        l7.addEle("1");
        l7.addEle("2");
        l7.addEle("3");
        l7.addEle("7");
        l7.addEle("2");
        l7.addEle("1");

        l7.print();
        System.out.println("Size : "+l7.getSize());

        System.out.println("Is it palindrome ? \nAns : "+l7.isPalindrome());

    }
}
