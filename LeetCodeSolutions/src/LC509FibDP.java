public class LC509FibDP {
    public static void main(String[] args) {
//        int n = 40;
//        int n = 40;
        int n = 90;
        int ans = fib(n, new int[n + 1]);

        System.out.println(ans);
    }

    // Fibonacci with dp
    public static int fib(int n, int[] dp) {
        if (n <= 1) return n;

        if (dp[n] != 0) {
            return dp[n];
        }
        else {
            return dp[n] = fib(n - 1, dp) + fib(n - 2, dp); // O(n), if we don't store 2^n
        }
    }
}
