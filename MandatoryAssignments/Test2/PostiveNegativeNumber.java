// 1. Write a Java program to check whether a given number is positive, 
// negative, or zero using an if-else statement.

package MandatoryAssignments.Test2;

public class PostiveNegativeNumber {
    public static void main(String[] args) {
        int number = 19;

        if (number < 0)
            System.out.println(number + " is a negative number.");

        else if ( number > 0)
            System.out.println(number + " is a positive number.");

        else
            System.out.println(number + " is 0.");
    }
    
}
