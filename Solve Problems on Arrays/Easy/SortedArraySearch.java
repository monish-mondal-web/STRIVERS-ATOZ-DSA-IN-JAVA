public class SortedArraySearch {
    static boolean searchInSorted(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11, 13 }; 
        int key = 7;

        if (searchInSorted(arr, key)) {
            System.out.println(key + " found in array.");
        } else {
            System.out.println(key + " not found in array.");
        }
    }
}
