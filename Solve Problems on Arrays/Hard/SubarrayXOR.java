import java.util.HashMap;

public class SubarrayXOR {
    public static int solve(int[] A, int B) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;
        int prefixXOR = 0;
        for (int nums : A) {
            prefixXOR ^= nums;
            if (prefixXOR == B) count++;
            int reqXOR = prefixXOR ^ B;
            if (freqMap.containsKey(reqXOR)) {
                count += freqMap.get(reqXOR);
            }
            freqMap.put(prefixXOR, freqMap.getOrDefault(prefixXOR, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int B = 6;
        int result = solve(arr, B);
        System.out.println("Number of subarrays with XOR " + B + ": " + result);
    }
}
