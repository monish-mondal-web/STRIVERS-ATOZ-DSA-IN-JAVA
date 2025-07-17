public class SortColorsSolution {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums1);
        System.out.print("Test Case 1: ");
        printArray(nums1); // Expected: 0 0 1 1 2 2

        // Test Case 2
        int[] nums2 = { 2, 0, 1 };
        sortColors(nums2);
        System.out.print("Test Case 2: ");
        printArray(nums2); // Expected: 0 1 2

        // Test Case 3
        int[] nums3 = { 0 };
        sortColors(nums3);
        System.out.print("Test Case 3: ");
        printArray(nums3); // Expected: 0

        // Test Case 4
        int[] nums4 = { 1, 2, 0, 1, 2, 0, 1 };
        sortColors(nums4);
        System.out.print("Test Case 4: ");
        printArray(nums4); // Expected: 0 0 1 1 1 2 2
    }
}
