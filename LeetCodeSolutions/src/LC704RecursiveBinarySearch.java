public class LC704RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(binarySearch(arr, 0, arr.length - 1, 12));
    }

    public static int binarySearch(int[] arr, int start, int end, int target) {

        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        else if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        }
        else {
            return binarySearch(arr, mid + 1, end, target);
        }
    }
}
