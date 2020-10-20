public class Problem1 {
    /*
    Describe your algorithm here in up to 5 sentences:
    My solution follows what was shown in the video that was given as a hint, in that there is one "pointer" used to
    track the 0's on the left and another pointer used to track the 2's on the right. If nums[i] = 0, it is put to
    the most front value that isn't already a 0 and the left pointer increases, meaning that the next 0 will be
    replaced at index 1. On the right, it's the same concept, except the pointer that runs along the array must also
    be decreased by 1 to recheck the value that is replaced into nums[i], since nums[right] is an as of yet
    unprocessed value.

     */

    // Do not change signature (function name, parameters type, and return type)
    public static void colorSort(int[] nums) {
        int right = nums.length;
        int left = 0 ;
        int temp;
        for(int i = 0 ; i < right; i++){
            if(nums[i] == 0){
                temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            }
            else if(nums[i] == 2){
                temp = nums[i];
                nums[i] = nums[right - 1];
                nums[right - 1] = temp;
                i--;
                right--;
            }
        }
    }
}