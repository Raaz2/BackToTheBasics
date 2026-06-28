public class Demo {
    public static void main(String[] args) {
//        Even or Odd
        // AND = '& with 1' (1 means true) digits remain the same
        // OR = '|' any expression true all will true
        // XOR (^) (if and only if) exclusive or  7 ^ 7 = 0


        int n = 16;
        String binaryStr = convertInBinary(n);
        System.out.println("Binary Representation: " + binaryStr);
        System.out.println("Decimal representation: " + convertInDecimal(binaryStr));



//        odd even without modulo %
        System.out.println((n & 1) == 0 ? "EVEN" : "ODD");

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
}
