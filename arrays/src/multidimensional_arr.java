import java.util.Arrays;
import java.util.Scanner;

public class multidimensional_arr {
    public static void main(String[] args) {
        //input of 2-D array
//        Scanner in = new Scanner(System.in);
        //creation of array -> here column of array is fixed and below is the example not column not fixed
        int[][] arr = new int[3][3];
//        System.out.println("The size of this 2-D arr is: " + arr.length);  //arr.length tells the no.of rows in the arr

        //input
//        for (int row = 0; row < arr.length; row++) {     // for each row
//            //for each col in every row
//            for (int col = 0; col< arr[row].length; col++){
//                arr[row][col] = in.nextInt();
//            }
//        }

        //Output methods
//        for (int row = 0; row < arr.length; row++) {     // for each row
//            //for each col in every row
//            for (int col = 0; col< arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        //2nd output method to print 2D array
//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //3rd output method to print 2D array
//        for(int[] a : arr){    //every single element of an array is itself an array
//            System.out.println(Arrays.toString(a));
//        }

        //COLUMN NOT FIXED example
        int[][] arr1 = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };

        for(int row = 0; row < arr1.length; row++){
            for (int col = 0; col<arr1[row].length; col++) {
                System.out.print(arr1[row][col] + " ");
            }
            System.out.println();
        }


    }
}
