public class LC231PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwoBitwise(17));
        System.out.println(isPowerOfTwoIteration(36));
        System.out.println(isPowerOfTwoRecursive(128));
    }
    public static boolean isPowerOfTwoBitwise(int n) {
//        if (n <= 0) return false;
//        return (n & n - 1) == 0;


        return n > 0 && (n & (n - 1)) == 0;
    }
    public static boolean isPowerOfTwoIteration(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1;
    }
    public static boolean isPowerOfTwoRecursive(int n) {
        if (n == 1) return true;
        if (n <= 0 || (n % 2 != 0)) return false;

        return isPowerOfTwoRecursive(n / 2);
    }
}
