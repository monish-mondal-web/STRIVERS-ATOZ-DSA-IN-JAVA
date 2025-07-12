public class Largest_Element {
    public static int largest(int[] arr) {
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int arr[] = {1, 8, 7, 56, 90};
        int maxElement = largest(arr);
        System.out.println("Largest Element: " + maxElement);
    }
}
