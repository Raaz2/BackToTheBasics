import java.util.Arrays;

public class LC1486XOR {
    public static void main(String[] args) {
        int n = 5, start = 0;
        System.out.println(xorOperation(n, start));
    }

    public static int xorOperation(int n, int start) {
        int[] arr = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
            ans ^= arr[i];
        }
        System.out.println(Arrays.toString(arr));
        return ans;
    }
}
