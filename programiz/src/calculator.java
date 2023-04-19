
//make simple calculator using switch case
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= in.nextInt();
        System.out.print("Enter second number:");
        int b=in.nextInt();
        System.out.println("enter 1 for +\n" +
                "enter 2 for -\n" +
                "enter 3 for *\n" +
                "enter 4 for /\n" +
                "enter 5 for %");
        System.out.print("Enter the command here:");
        int c= in.nextInt();
        //enter 1 for +
        //enter 2 for -
        //enter 3 for *
        //enter 4 for /
        //enter 5 for %
        //using enhanced switch operator
        switch (c) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
            case 5 -> System.out.println(a % b);
        }

    }
}
