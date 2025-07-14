import java.util.HashMap;

public class TwoSumSolution {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int complete = target - nums[i];
            if (map.containsKey(complete)) {
                return new int[] { map.get(complete), i };
            }
            map.put(nums[i], i);
        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { 2, 7, 11, 15 };
        int target1 = 9;
        int[] res1 = twoSum(nums1, target1);
        System.out.println("Test Case 1: [" + res1[0] + ", " + res1[1] + "]"); // Expected: [0, 1]

        // Test Case 2
        int[] nums2 = { 3, 2, 4 };
        int target2 = 6;
        int[] res2 = twoSum(nums2, target2);
        System.out.println("Test Case 2: [" + res2[0] + ", " + res2[1] + "]"); // Expected: [1, 2]

        // Test Case 3
        int[] nums3 = { 3, 3 };
        int target3 = 6;
        int[] res3 = twoSum(nums3, target3);
        System.out.println("Test Case 3: [" + res3[0] + ", " + res3[1] + "]"); // Expected: [0, 1]

        // Test Case 4
        int[] nums4 = { 1, 2, 3 };
        int target4 = 7;
        int[] res4 = twoSum(nums4, target4);
        System.out.println("Test Case 4: [" + res4[0] + ", " + res4[1] + "]"); // Expected: [-1, -1]
    }
}
