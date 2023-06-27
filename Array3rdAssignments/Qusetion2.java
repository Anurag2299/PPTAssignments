// Given an array nums of n integers, return an array of all the unique quadruplets
// [nums[a], nums[b], nums[c], nums[d]] such that:
//            ● 0 <= a, b, c, d < n
//            ● a, b, c, and d are distinct.
//            ● nums[a] + nums[b] + nums[c] + nums[d] == target

// You may return the answer in any order.

// Example 1:
// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
package Array3rdAssignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Qusetion2 {
        public List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> res = new ArrayList<>();
            if(nums.length < 4){
                return res;
            }
            Set<List<Integer>> set = new HashSet<>();
            Arrays.sort(nums);
            int len = nums.length;
            
            for(int i =0 ;i < len-3;i++){
                for(int j =i+1 ;j < len-2;j++){
                    int left = j+1, right= len-1;
                    while(left< right){
                        long sum = (long) nums[i]+nums[j]+nums[left]+nums[right];
                        if(sum == target) {
                            set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        }
                       if(sum > target) {
                           right--;
                       } else {
                           left++;
                       }
                    }
            }
            
        }
        for(List<Integer> l: set){
            res.add(l);
        }
        return res;
        }
}
