public class Problem2 {

    /*
    Describe your algorithm here in up to 5 sentences:
    My algorithm essentially sees if two values in an array of index i and i+1 are different, and if so it uses
    the "unique" counter as an index for the differing value and then increments unique. Unique will never be more than
    i+1, meaning that the replacement of the value will not ever affect the result of the integer removal (the
    replacement occurs after nums[i] and nums[i+1] are compared, so that even if nums[unique] = nums[i+1] it won't
    affect the results).I also used an if statement in the case that the array is of length 1, in which case my
    code would return an exception.
     */

    // Do not change signature (function name, parameters and return type)
    // Do not use extra space for another array. Solution to be in-pace with O(1) extra memory
    public static int remove(int[] nums) {
        int unique = 1;
        if (nums.length == 1){
            return unique;
        }
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                nums[unique] = nums[i+1];
                unique++;
            }
        }
        return unique; // place holder
    }
}
