package Recursion.src;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
        ArrayList<String> list = permutationsReturn("", "xyz");
        System.out.println("=======================");

        System.out.println("=======================");
        System.out.println(list);


        int[] arr = {9, 2, 5, 4};
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), arr);
        System.out.println(result);
    }
    private static  void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (tempList.contains(nums[i])) {
                continue;
            }

            tempList.add(nums[i]);

            backtrack(result, tempList, nums);

            tempList.remove(tempList.size() - 1);
        }
    }
    public static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }


    public static ArrayList<String> permutationsReturn(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutationsReturn(f + ch + s, up.substring(1)));
        }

        return list;
    }
}
