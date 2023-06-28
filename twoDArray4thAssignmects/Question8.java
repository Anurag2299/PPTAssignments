// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// *Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

// **Example 1:**

// **Input:** nums = [2,5,1,3,4,7], n = 3

// **Output:** [2,3,5,4,1,7]

package twoDArray4thAssignmects;

public class Question8 {
     public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int[] answer = new int[nums.length];
        int flag=0;
        for(int x=0;x<nums.length;x++){
            if(flag==0){
                answer[x]=nums[i];
                i++;
                flag=1;
            }
            else{
                answer[x]=nums[j];
                j++;
                flag=0;
            }
        }
        
        return answer;
    }
}
