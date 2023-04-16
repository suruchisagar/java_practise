/*
//print an integer entered by user
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int n = in.nextInt();
        System.out.println(n);
    }
}
*/
/*
//add two integers
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer:");
        int a = in.nextInt();
        System.out.print("Enter second integer:");
        int b= in.nextInt();
        int sum= a+b;
        System.out.println("Sum of given integers are:"+ sum);
    }
}
*/
/*
//multiply two floating point numbers
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first floating point number:");
        double a= in.nextFloat();
        System.out.println("Enter second floating point number:");
        double b= in.nextFloat();
        double mult= a*b;
        System.out.println("The multiplication of two floating point numbers are:"+mult);
    }
}
*/
/*
//find ascii value of a character
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //char a ='a';
        System.out.print("Enter a character here:");
        char a= in.next().charAt(0);
        int ascii = (int) a;
        System.out.println(ascii);
    }
}
*/
/*
//compute quotient and remainder
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a dividend:");
        double a = in.nextFloat();
        System.out.print("Enter a divisor:");
        double b= in.nextFloat();
        double q = a/b;
        double r =a%b;
        System.out.println("The quotient and remainder are "+ q + " and " + r + " respectively.");
    }
}
*/
/*
//swap two numbers
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = in.nextInt();
        System.out.println("Enter second number:");
        int b= in.nextInt();;
        int temp= a;
        a=b;
        b=temp;
        System.out.println(a);
        System.out.println(b);
    }
}
*/
/*
//check a number is even or odd
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a whole number:");
        int n = in.nextInt();
        if(n%2==0){
            System.out.println(n+" is an even number.");
        }else{
            System.out.println(n+" is an odd number.");
        }
    }
}
*/
/*
//alphabet is vowel or consonant
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a character here:");
        char a = in.next().charAt(0);
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            System.out.println(a+ " is a vowel.");
        }else{
            System.out.println(a +" is a consonant.");
        }
    }
}
*/
/*
//largest among three numbers
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b= in.nextInt();
        int c= in.nextInt();
        int max= a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max);
    }
}
*/
/*
//all roots of the quadratic equation
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        //value of a,b and c
        int a= in.nextInt();
        int b= in.nextInt();
        int c = in.nextInt();
        double root1, root2;
        double determinant =b*b - 4*a*c;
        //check determinant is greater or equal or less than 0
        if(determinant>0){
            root1=(-b + Math.sqrt(determinant))/(2*a);
            root2=(-b - Math.sqrt(determinant))/(2*a);
            System.out.println(root1+" "+root2);
        } else if (determinant==0){
            root1 = root2= -b/(2*a);
            System.out.println(root1+" "+root2);

        }else{
            double real =-b/(2*a);
            double imaginary= Math.sqrt(-determinant)/(2*a);
            System.out.println(real+" "+imaginary);
        }

    }
}
*/
/*
//check leap year
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a year:");
        int n= in.nextInt();
        //check year is divisible by 4 but not by 100 or year is divisible by 400
        if(((n%4==0) && (n%100!=0)) || (n%400==0)){
            System.out.println("Leap year");
        }else{
            System.out.println("Not leap year");
        }
    }
}
*/
/*
//check a number is positive or negative
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number:");
        int n= in.nextInt();
        if(n>0){
            System.out.println(n+" is a positive number.");
        }else if(n<0){
            System.out.println(n+" is a negative number.");
        }else{
            System.out.println(n+ " is neither positive nor negative.");
        }

    }
}
*/

/*
//check whether a character is alphabet or not
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char ch= in.next().charAt(0);
        if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z')){
            System.out.println(ch+ " is an alphabet.");
        }else{
            System.out.println(ch +" is not an alphabet.");
        }
    }
}
*/
/*
//calculate sum of natural number
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the terms upto which you want to calculate sum of natural numbers:");
        int n= in.nextInt();
        int sum=0;
        for(int i=1; i<=n; i++){
            sum= sum+i;
        }
        System.out.println("Sum is: "+sum);
    }
}
*/
/*
//factorial of a number
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number here:");
        int n = in.nextInt();
        int fact=1;
        while(n!=0){
            fact=fact*n;
            n--;
        }
        System.out.println("Factorial of "+n+ " is "+fact);
    }
}
*/
/*
//generate multiplication table
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number here:");
        int n= in.nextInt();

        for(int i=1; i<=10; i++){
            int mult= n*i;
            System.out.println(n+" * "+i+" = "+mult);
        }
    }
}
*/
/*
//fibonacci series
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no. of terms:");
        int n= in.nextInt();
        int first_term=0;
        int second_term=1;
        int i=1;
        while(i<=n){
            System.out.print(first_term+" ");
            int next_term= first_term+second_term;
            first_term=second_term;
            second_term=next_term;
            i++;
        }
    }
}
*/

/*
//find gcd(hcf) of two numbers
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = in.nextInt();
        System.out.print("Enter second number:");
        int b= in.nextInt();
        int gcd=1;
        for(int i=1; i<=a && i<=b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
*/
/*
//lcm of two numbers
//algorithm
//Initialize A and B with positive integers.
//Store maximum of A & B to the max.
//Check if max is divisible by A and B.
//If divisible, Display max as LCM.
//If not divisible then step increase max, go to step 3


import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = in.nextInt();
        System.out.print("Enter second number:");
        int b= in.nextInt();
        int max, step;
        int lcm=0;
        if(a > b){
         max = step = a;
      }
      else{
         max = step = b;
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0) {
            lcm = max;
            break;
         }
         max += step;
      }
      System.out.println("LCM of given numbers is :: "+lcm);
    }
}
*/
/*
//display alphabet a to z using loops
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char ch;
        for(ch='A'; ch<='Z'; ch++){
            System.out.print(ch+" ");
        }
    }
}
*/
/*
//count the number of digits
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number here:");
        int n =in.nextInt();
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
*/
/*
//reverse a number
import java.util.*;
public class programiz{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number here:");
        int n= in.nextInt();
        int rev=0;
        while(n!=0){
            int rem= n%10;
            rev= rev*10+rem;
            n= n/10;
        }
        System.out.println(rev);

    }
}
*/
/*
//calculate the power of the number
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter base value:");
        int base= in.nextInt();
        System.out.print("Enter exponent value:");
        int exponent= in.nextInt();
        int result=1;
        while(exponent!=0){
            result= result*base;
            exponent--;
        }
        System.out.println(result);
    }
}
*/
/*
//check palindrome
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String ch= in.next();
        int len=ch.length();
        String rev= "";
        for(int i= ch.length()-1; i>=0; i--) {
            rev= rev+ch.charAt(i);
        }
        if(rev.toLowerCase().equals(ch.toLowerCase())){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
*/
/*
//check prime number
import java.util.*;
public class programiz {
    public static boolean isPrime(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                return true;
                  return false;
            }
        }
    }
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
            System.out.println(isPrime(num));
    }
}
*/
/*
import java.util.*;

//check prime no.
public class programiz{

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num = in.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for nonprime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
*/
/*
//check prime no.
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number here:");
        int n= in.nextInt();
        int count=0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                count=count+1;
                i++;
            }
        }
        if(count==2){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
*/

/*
//display prime numbers between two intervals
import java.util.*;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter no.1:");
        int a= in.nextInt();
        System.out.print("Enter no.2:");
        int b= in.nextInt();
        int i,j;

        for(i=a; i<=b; i++){
            int count=0;
            for(j=1; j<=i; j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
        }

        }
    }
}
*/
/*
//check armstrong number
import java.util.*;
import java.util.Scanner;
public class programiz {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number here:");
        int n= in.nextInt();
        int original_no=n;
        int sum=0;
        while(n!=0){
            int rem= n%10;
            sum+=(rem*rem*rem);
            n/=10;
        }
        if(original_no==sum){
            System.out.println("Armstrong no.");
        }else{
            System.out.println("Not an armstrong no.");
        }
    }

}
*/





























































































