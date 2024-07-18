package Part1_Medium_Program_Questions;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        String str,reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string :");
        str = scan.nextLine();

        int length = str.length();
        for(int i = length -1; i>=0;i--)
            reverse = reverse + str.charAt(i);

        if (str.equals(reverse))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}

