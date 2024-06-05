package array_week_1;

public class arrayTask {
    public static void main(String[] args) {
        // Output Need
        //  0 1 2 3 4
        //  5 6 7 8 9
        //  10 11 12 13 14
        //  15 16 17 18 19

        int [][] twoDArray = new int [4][5];

        int count =0;

        // Data storing
        for(int row =0; row < twoDArray.length ; row++){
            for(int col =0; col < twoDArray[0].length ; col++){
                twoDArray[row][col] = count;
                count++;
            }
        }
        // Printing
        System.out.println("Print");
        for(int row =0; row < twoDArray.length ; row++){
            for(int col =0; col < twoDArray[0].length ; col++){
                System.out.print(twoDArray[row][col]+"\t");
            }
            System.out.println();
        }
        count = 0;
        System.out.println("Another 2d Array");
        //---------------------------------------------------------------
        // Output Need
        //  0
        //  1 2
        //  3 4 5
        //  6 7 8 9
                                            // ***
        int [][] numbers = new int [4][];   // without col initialization is accepted but only col initialization is not.

        for (int row = 0; row < numbers.length; row++){
            numbers[row] = new int[row+1];
        }                                   // in this way you can add cols.

        for(int row =0; row < numbers.length ; row++){
            for(int col =0; col < numbers[row].length ; col++){
                numbers[row][col] = count;
                count++;
            }
        }

        System.out.println("Print");
        for(int row =0; row < numbers.length ; row++){
            for(int col =0; col < numbers[row].length ; col++){
                System.out.print(numbers[row][col]+"\t");
            }
            System.out.println();
        }

    }
}
