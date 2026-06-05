import java.util.Arrays;

public class LC34 {
    public static void main(String[] args) {
        SolutionLC34 solution = new SolutionLC34();
        int[] arr = new int[] {5,7,7,8,8,10};
        int target = 8;
        int[] ans = solution.searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}

class SolutionLC34 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[] {-1, -1};

        boolean findFirst = true;
        ans[0] = binarySearch(nums, target, true);

        ans[1] = binarySearch(nums, target, false);

        return ans;
    }

    private int binarySearch(int[] arr, int target, boolean findFirst) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                }
                if (!findFirst) {
                    start = mid + 1;
                }
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }

}
