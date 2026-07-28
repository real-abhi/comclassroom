import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        //Linear Search in Strings
        //String is an array of characters
        String name = "Abhilasha";
        char target = 'g';
        System.out.println(Arrays.toString(name.toCharArray()));
        //toCharArray() is a method which creates an array of characters of a string.
        System.out.println(search(name,target));
    }

    static boolean search2(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        //for-each loop
        //using toCharArray() method
        for(char ch: str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
