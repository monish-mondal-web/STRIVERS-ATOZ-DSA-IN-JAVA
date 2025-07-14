import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] arr1 = { 1, 2, 3, 1, 1, 1, 1 };
        int k1 = 3;
        System.out.println("Test Case 1: " + longestSubarray(arr1, k1)); // Expected: 2 ([1,2] or [3])

        // Test Case 2
        int[] arr2 = { 10, 5, 2, 7, 1, 9 };
        int k2 = 15;
        System.out.println("Test Case 2: " + longestSubarray(arr2, k2)); // Expected: 4 ([5,2,7,1])

        // Test Case 3
        int[] arr3 = { -1, 2, 3 };
        int k3 = 3;
        System.out.println("Test Case 3: " + longestSubarray(arr3, k3)); // Expected: 2 ([2,1])

        // Test Case 4
        int[] arr4 = { 1, 2, 3, 4, 5 };
        int k4 = 11;
        System.out.println("Test Case 4: " + longestSubarray(arr4, k4)); // Expected: 0 (no subarray)

        // Test Case 5
        int[] arr5 = { 1, 1, 1, 1, 1 };
        int k5 = 3;
        System.out.println("Test Case 5: " + longestSubarray(arr5, k5)); // Expected: 3 ([1,1,1])
    }
}
