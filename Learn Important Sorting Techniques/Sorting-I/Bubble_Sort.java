public class Bubble_Sort {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isSwaped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                    isSwaped = true;
                }
            }
            if (!isSwaped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 8};

        System.out.println("Before Sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
