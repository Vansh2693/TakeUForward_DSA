import java.util.HashMap;
import java.util.Map;

public class MaxOccurringElm {
    public static int mostFrequentElement(int[] nums) {
        Map<Integer, Integer> cMap = new HashMap<Integer, Integer>();
        for (int num : nums) {
            cMap.put(num, cMap.getOrDefault(num, 0) + 1);
        }

        int freq = 0;
        int num = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : cMap.entrySet()) {

            int key = entry.getKey();
            int value = entry.getValue();

            if (freq < value) {
                freq = value;
                num = key;
            } else if (freq == value) {
                num = Math.min(key, num);
            }
        }
        return num;
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 2, 1, 4, 2, 1, 5 };
        int res = mostFrequentElement(arr);
        System.out.println(res);
    }
}
