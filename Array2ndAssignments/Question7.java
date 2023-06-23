// An array is monotonic if it is either monotone increasing or monotone decreasing.

// An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is
// monotone decreasing if for all i <= j, nums[i] >= nums[j].

// Given an integer array nums, return true if the given array is monotonic, or false otherwise.

// Example 1:
// Input: nums = [1,2,2,3]
// Output: true
package Array2ndAssignments;

public class Question7 {
        public boolean isMonotonic(int[] nums) {
            if(nums.length == 0){
                return true;
            }
            int i=0,j=1;
            int inc=0,dec=0;
            while(i <= nums.length-2 && j <= nums.length-1){
                if(nums[i] < nums[j]){
                    inc++;
                    i++;
                    j++;
                }
                else if(nums[i] > nums[j]){
                    dec++;
                    i++;
                    j++;
                }
                else{
                    i++;
                    j++;
                }
                if(inc > 0 && dec > 0){
                    return false;
                }
            }
            return true;
        }
}
