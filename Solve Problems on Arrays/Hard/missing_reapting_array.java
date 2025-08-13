import java.util.ArrayList;
import java.util.Arrays;

public class missing_reapting_array {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;

        // Step 1: Expected sums for 1 to n
        long S = (long) n * (n + 1) / 2;
        long P = (long) n * (n + 1) * (2L * n + 1) / 6;

        // Step 2: Actual sums from the array
        long s = 0, p = 0;
        for (int num : arr) {
            s += num;
            p += (long) num * num;
        }

        // Step 3: Differences
        long ds = s - S; // R - M
        long sp = p - P; // R² - M²

        // Step 4: Find R + M
        long sumRM = sp / ds; // (R + M)

        // Step 5: Solve for R and M
        long repeating = (ds + sumRM) / 2;
        long missing = repeating - ds;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) repeating);
        ans.add((int) missing);
        return ans;
    }

    public static void main(String[] args) {
        missing_reapting_array solver = new missing_reapting_array();
        int[] arr = { 1, 3, 3 };
        ArrayList<Integer> result = solver.findTwoElement(arr);
        System.out.println("Repeating and missing numbers: " + result);
    }
}