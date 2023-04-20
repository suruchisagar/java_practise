
//convert binary to decimal form


import java.util.Scanner;

public class convert_binary_decimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number in binary:");
        long a = in.nextLong();
        System.out.println(a + " in decimal form is " + convertBinaryToDecimal(a));
    }

    public static int convertBinaryToDecimal(long a) {
        int decimalNumber = 0, i = 0;
        long remainder;

        while (a != 0) {
            remainder = a % 10;
            a /= 10;
            decimalNumber += remainder * Math.pow(2, i);
            ++i;
        }
        return decimalNumber;

    }
}

/*
//using parseInt method
class Main {
    public static void main(String[] args) {

        // binary number
        String binary = "01011011";

        // convert to decimal
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(binary + " in binary = " + decimal + " in decimal.");
    }
}
*/