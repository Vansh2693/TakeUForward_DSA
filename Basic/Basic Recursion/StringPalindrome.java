public class StringPalindrome {   
    public static boolean palindromeCheck(String str) {
        //your code goes here
        return palindromeHelper(str,0,str.length()-1);
    }

    private static boolean palindromeHelper(String str, int low, int high){
        if(low>=high) return true;

        if(str.charAt(low)!=str.charAt(high)) return false;

        return palindromeHelper(str,low+1, high-1);
    }

    public static void main(String[] args) {
        boolean res = palindromeCheck("racecar");
        System.out.println(res);
    }
}