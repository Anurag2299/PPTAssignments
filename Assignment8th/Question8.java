// Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

// Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

// - For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

// **Example 1:**

// **Input:** s = "ab", goal = "ba"

// **Output:** true

// **Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

package Assignment8th;

import java.util.ArrayList;

public class Question8 {

    
    public boolean buddyStrings(String s, String goal) {
        int ns = s.length();
        int ng = goal.length();
        
        if (ns != ng) {
            return false;
        }
        
        if (s.equals(goal)) {
            int[] farr = new int[26];
            for (char ch : s.toCharArray()) {
                farr[ch - 'a']++;
                if (farr[ch - 'a'] == 2) {
                    return true;
                }
            }
            return false;
        }
        
        ArrayList<Integer>ans=new ArrayList<>();
        for (int i = 0; i < ns; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
               ans.add(i);
                if (ans.size()> 2) {
                    return false;
                }
            }
        }
        
        return ans.size() == 2 && s.charAt(ans.get(0)) == goal.charAt(ans.get(1)) && s.charAt(ans.get(1)) == goal.charAt(ans.get(0));
    }
}
