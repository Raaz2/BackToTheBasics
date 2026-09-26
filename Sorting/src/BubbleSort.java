import java.util.Arrays;

//bubble sort is an 0(n ** 2) solution
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {87, 3, 49, 12, 5, 99};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // at every pass maximum element comes to the end
            for (int j = 0; j < arr.length - i - 1; j++) { // because ith from end already at it's correct place
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

