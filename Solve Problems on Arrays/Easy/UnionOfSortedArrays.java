import java.util.ArrayList;

public class UnionOfSortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        ArrayList<Integer> res = new ArrayList<>();

        int n = a.length;
        int m = b.length;

        int i = 0, j = 0;

        while (i < n && j < m) {
            // skip dublicate
            if (i > 0 && i < n && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && j < m && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            // adding in res
            if (a[i] < b[j]) {
                res.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                res.add(b[j]);
                j++;
            } else {
                res.add(a[i]);
                i++;
                j++;
            }
        }

        // add extra part
        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                res.add(a[i]);
            }
            i++;
        }
        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                res.add(b[j]);
            }
            j++;
        }
        return res;
    }

    public static void main(String[] args) {
        // Test Case 1: Arrays with common elements
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 2, 3, 4, 4, 5 };
        ArrayList<Integer> union1 = findUnion(arr1, arr2);
        System.out.println("Test Case 1 - Union: " + union1);
        // Expected: [1, 2, 3, 4, 5]

        // Test Case 2: Arrays with no common elements
        int[] arr3 = { 1, 3, 5 };
        int[] arr4 = { 2, 4, 6 };
        ArrayList<Integer> union2 = findUnion(arr3, arr4);
        System.out.println("Test Case 2 - Union: " + union2);
        // Expected: [1, 2, 3, 4, 5, 6]

        // Test Case 3: Arrays with duplicates
        int[] arr5 = { 1, 1, 2, 2, 3 };
        int[] arr6 = { 2, 2, 3, 3, 4 };
        ArrayList<Integer> union3 = findUnion(arr5, arr6);
        System.out.println("Test Case 3 - Union: " + union3);
        // Expected: [1, 2, 3, 4]
    }
}