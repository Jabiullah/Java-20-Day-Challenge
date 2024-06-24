package hash_week_3;
import java.util.HashSet;
import java.util.Iterator;
public class hashSet {
    // HashSet - (Unordered)
    // (***) Set : Does not contain any duplicate element.

    // Time Complexity is the best Thing for HashSet.

    // Comparison with Array, Sorted Array, BST , Hash Set
    // ---------------------------------------------------
    // Insert          O(1)  - O(n)       - O(h) - O(1)
    // Search          O(n)  - O(log n)   - O(h) - O(1)
    // Delete          O(n)  - O(n)       - O(h) - O(1)

    public static void main(String[] args) {
        // Creation
        HashSet<Integer> set = new HashSet<>();
        // Similar with 'ArrayList'

        set.add(1);
        set.add(10);
        set.add(12);
        set.add(9);

        // Search
        System.out.println("Does 1 exist ?\nAns. "+set.contains(1));
        System.out.println("Does 100 exist ?\nAns. "+set.contains(100));

        //Delete
        System.out.println();
        System.out.println("Removed '1' Data - "+set.remove(1));
        System.out.println("After delete, Does 1 exist ?\nAns. "+set.contains(1));

        // Print the data using foreach
        System.out.println("HashSet current elements -");
        for (int i:set){
            System.out.println(i);
        }
        System.out.println("HashSet Size : "+set.size());

        System.out.println("Direct Print : "+set);

        // Iterator in HashSet
        System.out.println("Using Iterator Print : ");
        Iterator it = set.iterator();
        // Two important function. hasNext and next
        while (it.hasNext()){
            System.out.println(it.next()); // Automatically it++ work has done
        }


    }
}
