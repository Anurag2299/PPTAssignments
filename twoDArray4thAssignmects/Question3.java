
// 💡 Given a 2D integer array matrix, return *the **transpose** of* matrix.

// The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

// **Example 1:**

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

// Output: [[1,4,7],[2,5,8],[3,6,9]]

package twoDArray4thAssignmects;

public class Question3 {
        public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int [][] res = new int[col][row];

        for(int i= 0; i<col; i++){
            for (int j = 0; j<row; j++){
                res[i][j] = matrix[j][i];
            }
        }

        return res;
        
    }
}
