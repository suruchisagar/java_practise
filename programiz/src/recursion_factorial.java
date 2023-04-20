
//find factorial using recursion

import java.util.Scanner;

public class recursion_factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number here:");
        int n= in.nextInt();
        System.out.print(factorial(n));
    }

    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return (n*factorial(n-1));
    }
}
