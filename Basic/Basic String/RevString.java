import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevString {
    public static void reverseString(List<Character> s) {
        // your code goes here
        int low = 0;
        int high = s.size() - 1;

        while (low < high) {
            Collections.swap(s, low, high);
            low++;
            high--;
        }
    }

    public static void main(String args[]) {
        List<Character> chArr = new ArrayList<>();
        chArr.add('o');
        chArr.add('l');
        chArr.add('l');
        chArr.add('e');
        chArr.add('H');

        reverseString(chArr);

        System.out.println(chArr);

    }

}