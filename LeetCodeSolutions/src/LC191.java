public class LC191 {
    public static void main(String[] args) {
// number of set bits (1)
        int n = 11;
        System.out.println(hammingWeight(n)); // 11 in binary => 1011 (count of 1 is 3)
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
