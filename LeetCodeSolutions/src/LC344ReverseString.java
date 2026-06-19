import java.util.Arrays;

public class LC344ReverseString {
    public static void main(String[] args) {
        String[] arr = {"h","e","l","l","o"};
        reverseString(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseString(String[] s) {
        rev(s, 0, s.length - 1);
    }

    public static void rev(String[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        String temp = s[start];
        s[start] = s[end];
        s[end] = temp;
        rev(s, start + 1, end - 1);
    }
}
