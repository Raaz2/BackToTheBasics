public class SorteArrayCheck {
    public static void main(String[] args) {

        int[] arr = {1,2,4,8,9,12};

        boolean isSorted = helper(arr, 0, arr.length - 1);
        System.out.println(isSorted);



        arr = new int[]{1, 2, 4, 8, 7, 9, 12};

        isSorted = helper(arr, 0, arr.length - 1);

        System.out.println(isSorted);


        int target = 13;
        System.out.println("Target found " + target + " => " + linearSearch(arr, 0, arr.length - 1, target));


         target = 12;
        System.out.println("Target found " + target + " => " + linearSearch(arr, 0, arr.length - 1, target));
    }

    public static boolean helper(int[] arr, int start, int end) {
        if (start == end) {
            return true;
        }

        return arr[start] < arr[start + 1] && helper(arr, start + 1, end);
    }


    public static boolean linearSearch(int[] arr, int start, int end, int target) {
        if (start == end && arr[start] != target) {
            return false;
        }

        if (arr[start] == target) return true;
        else return linearSearch(arr, start + 1, end, target);
    }
}
