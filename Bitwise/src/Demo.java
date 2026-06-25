public class Demo {
    public static void main(String[] args) {
//        Even or Odd
        // AND = '& with 1' (1 means true) digits remain the same
        // OR = '|' any expression true all will true
        // XOR (^) (if and only if) exclusive or  7 ^ 7 = 0


        int n = 16;

        System.out.println(convertInBinary(n));


//        odd even without modulo %
        System.out.println((n & 1) == 1 ? "ODD" : "EVEN");

    }

    public static String convertInBinary(int n) {
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        sb.append(1);
        return sb.reverse().toString();
    }
}
