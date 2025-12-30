import java.util.ArrayList;
import java.util.Collections;

public class RevString {
    public static ArrayList<Character> reverseString(ArrayList<Character> s) {
        // your code goes here
        revHelper(s, 0, s.size() - 1);
        return s;
    }

    private static void revHelper(ArrayList<Character> s, int low, int high) {
        if (low >= high)
            return;

        Collections.swap(s, low, high);

        revHelper(s, low + 1, high - 1);
    }

    public static void main(String[] args) {
        ArrayList<Character> chArr = new ArrayList<>();
        chArr.add('o');
        chArr.add('l');
        chArr.add('l');
        chArr.add('e');
        chArr.add('H');

        ArrayList<Character> resArr = reverseString(chArr);
        System.out.println(resArr);
    }
}