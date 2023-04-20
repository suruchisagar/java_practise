
//convert octal to decimal form

import java.util.Scanner;

public class convert_octal_decimal {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter number in octal form:");
        int a= in.nextInt();
        System.out.println(a+" in decimal form is "+convertOctalToDecimal(a) );
    }
    public static int convertOctalToDecimal(int octal)
    {
        int decimalNumber = 0, i = 0;

        while(octal != 0)
        {
            decimalNumber += (octal % 10) * Math.pow(8, i);
            ++i;
            octal/=10;
        }

        return decimalNumber;
    }

}
