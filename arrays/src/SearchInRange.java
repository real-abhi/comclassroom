public class SearchInRange {
    public static void main(String[] args) {
        int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = -3;
        System.out.println(linear_Search(nums,target,1, 4));
    }

    static int linear_Search(int[] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            //check for element at every index if it = target
            int element = arr[i];
            if(element == target){
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target not found
        return -1;
    }
}
