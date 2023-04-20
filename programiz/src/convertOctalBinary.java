
//convert octal to binary form

import java.util.Scanner;

public class convertOctalBinary {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number in octal form:");
        int octal= in.nextInt();
        System.out.println(octal+" in binary form is "+convertOctalToBinary(octal));
    }

    public static long convertOctalToBinary(int octalNumber) {
        int decimalNumber = 0, i = 0;
        long binaryNumber = 0;

        while (octalNumber != 0) {
            decimalNumber += (octalNumber % 10) * Math.pow(8, i);
            ++i;
            octalNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
            binaryNumber += (decimalNumber % 2) * i;
            decimalNumber /= 2;
            i *= 10;
        }

        return binaryNumber;
    }
}
