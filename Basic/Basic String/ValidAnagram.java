public class ValidAnagram {
    public static boolean anagramStrings(String s, String t) {
        // your code goes here

        if (s.length() != t.length())
            return false;

        int[] charFreq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charFreq[s.charAt(i) - 'a']++;
            charFreq[t.charAt(i) - 'a']--;
        }

        for (int count : charFreq) {
            if (count != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean res = anagramStrings(s, t);
        System.out.println(res);
    }
}