public class RichestCustomerWealth {
    /*
    * 1672. Richest Customer Wealth
Solved
Easy
Topics
premium lock icon
Companies
Hint
You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.



Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
    * */
}

class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] i : accounts) {
            int currSum = 0;
            for (int j : i) {
                currSum += j;
            }
            max = Math.max(currSum, max);
        }
        return max;
    }
}
