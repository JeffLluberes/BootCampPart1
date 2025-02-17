package Part1_Medium_Program_Questions;

import java.util.Scanner;

public class Question9 {

        int binarySearch(int array[], int element, int low, int high) {

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (array[mid] == element)
                    return mid;

                if (array[mid] < element)
                    low = mid + 1;

                else
                    high = mid - 1;
            }

            return -1;
        }

        public static void main(String args[]) {


            Question9 ob = new Question9();
            int[] array = { 3, 4, 5, 6, 7, 8, 9 };
            int n = array.length;

            Scanner input = new Scanner(System.in);

            System.out.println("Enter number to be searched :");

            int element = input.nextInt();
            input.close();

            int result = ob.binarySearch(array, element, 0, n - 1);
            if (result == -1)
                System.out.println("Number Not found");
            else
                System.out.println("Number found at index " + result);
        }

    }

