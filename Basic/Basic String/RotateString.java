public class RotateString {
    public static boolean rotateString(String s, String goal) {
        // your code goes here
        return (s.length() == goal.length() && (s + s).contains(goal));
    }

    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdeab";
        boolean res = rotateString(s, goal);
        System.out.println(res);
    }
}