public class FindNumberswithEvenNumberofDigits {
//    1295. Find Numbers with Even Number of Digits

    /*
    * Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
    * */
}

class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if (isEven(num)) {
                ans++;
            }
        }
        return ans;
    }
    private boolean isEven(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count % 2 == 0;
    }
}

// Below solution uses log10 to find out the no. of digits in a given no. it's faster than previous loop solution
class SolutionOptimized {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            if ((int)(Math.log10(num) + 1) % 2 == 0) ans++;
        }
        return ans;
    }
}