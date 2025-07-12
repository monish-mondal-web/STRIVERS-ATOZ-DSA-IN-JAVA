public class LeftRotateByOne {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int arr[] = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            arr[j] = nums[i];
            j++;
        }

        for (int i = 0; i < n - k; i++) {
            arr[j] = nums[i];
            j++;
        }

        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 1, 2, 3, 4 };
        
        LeftRotateByOne solution = new LeftRotateByOne();

        int k = 3;
        solution.rotate(arr, k);

        System.out.print("Array after rotating right by " + k + " positions: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
