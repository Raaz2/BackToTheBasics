public class RecursionDemo {
    public static void main(String[] args) {
        print(1);
    }
    public static void print(int i) {
        if (i >= 6) {
            return;
        }
        System.out.println(i);
        i++;
        print(i);
    }
}
