public class LC509Fibonacci {
    public static void main(String[] args) {
        int n = 5;
//        System.out.println(fib(n));
        System.out.println(fib1(50));
    }

    public static int fib(int n) {
        if (n < 0) return -1; // not available
        if (n == 1 || n == 0) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static long fib1(int n) {
        double phi = (1 + Math.sqrt(5)) / 2;
        return (long) Math.round(Math.pow(phi, n) / Math.sqrt(5));
    }
}
