public class LC461HammingDistance {
    // https://leetcode.com/problems/hamming-distance/

    // The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
    //Given two integers x and y, return the Hamming distance between them. 0 <= x, y <= 231 - 1
    public static void main(String[] args) {
        int x = 1, y = 4;

        System.out.println(hammingDistance(x, y));
    }
    public static int hammingDistance(int x, int y) {
        int n = x ^ y;
        System.out.println("Decimal => " + n);
        System.out.println("Binary => " + Integer.toBinaryString(n));
        int count = 0;
        while (n > 0) {
            count++;
            n -= n & -n;
        }
        return count;
//        return Integer.bitCount(x ^ y);
    }
}
