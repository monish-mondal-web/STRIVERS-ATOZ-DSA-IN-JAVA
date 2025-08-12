import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MargeOverlap {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];
        merged.add(current);
        for (int[] interval : intervals) {
            int currentStart = current[0];
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                current[1] = Math.max(currentEnd, nextEnd);
            } else {
                current = interval;
                merged.add(current);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 2, 6 },
                { 8, 10 },
                { 15, 18 }
        };
        int[][] merged = merge(intervals);
        System.out.println("Merged intervals:");
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}