public class Demo {
    public static void main(String[] args) {
//        Even or Odd
        // AND = '& with 1' (1 means true) digits remain the same
        // OR = '|' any expression true all will true
        // XOR (^) (if and only if) exclusive or  7 ^ 7 = 0


        int n = 16;
        String binaryStr = convertInBinary(n);
//        System.out.println("Binary Representation: " + binaryStr);
//        System.out.println("Decimal representation: " + convertInDecimal(binaryStr));



//        odd even without modulo %
//        System.out.println((n & 1) == 0 ? "EVEN" : "ODD");


//        System.out.println(isPrime(2));
//        System.out.println(isPrime(17));
//        System.out.println(isPrime(19));
//        System.out.println(isPrime(21));


        System.out.println(15 >> 1);
    }
    // New method for Binary to Decimal conversion
    public static int convertInDecimal(String binary) {
        int decimalValue = 0;
        int power = 0;

        // Loop from the last character to the first character
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimalValue += Math.pow(2, power);
            }
            power++;
        }
        return decimalValue;
    }
    public static String convertInBinary(int n) {
        int ans = 0;
        StringBuilder sb = new StringBuilder();
        while (n > 1) {
            int rem = n % 2;
            sb.append(rem);
            n /= 2;
        }
        sb.append(1);
        return sb.reverse().toString();
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true; // 2 aur 3 prime hain
        if (n % 2 == 0 || n % 3 == 0) return false; // Even aur 3 se divide hone wale numbers bahar

        // Loop 5 se start hoga aur har baar 6 steps aage badhega (5, 11, 17...)
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }

}
