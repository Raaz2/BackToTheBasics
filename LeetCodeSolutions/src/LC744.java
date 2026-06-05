public class LC744 {
//    https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        SolutionLC744 solution = new SolutionLC744();
        char[] arr = new char[] {'c','f','j'};
        char target = 'a';
        char ch = solution.nextGreatestLetter(arr, target);
        System.out.println(ch);
    }
}

class SolutionLC744 {
    public char nextGreatestLetter(char[] arr, char target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}
