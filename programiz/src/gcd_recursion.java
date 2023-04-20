
//find gcd(hcf) using recursion

import java.util.Scanner;

public class gcd_recursion {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= in.nextInt();
        System.out.print("Enter last number:");
        int b= in.nextInt();
        System.out.println(gcd(a,b));
    }

    public static int gcd(int a, int b){
        int gcd=1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}
