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
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                merged[k++] = arr[i++];
            } else {
                merged[k++] = arr[j++];
            }
        }

        while (i <= mid) merged[k++] = arr[i++];
        while (j <= end) merged[k++] = arr[j++];

        // 1. यहाँ कमेंट हटाया: सॉर्टेड एलिमेंट्स को वापस original array में डाला
        int y = 0;
        for (int x = start; x <= end; x++) {
            arr[x] = merged[y++];
        }
    }
}
