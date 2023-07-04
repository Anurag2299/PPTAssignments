// Write a Java program to print the Fibonacci series up to a given number using a for loop.


package MandatoryAssignments.Test2;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n =7;
        int n1 =0;
        int n2 = 1;
        System.out.print(n1 + " , "+n2 +" , ");
        for(int i =2;i <= n; i++) {
          int sum =n1+n2;
          System.out.print(sum + " , ");  
          n1 = n2;
          n2 = sum;
        }
    }
}
