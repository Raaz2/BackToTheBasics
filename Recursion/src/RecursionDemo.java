public class RecursionDemo {
    public static void main(String[] args) {
//        print(1);
        printRev(5);
    }
    public static void print(int i) {
        if (i >= 6) {
            return;
        }
        System.out.println(i);
        i++;
        print(i);
    }
    public static void printRev(int i) {
        if (i <= 0) {
            return;
        }
        System.out.println(i);
        printRev(i - 1);
    }
}
