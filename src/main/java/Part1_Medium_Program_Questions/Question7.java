package Part1_Medium_Program_Questions;

public class Question7 {

    public static void main(String[] args) {

        int nums[] = {81, 22, 54, 76, 91, 83};
        int size = nums.length;
        int minLocation = -1;
        int temp = 0;

        System.out.println("Before sorting numbers:");

        for (int n = 0; n < size; n++) {
            System.out.print(nums[n] + " ");
        }

        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            minLocation = i;

            for (int j = i + 1; j < size; j++) {
                if (nums[j] < nums[minLocation]) {
                    minLocation = j;
                }
            }

            temp = nums[minLocation];
            nums[minLocation] = nums[i];
            nums[i] = temp;
        }

        System.out.println("After sorting numbers :");

        for (int n = 0; n < size; n++) {
            System.out.print(nums[n] + " ");
        }
    }
}