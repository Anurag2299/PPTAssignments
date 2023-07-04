// Write a Java program to calculate the average of a list of numbers using a do-while loop.
package MandatoryAssignments.Test2;

public class Average {
    public static void main(String[] args) {
        int[] a ={1,2,3,4,5,6};
        int sum = 0;
        int n =0;
        do {
            sum += a[n];
            n++;
        } while(n < a.length);
        float res = sum/a.length;
        System.out.println("average od list is "+ res);
    }
}
