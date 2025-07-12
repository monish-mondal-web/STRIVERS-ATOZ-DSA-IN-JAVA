public class Insertion_Sort {
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currValue = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currValue) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = currValue;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 1, 2};

        System.out.println("Before Sorting:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
