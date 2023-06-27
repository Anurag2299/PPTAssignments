// You are given an inclusive range [lower, upper] and a sorted unique integer array
// nums, where all elements are within the inclusive range.

// A number x is considered missing if x is in the range [lower, upper] and x is not in
// nums.

// Return the shortest sorted list of ranges that exactly covers all the missing
// numbers. That is, no element of nums is included in any of the ranges, and each
// missing number is covered by one of the ranges.

// Example 1:
// Input: nums = [0,1,3,50,75], lower = 0, upper = 99
// Output: [[2,2],[4,49],[51,74],[76,99]]

// Explanation: The ranges are:
// [2,2]
// [4,49]
// [51,74]
// [76,99]

package Array3rdAssignments;

import java.util.ArrayList;
import java.util.List;

public class Question7 {
    public static void main(String[] args) {
        int [] a = {1,2,4,67,88};
        List<String> res = findMissingRanges(a,2,99);
        res.forEach((data) -> System.out.println(data));
    }

    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
        int n = nums.length;
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add(f(lower, upper));
            return ans;
        }
        if (nums[0] > lower) {
            ans.add(f(lower, nums[0] - 1));
        }
        for (int i = 1; i < n; ++i) {
            int a = nums[i - 1], b = nums[i];
            if (b - a > 1) {
                ans.add(f(a + 1, b - 1));
            }
        }
        if (nums[n - 1] < upper) {
            ans.add(f(nums[n - 1] + 1, upper));
        }
        return ans;
    }

    private static String f(int a, int b) {
        return a == b ? a + "" : a + "->" + b;
    }
}
