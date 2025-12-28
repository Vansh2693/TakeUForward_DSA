import java.util.Arrays;

public class LongestCommonPrefix {    
    public static String longestCommonPrefix(String[] str) {
        //your code goes here
        if(str==null || str.length==0) return "";

        Arrays.sort(str);

        String first = str[0];
        String last = str[str.length-1];

        int i=0;
        while(i<first.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }

        return first.substring(0,i);
    }

    public static void main(String[] args) {
        String[] arr = { "flowers", "flow", "fly", "flight" };
        String res = longestCommonPrefix(arr);
        System.out.println(res);
    }
}