// Given an integer array nums, find three numbers whose product is maximum and return the maximum product.

// Example 1:
// Input: nums = [1,2,3]
// Output: 6
package Array2ndAssignments;

import java.util.Arrays;

public class Question5 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return Math.max(nums[0]*nums[1]*nums[len-1],nums[len-3]*nums[len-2]*nums[len-1]);
    }
}
