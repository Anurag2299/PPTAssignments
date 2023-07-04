
// Given two strings word1 and word2, return *the minimum number of **steps** required to make* word1 *and* word2 *the same*.

// In one **step**, you can delete exactly one character in either string.

// **Example 1:**

// **Input:** word1 = "sea", word2 = "eat"

// **Output:** 2

// **Explanation:** You need one step to make "sea" to "ea" and another step to make "eat" to "ea".
package Assignment8th;

import java.util.Arrays;

public class Question3 {

    public int minDistance(String word1, String word2) {
        
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int[] row : dp) Arrays.fill(row, -1);
        
        for(int i = 0; i <= m; i++)
            dp[i][0] = i;
        
        for(int j = 0; j <= n; j++)
            dp[0][j] = j;
            
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i - 1) == word2.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1];
                else{
                    int deleteInS = dp[i - 1][j];
                    int deleteInT = dp[i][j - 1];
                    dp[i][j] = Math.min(deleteInS, deleteInT) + 1;
                }
            }
        }
        
        return dp[m][n];
    }

}