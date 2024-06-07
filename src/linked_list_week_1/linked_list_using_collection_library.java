package linked_list_week_1;
import java.util.LinkedList;

public class linked_list_using_collection_library {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("One");
        linkedList.add("Five");
        linkedList.add("Ten");
        linkedList.add("Fifteen");

        System.out.println("Using collection library : "+linkedList);
        System.out.println("Size : " +linkedList.size());

        linkedList.remove();
        System.out.println("After remove() [It will remove first in First out way] : "+linkedList);

        linkedList.remove(0);
        System.out.println("After remove(0th index) : "+linkedList);

        linkedList.removeFirst();
        System.out.println("After removeFirst() : "+linkedList);

        System.out.println();
        linkedList.removeLast(); // Though currently there is left only one element.
        System.out.println("After removeLast() : "+linkedList);


        linkedList.add("One");
        linkedList.add("Five");
        linkedList.add("Ten");
        linkedList.add("Fifteen");

        // *** You must have to add index using the size value by 1 decrease. (Used As Replace)
        // Otherwise, you will get IndexOutOfBound Exception.

        linkedList.set(3,"Twenty");
        System.out.println("Using set(index, value) method [For Replace]: "+linkedList);

        System.out.println();
        System.out.println("Does linked list contain 'Ten' -> Using contains.method : "+linkedList.contains("Ten"));

        //*** same as set() method
        // You can only share index by 1 increment.

        //*** You can also this method for 'set'.

        System.out.println();
        linkedList.add(4,"Hundred");
        System.out.println("Using add(index, value) : "+linkedList);

    }
}
