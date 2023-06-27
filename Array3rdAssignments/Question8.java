// Given an array of meeting time intervals where intervals[i] = [starti, endi],
// determine if a person could attend all meetings.

// Example 1:
// Input: intervals = [[0,30],[5,10],[15,20]]
// Output: false
package Array3rdAssignments;

import java.util.Arrays;

public class Question8 {

    public boolean merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int n = intervals.length;

        int end = intervals[0][1];
        for(int i =1; i< n; i++){
            if(intervals[i][0] <= end) {
                return false;
            }
        }
        return true;
    }
}
