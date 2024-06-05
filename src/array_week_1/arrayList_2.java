package array_week_1;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();

        // Data added
        for(int i= 0; i<5; i++){
            firstArrayList.add(i*10);
        }
        for(int i= 0; i<5; i++){
            secondArrayList.add(i*20);
        }

        System.out.println("First Arraylist : "+firstArrayList);
        System.out.println("Second Arraylist : "+secondArrayList);

        // addAll method (usually takes O(n) Time Complexity. BUT)
        // internally copy all the elements so its seems little faster.
        ArrayList<Integer> thirdArrayList = new ArrayList<>();
        thirdArrayList.addAll(firstArrayList);
        System.out.println("Third Array List: "+thirdArrayList);

        // --------------------------------------------------------------------------
        System.out.println();
        // equals() method
        System.out.println("Is first array list values are equal to second array list ? "+ firstArrayList.equals(thirdArrayList));


        // --------------------------------------------------------------------------
        System.out.println();
        // sorting Array list
        firstArrayList.set(0,100);
        firstArrayList.add(5,-90);

        System.out.println("Before Sorting :"+firstArrayList);
        Collections.sort(firstArrayList);
        System.out.println("After Sorting (ASC):" +firstArrayList);

        Collections.sort(firstArrayList, Collections.reverseOrder());
        System.out.println("After Sorting (DSC):" +firstArrayList);


    }
}
