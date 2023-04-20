
//convert binary to octal form

import java.util.Scanner;

public class convertBinaryOctal {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number in binary form:");
        long binary= in.nextLong();
        System.out.println(binary+" in octal form is "+convertBinaryToOctal(binary));
    }

    public static int convertBinaryToOctal(long binaryNumber) {
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while (binaryNumber != 0) {
            decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
            ++i;
            binaryNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
            octalNumber += (decimalNumber % 8) * i;
            decimalNumber /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}
