public class MaxPairSumInSubarrays {
    public static int maxSum(int arr[]) {
        if (arr.length < 2)
            return 0;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i + 1 < arr.length; i++) {
            max = Math.max(max, arr[i] + arr[i + 1]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 9, 8, 2, 4 };
        int result = maxSum(arr);
        System.out.println("Maximum pair sum in subarrays: " + result);
    }
}