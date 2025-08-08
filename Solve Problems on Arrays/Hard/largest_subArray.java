import java.util.HashMap;

public class largest_subArray {
    class Solution {
        public static int maxLength(int arr[]) {
            int n = arr.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            int sum = 0, maxLen = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum == 0)
                    maxLen = i + 1;

                if (map.containsKey(sum)) {
                    maxLen = Math.max(maxLen, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
            return maxLen;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        int result = Solution.maxLength(arr);
        System.out.println("Length of the largest subarray with sum 0: " + result);
    }
}