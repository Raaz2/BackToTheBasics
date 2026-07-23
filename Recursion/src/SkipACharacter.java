public class SkipACharacter {
    public static void main(String[] args) {
        String str = "abbccdaaefa";

        removeCharRecursive(str, "");

        String ans = removeCharRecursiveWithReturn(str);
        System.out.println("Returned ans without 'A' is " + ans);
    }

    public static void removeCharRecursive(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        // Take the first character of the remaining string
        char ch = str.charAt(0);

        // If it is 'a', skip it and process the rest of the string
        if (ch == 'a') {
            removeCharRecursive(str.substring(1), ans);
        }
        // If it is not 'a', add it to our answer accumulator
        else {
            removeCharRecursive(str.substring(1), ans + ch);
        }
    }

    public static String  removeCharRecursiveWithReturn(String str) {
        if (str.isEmpty()) {
            return "";
        }

        // Take the first character of the remaining string
        char ch = str.charAt(0);

        // If it is 'a', skip it and process the rest of the string
        if (ch == 'a') {
            return removeCharRecursiveWithReturn(str.substring(1));
        }
        // If it is not 'a', add it to our answer accumulator
        else {
            return ch + removeCharRecursiveWithReturn(str.substring(1));
        }
    }
}
