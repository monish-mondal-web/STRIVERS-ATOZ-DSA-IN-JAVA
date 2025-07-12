import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        // process 1
        int n = nums.length;
        // int expectedSum = n * (n + 1)/2;
        // int actualSum = 0;
        // for(int i = 0; i < n; i++){
        // actualSum += nums[i];
        // }
        // return expectedSum - actualSum;

        // process 2
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] != i)
                return i;
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 0, 1};
        System.out.println("Test: " + missingNumber(nums1));
    }
}
