// Write a Java program to find the largest of three numbers using nested if-else statements.

package MandatoryAssignments.Test2;

public class LargestNumber {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 8;
        int n3 = 9;

        if(n1>= n2 && n1>= n3){
            System.out.println("Largest number is :"+n1);
        } else if(n2>= n1 && n2>=n3) {
            System.out.println("Largest number is :"+n2);
        } else {
            System.out.println("Largest number is :"+n3);
        }
    }
}
