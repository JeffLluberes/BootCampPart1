package Part1_Medium_Program_Questions;

public class Question1 {


        static int factorial(int a) {

            if (a == 0) {
                return 1;
            }
            return a * factorial(a- 1);
        }

        public static void main(String[] args) {
            System.out.println("Factorial of the number 4 is: " + factorial(4));
        }
    }
