// Given a sorted array of distinct integers and a target value, return the index if the
// target is found. If not, return the index where it would be if it were inserted in
// order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2
package Array3rdAssignments;

public class Qusetion4 {
        public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;      
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                l = mid+1;
            } else {
                r = mid-1;
            }
        }
        return l;
    }
}
