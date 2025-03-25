public class Main {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Before sorting:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After sorting:");
        printArray(numbers);
    }

    public static void mergeSort(int[] array) {
        // Your code here
    }

    public static void merge(int[] array, int[] left, int[] right) {
        // Your code here
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
