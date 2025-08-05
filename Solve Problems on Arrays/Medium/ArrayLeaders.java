import java.util.ArrayList;
import java.util.Collections;

public class ArrayLeaders {
    public static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;

        int maxFromRight = arr[n - 1];
        res.add(maxFromRight);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                res.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        Collections.reverse(res);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 16, 17, 4, 3, 5, 2 };
        ArrayList<Integer> leaders = leaders(arr);
        System.out.print("Leaders in array: ");
        for (int num : leaders) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
