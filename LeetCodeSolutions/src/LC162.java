public class LC162 {
//    https://leetcode.com/problems/find-peak-element/description/

    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        int ans = SolutionLC162.findPeakElement(arr);
        System.out.println(ans);
    }


}

class SolutionLC162 {
    public static int findPeakElement(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return start;
    }
}
