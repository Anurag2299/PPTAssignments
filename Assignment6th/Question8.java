

package Assignment6th;
// An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

// Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

// **Example 1:**

// **Input:** changed = [1,3,4,2,6,8]
public class Question8 {
    int[] res;
    int index=0;
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2==1) return new int[0];
        res = new int[changed.length/2];
        
        int max = 0;
        for(int num: changed) max = Math.max(max, num);
        int[] nums = new int[max+1];
        for(int num: changed) nums[num]++;
        
        if(nums[0]%2==1) return new int[0];
        fill(0, nums[0]/2);
        
        for(int i=1; i<=max/2; i++){
            if(nums[2*i] < nums[i]) return new int[0];
            nums[2*i] -= nums[i];
            fill(i, nums[i]);
        }
        return index != res.length ? new int[0] : res;
    }
    
    private void fill(int num, int count){
        while(count-->0)
            res[index++] = num;
    }
}
