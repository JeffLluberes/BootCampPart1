package Part1_Easy_Program_Questions;

import java.util.Random;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        int low,high;
        int n;
        int num;

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println( "Please enter first number :");
        low = scan.nextInt();
        System.out.println("Please enter ending number :");
        high = scan.nextInt();
        System.out.println("Enter the no. of numbers you want to generate :");
        n = scan.nextInt();

        System.out.println("====================================================");
        System.out.println("GENERATED RANDOM NUMBERS");

        for(int i = 0; i<n; i++){
            num = rand.nextInt((high +1)-low) +low;
            System.out.println(num);

        }
    }
}
