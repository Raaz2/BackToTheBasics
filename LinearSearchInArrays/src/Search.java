public class Search {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int k = 19;
        int ans = searchNum(nums, k);
        System.out.println(ans);

        String str = "Rajeev Ranjan Mishra";
        int idx = searchStr(str, 'R');
        System.out.println(idx);
    }

    private static int searchNum(int[] arr, int k) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return ans;
    }

    private static int searchStr(String str, char ch) {
        int ans = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                return i;
            }
        }
        return ans;
    }
}
