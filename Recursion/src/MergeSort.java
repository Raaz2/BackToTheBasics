public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8, 18, 2, 15, 11, 27, 7};

        mergeSort(arr, 0, arr.length - 1);



    }

    public static int[] mergeSort(int[] arr, int start, int end) {
        if (start >= end) return arr;

        int mid = start + (end - start) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int i = start, int j = mid + 1;
        while (i <= mid && j <= end) {

        }
    }
}
