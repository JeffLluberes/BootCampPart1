package Part1_Medium_Program_Questions;

public class Question6 {

    void bubbleSort(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++)
                for (int j = 0; j < n - i - 1; j++)
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
        }


        void printArray(int arr[])
        {
            int n = arr.length;
            for (int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            System.out.println();

        }

    public static void main(String[] args) {

        Question6 bs = new Question6();
        int arr[] = {41, 52, 21, 22, 17, 92, 63 };
        bs.bubbleSort(arr);
        System.out.println("Bubble sorted Array");
        bs.printArray(arr);
    }
}

