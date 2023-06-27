// Given an integer array nums of length n and an integer target, find three integers
// in nums such that the sum is closest to the target.
// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

// Example 1:
// Input: nums = [-1,2,1,-4], target = 1
// Output: 2

// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
package Array3rdAssignments;

import java.util.Arrays;

public class Question1 {
    
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int res =0;
        Arrays.sort(nums);
        int minDistance =Integer.MAX_VALUE;
        for(int i =0; i< n-2; i++) {
            int j=i+1,k=n-1;
            while(j<k){
                int sum = nums[j] + nums[k] + nums[i];
                if(Math.abs(minDistance)> Math.abs(target-sum)){
                    minDistance = target-sum;
                    res = sum;
                }
                if(sum < target){
                    j++;
                }else{
                    k--;
                }

            }
        }
        return res;
    }
}
