import java.util.Arrays;
import java.util.Scanner;

public class Arrays_practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            //System.out.print(arr[i] + " ");
        }
        System.out.println(Arrays.toString(arr));    //toString method in array class to print arrays directly

            //for-each loop
//            for (int num : arr) {   //for every element in array, print the element
//                System.out.print(num + " ");   //here num represents element of the array
//            }

        //Array of objects
//        String[] str = new String[4];
//        for (int i = 0; i < str.length; i++) {
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));


    }
}