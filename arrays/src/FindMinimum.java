public class FindMinimum {
    public static void main(String[] args) {
        int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
        System.out.println(min(nums));
    }

    //assume arr.length !=0
    //return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];   //we assumed first elt to be minimum in array
        for (int i = 1; i < arr.length ; i++) {  //and then compare that elt with other elts to find minimum.
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}

