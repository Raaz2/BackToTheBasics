import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {87, 3, 49, 2, 5, 99};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) { // at every pass maximum element comes to the end
            for (int j = 0; j < arr.length - i - 1; j++) { // because ith from end already at it's correct place
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
