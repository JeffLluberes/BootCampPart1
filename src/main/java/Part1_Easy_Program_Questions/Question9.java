package Part1_Easy_Program_Questions;

import java.util.Scanner;

public class Question9 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter degree in Fahrenheit :");
        double fahrenheit = scan.nextDouble();

        double celsius = ((5*(fahrenheit-32.0))/9.0);
        System.out.println(fahrenheit +" degree Fahrenheit is equal to "+ celsius +" in Celsius");
    }
}
