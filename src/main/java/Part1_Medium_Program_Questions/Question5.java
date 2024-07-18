package Part1_Medium_Program_Questions;

import java.util.Arrays;

public class Question5 {

    //Write a Java program to find the second highest number in an array.

    public static int secondLargest(int[] a, int total){
        Arrays.sort(a);
        return a[total-2];
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={11,22,33,44,89};
        System.out.println(" Second Largest Number : " + secondLargest(a,6));
        System.out.println(" Second Largest NUmber : " + secondLargest(b,5));
    }
}
