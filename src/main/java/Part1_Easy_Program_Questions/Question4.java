package Part1_Easy_Program_Questions;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

        System.out.println("Enter number :");
        int number = scan.nextInt();

        if(number %2==0 )
            System.out.println("This is an even number");
        else{
            System.out.println("THis is an odd number");
        }
        }
    }

