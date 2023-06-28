
// 💡 You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

// Count and return *the number of maximum integers in the matrix after performing all the operations*


package twoDArray4thAssignmects;

public class Question7 {
    public int maxCount(int m, int n, int[][] ops) {
        int k=ops.length;
        for (int i=0;i<k;i++)
        {
            int z=ops[i][0] ,x=ops[i][1];
            n=Math.min(n,x);
            m=Math.min(m,z);
        }
        return (m*n);
    }
}
