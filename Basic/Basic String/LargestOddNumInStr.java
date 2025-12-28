public class LargestOddNumInStr {    
    public static String largeOddNum(String s) {
        int low=0;
        int high=-1;

        for(int i=s.length()-1;i>=0;i--){
            if((s.charAt(i)-'0')%2==1){
                high = i;
                break;
            }
        }

        if(high==-1) return "";
        
        while(low<=high && s.charAt(low)=='0'){
            low++;
        }

        return s.substring(low,high+1);
    }

    public static void main(String[] args) {
        String num = "00234567";
        String res = largeOddNum(num);
        System.out.println(res);
    }
}