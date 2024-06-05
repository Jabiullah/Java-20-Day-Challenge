package array_week_1;
import java.util.ArrayList;
import java.util.Iterator;
public class arrayList {
    public static void main(String[] args) {
        // Diff of array and ArrayList

        // 1. array size is fixed , ArrayList size is dynamic.
        // 2. array (for + for each) , ArrayList (for each and Iterator)

        // ***
        // Arraylist is slower and array is faster.

        // add function
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i =0; i<5; i++){
            arrayList.add(i*10);
        }
        arrayList.add(5,50);

        // easy to print.
        System.out.println(arrayList);

        System.out.println("Using for each: ");
        // for each
        for (int i: arrayList){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Using iterator: ");

        // Iterator
        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        // removing element
        arrayList.remove(0);
        System.out.println("\nAfter Removing 0th value: ");
        System.out.println(arrayList);

        // removing all elements       TM O(n^2) , Higher overhead
        // Can also clear() method.    TM O(n) , Lower overhead

//        System.out.println("All data removed: ");
//        arrayList.clear();
//        System.out.println(arrayList);

//        arrayList.removeAll(arrayList);
//        System.out.println(arrayList);

        System.out.println("is array list empty ? "+arrayList.isEmpty());

        System.out.println("Does this array list have 30 ? "+arrayList.contains(30));

        System.out.println("Where is the 30 (value) index ? \nAns. "+arrayList.indexOf(10)); // here index start from 0.

        // Inserted 101 at 0th position then what will happen the rest of the array list ?
        // 0th data is erased and new data is placed at 0th position.
        // (Replace work)         +  Already existed data replace.

        System.out.println("I have added 0th position 101 value.");
        arrayList.set(0,101);
        System.out.println(arrayList);

    }
}
