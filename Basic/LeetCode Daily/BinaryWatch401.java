import java.util.ArrayList;
import java.util.List;

public class BinaryWatch401 {
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> result = new ArrayList<>();

        for (int hour = 0; hour < 12; hour++) {
            for (int minute = 0; minute < 60; minute++) {

                // Count total number of 1 bits
                if (Integer.bitCount(hour) + Integer.bitCount(minute) == turnedOn) {

                    // Format minute to always have 2 digits
                    result.add(String.format("%d:%02d", hour, minute));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int a = 1;
        List<String> res = readBinaryWatch(a);

        System.out.println(res);
    }
}