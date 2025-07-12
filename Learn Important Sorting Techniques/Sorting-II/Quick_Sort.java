public class Quick_Sort {

    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void quick_Sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quick_Sort(arr, si, pIdx - 1);
        quick_Sort(arr, pIdx + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;
        for (int j = si; j < ei; j++) {
            if (pivot >= arr[j]) {
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, ei);
        return i;
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7 };

        System.out.println("Before Sorting:");
        printArray(arr);

        quick_Sort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        printArray(arr);
    }
}
