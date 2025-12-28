import java.util.HashMap;
import java.util.Map;

public class SumOfHighandLowFreq {
    public static int sumHighestAndLowestFrequency(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int minFreq = Integer.MAX_VALUE;
        for (int freq : freqMap.values()) {
            minFreq = Math.min(freq, minFreq);
            maxFreq = Math.max(freq, maxFreq);
        }

        return maxFreq + minFreq;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 4, 5, 5, 6 };
        int res = sumHighestAndLowestFrequency(nums);
        System.out.println(res);
    }
}
