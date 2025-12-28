import java.util.HashMap;
import java.util.Map;

public class SecHighestOccElm {
    public static int secondMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int freqMax = 0;
        int freqSec = 0;
        int secElm = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();

            if (freq > freqMax) {
                freqSec = freqMax;
                freqMax = freq;
            }

            else if (freq < freqMax && freq > freqSec) {
                freqSec = freq;
            }
        }
        if (freqSec == 0) {
            return -1;
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue().equals(freqSec)) {
                secElm = Math.min(secElm, entry.getKey());
            }
        }

        return secElm;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,5,5,6};
        int res = secondMostFrequentElement(arr);
        System.out.println(res);
    }
}
