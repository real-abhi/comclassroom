import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        //1-D Array list
        Scanner in = new Scanner(System.in);
//        ArrayList <Integer> list = new ArrayList<>(10);
//        for(int i = 0; i<5;i++){
//            list.add(in.nextInt());
//        }
//        System.out.println(list);
//
//        for(int i = 0; i<5;i++){
//            System.out.println(list.get(i));
//        }

        //MULTI_DIMENSIONAL ARRAYLIST
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();

        //initialisation
        for (int i =0; i<3; i++) {
            list1.add(new ArrayList<>());
        }
        //add elements
        for( int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                list1.get(i).add(in.nextInt());
            }
        }
        System.out.println(list1);
    }
}
