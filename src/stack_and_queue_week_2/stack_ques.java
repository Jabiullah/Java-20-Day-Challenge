package stack_and_queue_week_2;

import java.util.ArrayList;

public class stack_ques {
    public static void main(String[] args) {
        // Adding element on the bottom of the stack

        // Implicit Stack : That stack we don't usually create.
        // Explicit Stack : Usually we created by hard code.

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(100);
        arrayList.add(90);
        arrayList.add(80);
        arrayList.add(70);
        arrayList.add(60);

        System.out.println(arrayList);
        System.out.println("Now I want to add 110 before 100.\nCurrent bottom is 100 now change the bottom with 110.");
        int i = arrayList.size();
        System.out.println("Size of arrayList : "+i);
        arrayList.add(i,arrayList.get(i-1));
        i--;
        while (i!=0){
            arrayList.set(i,arrayList.get(i-1));
            i--;
        }
        arrayList.set(0,110);
        System.out.println(arrayList);
    }
}
