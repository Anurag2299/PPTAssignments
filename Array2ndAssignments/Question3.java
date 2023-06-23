// We define a harmonious array as an array where the difference between its maximum value
// and its minimum value is exactly 1.

// Given an integer array nums, return the length of its longest harmonious subsequence
// among all its possible subsequences.

// A subsequence of an array is a sequence that can be derived from the array by deleting some or no elements without changing the order of the remaining elements.

// Example 1:
// Input: nums = [1,3,2,2,5,2,3,7]
// Output: 5

// Explanation: The longest harmonious subsequence is [3,2,2,2,3].
package Array2ndAssignments;

import java.util.Arrays;

public class Question3 {
    class Solution {
        public int findLHS(int[] nums) {
            Arrays.sort(nums);
            int count=0;
            int i=0, j=1;
            
            while(j<nums.length){
                if(nums[j] - nums[i]==1){
                    count = Math.max(count, j - i + 1);
                    j++;
                }
                else if(nums[j] - nums[i]==0){
                    j++;
                }
                else{
                    i++;
                }
               
            }
            return count;
        }
}
