public class SorteArrayCheck {
    public static void main(String[] args) {

        int[] arr = {1,2,4,8,9,12};

        boolean isSorted = helper(arr, 0, arr.length - 1);
        System.out.println(isSorted);



        arr = new int[]{1, 2, 4, 8, 7, 9, 12};

        isSorted = helper(arr, 0, arr.length - 1);

        System.out.println(isSorted);
    }

    public static boolean helper(int[] arr, int start, int end) {
        if (start == end) {
            return true;
        }

        return arr[start] < arr[start + 1] && helper(arr, start + 1, end);
    }
}
