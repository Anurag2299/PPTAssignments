
// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

// **Example 1:**

// **Input:** s = "abcdefg", k = 2

// **Output:**

// "bacdfeg"

package Assignment7th;

public class Question5 {
    public String reverseStr(String s, int k) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(len);

        for (int m = 0; m < len; m += 2*k) {
            int p = Math.min(m + k, len);
            StringBuilder rev = new StringBuilder(s.substring(m, p));
            rev.reverse();
            sb.append(rev);
            int rem = Math.min(m + 2*k, len);
            sb.append(s.substring(p, rem));
        }
        return sb.toString();
    }
}
