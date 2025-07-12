public class CheckSortedAndRotated {
    // Check if Array Is Sorted and Rotated
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
            }
        }
        if (nums[nums.length - 1] > nums[0]) {
            count++;
        }
        return count <= 1;
    }

    public static void main(String[] args) {
        CheckSortedAndRotated solution = new CheckSortedAndRotated();

        int[] nums1 = { 3, 4, 5, 1, 2 }; // Rotated sorted
        int[] nums2 = { 1, 2, 3, 4, 5 }; // Sorted
        int[] nums3 = { 2, 1, 3, 4, 5 }; // Not valid

        System.out.println("Array 1 is sorted and rotated: " + solution.check(nums1)); // true
        System.out.println("Array 2 is sorted and rotated: " + solution.check(nums2)); // true
        System.out.println("Array 3 is sorted and rotated: " + solution.check(nums3)); // false
    }
}
