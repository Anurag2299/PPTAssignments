// <aside>
// 💡 A permutation of an array of integers is an arrangement of its members into a
// sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr:
// [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

// The next permutation of an array of integers is the next lexicographically greater
// permutation of its integer. More formally, if all the permutations of the array are
// sorted in one container according to their lexicographical order, then the next
// permutation of that array is the permutation that follows it in the sorted container.

// If such an arrangement is not possible, the array must be rearranged as the
// lowest possible order (i.e., sorted in ascending order).

// ● For example, the next permutation of arr = [1,2,3] is [1,3,2].
// ● Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// ● While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not
// have a lexicographical larger rearrangement.

// Given an array of integers nums, find the next permutation of nums.
// The replacement must be in place and use only constant extra memory.

// **Example 1:**
// Input: nums = [1,2,3]
// Output: [1,3,2]

// </aside>

package Array3rdAssignments;
public class Question3 {
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int k = n - 2;

        for(int i = n-1; i >= 1; i--){
            if(nums[k] < nums[i]){
                break;
            }else{
                k--;
            }
        }

        if(k == -1){
            reverse(nums, k+1, n-1);
            return;
        }

        for(int i = n - 1; i >= 0; i--){
            if(nums[i] > nums[k]){
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                break;
            }
        }

        reverse(nums, k+1, n-1);
    }
}
