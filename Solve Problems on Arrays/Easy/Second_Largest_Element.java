public class Second_Largest_Element {
    public static int getSecondLargest(int[] arr) {
        int firstLarg = Integer.MIN_VALUE;
        int secondLarg = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLarg) {
                secondLarg = firstLarg;
                firstLarg = arr[i];
            } else if (arr[i] > secondLarg && arr[i] != firstLarg) {
                secondLarg = arr[i];
            }
        }
        if (secondLarg == Integer.MIN_VALUE)
            return -1;
        return secondLarg;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        int secElm = getSecondLargest(arr);
        System.out.println("Largest Element: " + secElm);
    }
}
