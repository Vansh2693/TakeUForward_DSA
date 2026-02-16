public class ReverseBits190 {
    public static int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int currBit = n & 1;

            ans |= currBit << (31 - i);

            n >>>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 1;
        int res = reverseBits(n);
        System.out.println(res);
    }
}