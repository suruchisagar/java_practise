
//convert decimal to octal form

import java.util.Scanner;

public class convert_decimal_octal {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter number in decimal form:");
        int a = in.nextInt();
        System.out.println(a+" in octal form is "+convertDecimalToOctal(a));
    }

    public static int convertDecimalToOctal(int a){
        int octalNumber = 0, i = 1;

        while (a != 0)
        {
            octalNumber += (a % 8) * i;
            a /= 8;
            i *= 10;
        }

        return octalNumber;
    }
}
