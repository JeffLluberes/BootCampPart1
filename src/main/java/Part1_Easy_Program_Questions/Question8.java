package Part1_Easy_Program_Questions;

import java.util.Scanner;

public class Question8 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int number1 = scan.nextInt();

        System.out.println("Choose the mathematical operation (+, -, *, /, dividebyzero)");
        String mathOperator = scan.next();

        System.out.println("Enter the second number :");
        int number2 = scan.nextInt();


        int result;

        switch (mathOperator) {
            case "+":
                result = number1 + number2;
                System.out.println("The sum of two numbers is : " + result);
                break;

            case "-":
                result = number1 - number2;
                System.out.println("The difference of two numbers is :" + result);
                break;

            case "*":
                result = number1 * number2;
                System.out.println("The multiplication value of two numbers is : " + result);
                break;

            case "/":
                result = number1 / number2;
                System.out.println("The division of two numbers is : " + result);
                break;

            case "dividebyzero":


            default: System.out.println("number2 is zero so the result will be");

        }
    }
    }

