public class Isomorphic {
    public static boolean isomorphicString(String s, String t) {
        // your code goes here

        int[] mapST = new int[255];
        int[] mapTS = new int[255];

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST[c1] != 0 || mapTS[c2] != 0) {
                if (mapST[c1] != c2 || mapTS[c2] != c1) {
                    return false;
                }
            } else {
                mapST[c1] = c2;
                mapTS[c2] = c1;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        boolean res = isomorphicString(s, t);
        System.out.println(res);
    }
}