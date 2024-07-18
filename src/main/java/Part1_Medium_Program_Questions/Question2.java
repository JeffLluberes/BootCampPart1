package Part1_Medium_Program_Questions;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you wish to check:");
        int a = scan.nextInt();
        int sum = 0,r;
        int temp  = a;
        while(a>0) {
            r = a % 10;
            sum = (sum * 10) + r;
            a = a / 10;
        }
        if(temp==sum)
            System.out.println("This is a Palindrome number");
        else
            System.out.println("This is not a Palindrome");
        }
    }





