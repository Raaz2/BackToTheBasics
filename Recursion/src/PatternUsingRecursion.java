import java.util.Arrays;

public class PatternUsingRecursion {

    public static void main(String[] args) {

        int n = 5;

        // Pattern 1
        pattern(n, 0);

        System.out.println("=========================");

        // Pattern 2
        pattern2(n, 0);

        System.out.println("=========================");

        // Bubble Sort
        int[] arr = {2, 8, 5, 7};

        System.out.println("Before Bubble Sort : " + Arrays.toString(arr));
        bubble(arr, arr.length - 1, 0);
        System.out.println("After Bubble Sort  : " + Arrays.toString(arr));

        System.out.println("=========================");

        // Selection Sort
        int[] arr2 = {2, 8, 5, 7};

        System.out.println("Before Selection Sort : " + Arrays.toString(arr2));
        selection(arr2, arr2.length - 1, 0, 0);
        System.out.println("After Selection Sort  : " + Arrays.toString(arr2));
    }

    // ******************************
    // Pattern 1
    // *****
    // ****
    // ***
    // **
    // *
    // ******************************
    public static void pattern(int row, int col) {

        if (row == 0) {
            return;
        }

        if (col < row) {
            System.out.print("*");
            pattern(row, col + 1);
        } else {
            System.out.println();
            pattern(row - 1, 0);
        }
    }

    // ******************************
    // Pattern 2
    // *
    // **
    // ***
    // ****
    // *****
    // ******************************
    public static void pattern2(int row, int col) {

        if (row == 0) {
            return;
        }

        if (col < row) {
            pattern2(row, col + 1);
            System.out.print("*");
        } else {
            pattern2(row - 1, 0);
            System.out.println();
        }
    }

    // ******************************
    // Bubble Sort (Descending Order)
    // ******************************
    public static void bubble(int[] arr, int row, int col) {

        if (row == 0) {
            return;
        }

        if (col < row) {

            if (arr[col] < arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }

            bubble(arr, row, col + 1);

        } else {

            bubble(arr, row - 1, 0);

        }
    }

    // ******************************
    // Selection Sort (Ascending Order)
    // ******************************
    public static void selection(int[] arr, int row, int col, int max) {

        // Base Case
        if (row == 0) {
            return;
        }

        // Find the index of the maximum element
        if (col <= row) {

            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col + 1, max);
            }

        } else {

            int temp = arr[max];
            arr[max] = arr[row];
            arr[row] = temp;


            selection(arr, row - 1, 0, 0);
        }
    }

    class Solution {
        public int[] sortArray(int[] nums) {
            divide(nums, 0, nums.length - 1);
            return nums;
        }
        public void divide(int[] arr, int start, int end) {
            if (start < end) {
                int mid = start + (end - start) / 2;
                divide(arr, start, mid);
                divide(arr, mid + 1, end);
                conquer(arr, start, mid, end);
            };
        }
        public void conquer(int[] arr, int start, int mid, int end) {
            int[] merged = new int[end - start + 1];
            int i = start, j = mid + 1, k = 0;
            while (i <= mid && j <= end) {
                if (arr[i] <= arr[j]) {
                    merged[k++] = arr[i++];
                } else merged[k++] = arr[j++];
            }
            while (i <= mid) merged[k++] = arr[i++];
            while (j <= end) merged[k++] = arr[j++];
            int y = 0;
            for (int x = start; x <= end; x++) {
                arr[x] = merged[y++];
            }
        }
    }
}