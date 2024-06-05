package array_week_1;

import java.util.Arrays;
import java.util.Collections;

public class sortArray {
    public static void main(String[] args) {
        int [] numbers = {1,0,-12, 13,45 , 10012, -1};
        // Using Arrays.sort [ time complexity (n log n) ]
        Arrays.sort(numbers);               // by default "ascending" order follows

        System.out.println("(Ascending Order) Arrays.sort -> "+Arrays.toString(numbers));

        // for reverse sort (we can direct use Collections framework. But on that case)
        // you have to use Wrapper class.
        // int is primitive. Int is wrapper class.

                                                                  // ***
        Integer [] nums = {1,0,-12, 13,45 , 10012, -1};           // int can not be null but Int can be null.
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println("(Descending Order) Arrays.sort -> "+Arrays.toString(nums));

    }
}
