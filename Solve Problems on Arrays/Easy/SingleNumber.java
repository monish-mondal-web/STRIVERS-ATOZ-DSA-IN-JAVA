public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int n = nums.length;
        int XOR = 0;
        for (int i = 0; i < n; i++) {
            XOR ^= nums[i];
        }
        return XOR;
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { 2, 2, 1 };
        System.out.println("Test Case 1: " + singleNumber(nums1)); // Expected: 1

        // Test Case 2
        int[] nums2 = { 4, 1, 2, 1, 2 };
        System.out.println("Test Case 2: " + singleNumber(nums2)); // Expected: 4

        // Test Case 3
        int[] nums3 = { 1 };
        System.out.println("Test Case 3: " + singleNumber(nums3)); // Expected: 1

        // Test Case 4
        int[] nums4 = { 0, 0, 7 };
        System.out.println("Test Case 4: " + singleNumber(nums4)); // Expected: 7
    }
}
