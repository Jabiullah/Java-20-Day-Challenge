package array_week_1;

import java.util.Scanner;

public class arrayCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] number = new int[3][3];
                             //[row][col]
        // total NO. of elements = row * col

        System.out.println("Input numbers for 2 row 3 col array");

        for(int row =0; row<number.length; row++){
            for(int col=0; col<number[0].length; col++){
                number[row][col] = sc.nextInt();
            }
        }
        System.out.println("Print");
        for(int row =0; row<number.length; row++){
            for(int col=0; col<number[0].length; col++){
                System.out.print(number[row][col]+" ");
            }
            System.out.println();
        }
        //-----------------------------------------------------------------------------
        //Diagonal Matrix , Upper triangle , lower triangle
        int sumOfDiagonal = 0;
        int sumOfUpperTriangle = 0;
        int sumOfLowerTriangle = 0;
        for(int row =0; row<number.length; row++){
            for(int col=0; col<number[0].length; col++){
                if(row==col){
                    sumOfDiagonal += number[row][col];
                }
                if(row < col){  // suppose row is 0 and col is 1 then this element is definitely to the 'Upper Triangle'.
                    sumOfUpperTriangle += number[row][col];
                }
                if(row > col){
                    sumOfLowerTriangle += number[row][col];
                }
            }
        }

        System.out.println("Sum of Diagonal : "+sumOfDiagonal);
        System.out.println("Sum of Upper Triangle : "+sumOfUpperTriangle);
        System.out.println("Sum of Lower Triangle : "+sumOfLowerTriangle);

    }


}
