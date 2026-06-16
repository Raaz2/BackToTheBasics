import java.util.Arrays;

public class LC645 {
    public static void main(String[] args) {
        int[] arr = {2,2};
        LC645 lc645 = new LC645();
        System.out.println(Arrays.toString(lc645.findErrorNums(arr)));
    }

    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }

        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index + 1};
            }
        }

        return arr;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
