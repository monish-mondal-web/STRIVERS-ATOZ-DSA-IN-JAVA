public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0, count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else
                count = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { 1, 1, 0, 1, 1, 1 };
        System.out.println("Test Case 1: " + findMaxConsecutiveOnes(nums1)); // Expected: 3

        // Test Case 2
        int[] nums2 = { 1, 0, 1, 1, 0, 1 };
        System.out.println("Test Case 2: " + findMaxConsecutiveOnes(nums2)); // Expected: 2

        // Test Case 3
        int[] nums3 = { 0, 0, 0, 0 };
        System.out.println("Test Case 3: " + findMaxConsecutiveOnes(nums3)); // Expected: 0

        // Test Case 4
        int[] nums4 = { 1, 1, 1, 1, 1 };
        System.out.println("Test Case 4: " + findMaxConsecutiveOnes(nums4)); // Expected: 5
    }
}
