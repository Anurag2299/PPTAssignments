// Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

// **Example 1:**

// **Input:** s = "ab#c", t = "ad#c"

// **Output:** true

// **Explanation:**

// Both s and t become "ac".

package Assignment7th;

import java.util.Stack;

public class Question7 {

    public boolean backspaceCompare(String s, String t) {
        Stack<Character> firstStack= new Stack<>();
        Stack<Character> secondStack=new Stack<>();
        for(int k=0;k<s.length();k++){
            char ch= s.charAt(k);
            if(!firstStack.isEmpty() && ch =='#') firstStack.pop();
            else{
                if(ch!='#') 
                    firstStack.push(ch);

             }
        }

        for(int j=0;j<t.length();j++){
            char c= t.charAt(j);
            if(!secondStack.isEmpty() && c=='#') secondStack.pop();
           else{
                if(c!='#') 
                    secondStack.push(c);

             }
        }
              
        return firstStack.equals(secondStack);
    }
}
