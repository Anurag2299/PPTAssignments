// 💡 Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

// **Example 1:**

// Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

// Output: [1,5]

// **Explanation:** Only 1 and 5 appeared in the three arrays.

package twoDArray4thAssignmects;

import java.util.ArrayList;
import java.util.List;

public class Question1 {
    

    public static int[] commonElemnt(int[] a1, int[] a2, int [] a3){
        int lena1 = a1.length;
        int lena2 = a2.length;
        int lena3 = a3.length;
        List<Integer> res = new ArrayList<Integer>(); 

        int i=0,j=0,k=0;
        
        while(i<lena1 && j<lena2 && k<lena3) {
            if(a1[i]==a2[j] && a2[j]==a3[k]) {
                res.add(a1[i]);
                i++;j++;k++;
            } else if(a1[i] < a2[j]) {
                i++;
            } else if(a2[j] < a3[k]) {
                j++;
            } else {
                k++;
            }
        }

        int[] arr = new int[res.size()];
 
        for (int l = 0; l < res.size(); l++)
            arr[l] = res.get(l);


        return arr;
    }
}
