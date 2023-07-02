// Given two non-negative integers, num1 and num2 represented as string, return *the sum of* num1 *and* num2 *as a string*.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

// **Example 1:**

// **Input:** num1 = "11", num2 = "123"

// **Output:**

// "134"

package Assignment7th;


public class Question3 {
    public String addStrings(String num1, String num2) {
        String res = new String();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) sum += (num1.charAt(i--) - '0');
            if (j >= 0) sum += (num2.charAt(j--) - '0');

            res = (sum % 10) + res;
            carry = sum / 10;
        }

        if (carry != 0) {
            res = 1+res;
        }
        return res;
    }
}
