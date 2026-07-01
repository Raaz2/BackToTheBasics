public class LC136SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans = singleNumber(arr);
        System.out.printf(String.valueOf(ans));

    }

    public static int singleNumber(int[] nums) {
        int unique = 0;
        for (int n : nums) {
            unique ^= n;
        }
        return unique;
    }
}
