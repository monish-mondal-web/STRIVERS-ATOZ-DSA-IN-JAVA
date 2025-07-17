import java.util.ArrayList;

class RearrangeArrayBySign {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                positive.add(nums[i]);
            else
                negative.add(nums[i]);
        }

        int[] result = new int[nums.length];
        int pos = 0, neg = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                result[i] = positive.get(pos++);
            else
                result[i] = negative.get(neg++);
        }

        return result;
    }

    public static void main(String[] args) {
        RearrangeArrayBySign obj = new RearrangeArrayBySign();
        int[] nums = { 3, 1, -2, -5, 2, -4 };
        int[] rearranged = obj.rearrangeArray(nums);

        System.out.print("Rearranged array: ");
        for (int num : rearranged) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
