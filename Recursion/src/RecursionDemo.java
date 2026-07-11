public class RecursionDemo {
    public static void main(String[] args) {
//        print(1);
//        printRev(5);
//       int ans =  factorial(6);
//        System.out.println(ans);
//
//        System.out.println(8282);
//        System.out.println(sumOfDigits(9999));
//
//        System.out.println(sumOfDigits(1578));
//        System.out.println(prodOfDigits(5555));


        System.out.println(rev(2288));
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
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return n;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static int prodOfDigits(int n) {
        if (n <= 9) {
            return n;
        }
        return (n % 10) * prodOfDigits(n / 10);
    }
    public static int sumOfDigitsIteration(int n) {
        int res = 0;
        while (n > 0) {
            res += n % 10;
            n /= 10;
        }
        return res;
    }

    static int ans = 0;

    public static int rev(int n) {
        if (n == 0) {
            return ans;
        }

        ans = ans * 10 + (n % 10);
        return rev(n / 10);
    }
}
