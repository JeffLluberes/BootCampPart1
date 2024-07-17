package Part1_Easy_Program_Questions;

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        int count = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please the number the number :");
        int number = scan.nextInt();

        if (number == 2) {
            System.out.println(number + " is a prime number");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {

                    count++;
                }
            }
            if (count == 2) {
                System.out.println(number + " is a prime number");
            } else {
                System.out.println(number + " is not a prime number");
            }

        }
    }
}