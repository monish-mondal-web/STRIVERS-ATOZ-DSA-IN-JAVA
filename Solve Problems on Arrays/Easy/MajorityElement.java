import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        int frequency = n / 2;
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            count = (freq.getOrDefault(num, 0) + 1);
            freq.put(num, count);

            if (count > frequency)
                return num;
        }

        return -1;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { 3, 3, 4 };
        System.out.println("Test Case 1: " + majorityElement(nums1)); // Expected: 3

        // Test Case 2
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println("Test Case 2: " + majorityElement(nums2)); // Expected: 2

        // Test Case 3
        int[] nums3 = { 1, 2, 3, 4 };
        System.out.println("Test Case 3: " + majorityElement(nums3)); // Expected: -1

        // Test Case 4
        int[] nums4 = { 1 };
        System.out.println("Test Case 4: " + majorityElement(nums4)); // Expected: 1
    }
}
