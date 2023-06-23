// You have a long flowerbed in which some of the plots are planted, and some are not.
// However, flowers cannot be planted in adjacent plots.
// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

// Example 1:
// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true

package Array2ndAssignments;

public class Question4 {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {
             int i = 0;
             int sumZero = 0;
             int places = 0;
             if (flowerbed.length == 1) {
                 if (flowerbed[0] == 0) {
                     return n <= 1;
                 }
             }
     
             if (flowerbed[0] == 0 && flowerbed[1] == 0) {
                 flowerbed[0] = 1;
                 places++;
             }
             if (flowerbed.length >= 3 && flowerbed[flowerbed.length - 1] == 0
                     && flowerbed[flowerbed.length - 2] == 0) {
                 flowerbed[flowerbed.length - 1] = 1;
                 places++;
             }
             for (int j = 0; j < flowerbed.length; j++) {
                 if (flowerbed[j] == 1) {
                     sumZero = sumZerosBetweenTwoOnes(i, j, flowerbed);
                     if (sumZero % 2 != 0) {
                         places += sumZero / 2;
                     } else {
                         places += (sumZero - 1) / 2;
                     }
                     i = j; //make j to be the i for the next operation. 
                 }
             }
     
             if (places >= n) {
                 return true;
             }
             return false;
         }
     
         public int sumZerosBetweenTwoOnes(int i, int j, int[] flowerbed) {
             int sumZero = 0;
             for (int k = i; k < j; k++) {
                 if (flowerbed[k] == 0)
                     sumZero++;
             }
             return sumZero;
         }
}
