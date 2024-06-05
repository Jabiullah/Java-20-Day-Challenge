package array_week_1;

import java.util.Scanner;

public class arrayBasic {
    public static void main(String[] args) {

        // Array, Class, Interface are non-primitive data types. That's why we use 'new' operator.


        // DataType [] array Name ;
        int [] nums;                //  Declaration
        nums = new int[5];         // Creation

        int [] numbers = new int[5]; // Declaration & Creation

        int len = nums.length;      // Array length

        System.out.println(nums[0]);
        // Based on array data type you will get empty index value. For here you will get 0.

        //-------------------------------------------------------------------------------------------------------
        Scanner sc = new Scanner(System.in);

        double[] input_numbers = new double[5];

        System.out.println("Enter 5 numbers");

        // for each syntax

        // for (Data_type variable name : Array_name){
        //      ....
        // }

        // **** (start from JDK 1.5)
        // but you can not use for each loop here to get the value from users. Because
        // a for-each loop in Java iterates over elements that are already present in the array.

        double sum = 0;

        for(int a=0; a<input_numbers.length;a++){
            input_numbers[a] = sc.nextDouble();
            sum = sum+input_numbers[a];
        }
        System.out.println("Sum of 5 elements "+sum);

        //-------------------------------------------------------------------------------------------------------
        double max = input_numbers[0];
        double min = input_numbers[0];

        for(double d: input_numbers){
            if(max<d){
                max = d;
            }
            if(min>d){
                min = d;
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);


    }
}
