// Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears **once** or **twice**, return *an array of all the integers that appears **twice***.

// You must write an algorithm that runs in O(n) time and uses only constant extra space.

package twoDArray5thAssignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question6 {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i <nums.length; i++) {
            if(set.contains(nums[i])){
                list.add(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }

        return list;
    }
}
