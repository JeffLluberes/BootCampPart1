package Part1_Medium_Program_Questions;

import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = in.nextLine();

        System.out.print("The number of words in this string is : " + countWords(str) + "\n");
    }

    public static int countWords(String str) {
        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count = count + 1;
        }
        return count;
    }
}