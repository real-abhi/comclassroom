public class linearSearch {
    public static void main(String[] args) {
        int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 199;
        boolean ans = linear_Search3(nums,target);
        System.out.println(ans);
    }

    //search in the ar ray: return the index if item found
    //otherwise if  itemm is not found return -1
    static int linear_Search(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //run for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it = target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }

        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }

    //search the target and return the element
    static int linear_Search2(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //run for loop
        for (int element : arr) {
            //check for element at every index if it = target
            if (element == target) {   //check for every element in arr and return the element
                return element;
            }
        }

        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return Integer.MAX_VALUE; //here -1 can be the element in the array therefore we're using this thing, if element not found!
    }

    //search the target and return true or false
    static boolean linear_Search3(int[] arr, int target){
        if(arr.length==0){
            return false;
        }

        //run for loop
        for (int element : arr) {
            //check for element at every index if it = target
            if (element == target) {   //check for every element in arr and return the element
                return true;
            }
        }

        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return false; //here -1 can be the element in the array therefore we're using this thing, if element not found!
    }

}
