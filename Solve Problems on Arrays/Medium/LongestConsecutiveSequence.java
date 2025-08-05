import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for (int num : nums) {
            map.add(num);
        }
        int longestConsecutive = 0;
        for (int num : map) {
            if (!map.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while (map.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestConsecutive = Math.max(longestConsecutive, currentStreak);
            }
        }
        return longestConsecutive;
    }

    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        int result = longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + result);
    }
}
