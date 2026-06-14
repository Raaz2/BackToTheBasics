public class LC287 {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (i != correct && nums[i] == nums[correct]) {
                return nums[i];
            }

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        return -1;
    }
}



