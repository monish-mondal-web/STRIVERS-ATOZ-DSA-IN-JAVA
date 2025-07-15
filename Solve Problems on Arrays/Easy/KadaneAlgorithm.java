public class KadaneAlgorithm {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Test Case 1: " + maxSubArray(nums1)); // Expected: 6 ([4,-1,2,1])

        // Test Case 2
        int[] nums2 = { 1 };
        System.out.println("Test Case 2: " + maxSubArray(nums2)); // Expected: 1

        // Test Case 3
        int[] nums3 = { 5, 4, -1, 7, 8 };
        System.out.println("Test Case 3: " + maxSubArray(nums3)); // Expected: 23

        // Test Case 4
        int[] nums4 = { -1, -2, -3, -4 };
        System.out.println("Test Case 4: " + maxSubArray(nums4)); // Expected: -1
    }
}
