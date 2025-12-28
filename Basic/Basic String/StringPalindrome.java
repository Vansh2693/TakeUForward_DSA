public class StringPalindrome {
    public static boolean palindromeCheck(String s) {
        // your code goes here
        if (s.length() == 1) {
            return true;
        }
        int low = 0;
        int high = s.length() - 1;

        while (low < high) {
            if (s.charAt(low++) != s.charAt(high--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "AddA";
        boolean res = palindromeCheck(s);
        System.out.println(res);
    }
}