
//find sum of a natural number using recursion

import java.util.Scanner;

public class recursion_sum {


    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no. of terms:");
        int n= in.nextInt();
        System.out.println(printSum(n));

    }
    public static int printSum(int n){
        if (n == 0) {
           return 0;
        }
           return (n+printSum(n-1));
        }
}
