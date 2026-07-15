import java.util.ArrayList;

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




        int[] list = {1,2,3,4,4,8};
        int k = 4;
        ArrayList<Integer> arrayList = returnList(list, k, 0, list.length, new ArrayList<>());
        System.out.println("With ArrayList Passed: " + arrayList);




         list = new int[]{7,9,9,8,1,8};
         k = 9;
         arrayList = returnListWithoutParamPassed(list, k, 0, list.length);
        System.out.println("Without ArrayList Passed: " + arrayList);
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


    public static ArrayList<Integer> returnList(int[] arr, int target, int start, int end, ArrayList<Integer> list) {
        if (start == end) {
            return list;
        }

        if (arr[start] == target) {
            list.add(start);
        }

        return returnList(arr, target, start + 1, end, list);
    }


    public static ArrayList<Integer> returnListWithoutParamPassed(int[] arr, int target, int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();

        if (start == end) {
            return list;
        }

        if (arr[start] == target) {
            list.add(start);
        }

        ArrayList<Integer> belowCallsAns = returnListWithoutParamPassed(arr, target, start + 1, end);

        list.addAll(belowCallsAns);
        return list;
    }

}
