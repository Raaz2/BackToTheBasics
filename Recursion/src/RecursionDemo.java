public class RecursionDemo {
    public static void main(String[] args) {
//        print(1);
        printRev(5);
       int ans =  factorial(6);
        System.out.println(ans);


        System.out.println(sumOfDigits(1578));
    }
    public static void print(int i) {
        if (i >= 6) {
            return;
        }
        System.out.print(i + " ");
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

    public static int factorial(int i) {
        if (i <= 1) {
            return 1;
        }
        return i * factorial(i - 1);
    }
//    public static int sumOfDigits(int n) {
//        if (n <= 1) {
//            return n;
//        }
//
//        return 1 + () n % 10
//    }
    public static int sumOfDigits(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }
}
