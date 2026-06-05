import java.util.Scanner;

public class FloorOfNumber {

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter target to search: ");
            int target = sc.nextInt();
            if (target == -1) break;
            int ans = binarySearchFloor(arr, target);
            System.out.println(ans);
        }
    }

    private static int binarySearchFloor(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        // when loop ends | end | <target (if exist)> | start
        return end; // end will be the floor if exact target not found
    }
}
