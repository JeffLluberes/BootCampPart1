package Part1_Medium_Program_Questions;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        String str;
        Scanner scan = new Scanner(System.in);

        System.out.println("Pleas enter your String :");
        str = scan.nextLine();
        System.out.println("After reversing String :");

        int i = str.length();
        while(i>0){
            System.out.print(str.charAt(i-1));
            i--;
        }
    }
}
