
//check whether the number is an armstrong or not.

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number here:");
        int n= in.nextInt();
        int original_no=n;
        int a=n;
        int sum=0;
        int count=0;
        //counting digits
        while(n!=0){
            n/=10;
            count++;
        }
        while(a!=0){
            //finding the digits
            int rem=a%10;
            int prod=1;
            //calculating a^b using for loop
            for(int i=1;i<=count;i++) {
                prod = prod * rem;
            }
                sum=sum+prod;
                a/=10;
        }
        if(original_no==sum){
            System.out.println("Armstrong no.");
        }else{
            System.out.println("Not an armstrong no.");
        }
    }
}
