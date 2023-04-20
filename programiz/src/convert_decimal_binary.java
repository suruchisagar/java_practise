
//convert decimal to binary form

import java.util.Scanner;

public class convert_decimal_binary {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number in decimal form:");
        int a= in.nextInt();
        System.out.println(a+ " in binary form is "+convertDecimalToBinary(a));
    }

    public static long convertDecimalToBinary(int a){
        long binaryNumber = 0;
        int remainder, i = 1, step = 1;

        while (a!=0) {
            remainder = a % 2;
            System.out.println("Step " + step++ + ": " + a + "/2");

            System.out.println("Quotient = " + a/2 + ", Remainder = " + remainder);
            a /= 2;

            binaryNumber += remainder * i;
            i *= 10;
        }

        return binaryNumber;
    }

}

/*
//using binary string method
public class convert_decimal_binary{
    public static void main(String[] args) {

        // decimal number
        int decimal = 91;

        // convert decimal to binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println(decimal + " in decimal = " + binary + " in binary.");
    }
}
*/
