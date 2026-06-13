import java.util.ArrayList;
import java.util.List;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
//        https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
        for (int i = 0; i < arr.length;) {
            int correct = arr[i] - 1;

            if (arr[correct] != arr[i]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else {
                i++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0, j = 1; i < arr.length; i++, j++) {
            if (arr[i] != j) {
                list.add(j);
            }
        }

        System.out.println(list);
    }
}
