import java.util.ArrayList;
import java.util.List;

public class LC17PhoneNubmer {
    public static void main(String[] args) {
        Solution solution = new LC17PhoneNubmer.Solution();

        String digits = "11";
        List<String> ans = solution.letterCombinations(digits);
        System.out.println(ans);

    }


    static class Solution {

        private static final String[] KEYPAD = {
                "",     // 0
                "",     // 1
                "abc",  // 2
                "def",  // 3
                "ghi",  // 4
                "jkl",  // 5
                "mno",  // 6
                "pqrs", // 7
                "tuv",  // 8
                "wxyz"  // 9
        };

        public List<String> letterCombinations(String digits) {
            List<String> list = new ArrayList<>();

            // 2. Base Case Edge Handling
            if (digits == null || digits.isEmpty()) {
                return list;
            }

            pad("", digits, list);
            return list;
        }


        private void pad(String p, String up, List<String> list) {
            if (up.isEmpty()) {
                list.add(p);
                return;
            }

            int digit = up.charAt(0) - '0';
            String letters = KEYPAD[digit];

            for (int i = 0; i < letters.length(); i++) {
                char ch = letters.charAt(i);
                pad(p + ch, up.substring(1), list);
            }
        }
    }


}

