public class AddBinary {

    public static String addBinary(String a, String b) {
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0, base = 2;
        StringBuilder sb = new StringBuilder();

        while (m >= 0 || n >= 0) {
            int n1 = 0, n2 = 0, sum;
            if (m >= 0) {
                n1 = a.charAt(m--) - '0';
            }
            if (n >= 0) {
                n2 = b.charAt(n--) - '0';
            }

            sum = n1 + n2 + carry;

            if (sum >= base) {
                carry = 1;
                sum -= base;
            } else {
                carry = 0;
            }
            sb.append(sum);
        }
        if (carry == 1)
            sb.append(carry);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        String res = addBinary(a, b);
        System.out.println(res);
    }
}
