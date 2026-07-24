import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SubSequence {
    public static void main(String[] args) {
        String str = "abcd";
        subseq(str, "");
        System.out.println("================================");
        List<String> list = subseqlistreturn(str, "");
        System.out.println(list);
    }
    public static void subseq(String str, String ans) {

        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        subseq( str.substring(1),ans + ch);
        subseq(str.substring(1), ans);
    }

    public static ArrayList<String> subseqlistreturn(String str, String ans) {

        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
//            System.out.println(ans);
            return list;
        }

        char ch = str.charAt(0);

        ArrayList<String> selected = subseqlistreturn( str.substring(1),ans + ch);
        ArrayList<String> rejected = subseqlistreturn(str.substring(1), ans);

        selected.addAll(rejected);
        return selected;
    }
}
