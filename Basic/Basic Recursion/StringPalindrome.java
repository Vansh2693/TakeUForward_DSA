public class StringPalindrome {   
    public static boolean palindromeCheck(String s) {
        //your code goes here
        return palindromeHelper(s,0,s.length()-1);
    }

    private static boolean palindromeHelper(String s, int low, int high){
        if(low>=high) return true;

        if(s.charAt(low)!=s.charAt(high)) return false;

        return palindromeHelper(s,low+1, high-1);
    }

    public static void main(String[] args) {
        boolean res = palindromeCheck("racecar");
        System.out.println(res);
    }
}