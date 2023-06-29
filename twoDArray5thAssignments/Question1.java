// Convert 1D Array Into 2D Array

// You are given a **0-indexed** 1-dimensional (1D) integer array original, and two integers, m and n. You are tasked with creating a 2-dimensional (2D) array with  m rows and n columns using **all** the elements from original.

// The elements from indices 0 to n - 1 (**inclusive**) of original should form the first row of the constructed 2D array, the elements from indices n to 2 * n - 1 (**inclusive**) should form the second row of the constructed 2D array, and so on.

// Return *an* m x n *2D array constructed according to the above procedure, or an empty 2D array if it is impossible*.

package twoDArray5thAssignments;


public class Question1 {
        public int[][] construct2DArray(int[] original, int m, int n) {
        int [][] res = new int[m][n];
        int len = 0;
        if(m*n != original.length){
            return new int[0][0];
        }
            for(int j =0; j< m ; j++) {
                for(int k=0;k<n;k++){
                    res[j][k] = original[len];
                    len++;
                }
            }
        return res;
    }
}
