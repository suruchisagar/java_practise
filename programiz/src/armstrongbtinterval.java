
//armstrong no. between intervals
import java.util.Scanner;
public class armstrongbtinterval {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first term:");
        int a= in.nextInt();
        System.out.print("Enter last term:");
        int b= in.nextInt();
        int count=0;
        int sum=0;
        for(int i=a+1; i<b; i++){
            int c=i;

        //count no. of digits
          while(c!=0){
            c/=10;
            count=count+1;
          }
          c=i;
          while(c!=0){
                //finding the digits
                int rem=c%10;
                int prod=1;
                //calculating a^b using for loop
                for(int j=1;j<=count;j++) {
                    prod = prod * rem;
                }
                sum=sum+prod;
                c/=10;
          }
          c=i;
          if(c==sum){
                System.out.println(c);
          }

        }
    }
}

/*
class armstrongbtinterval {
    public static void main(String[] args) {

        int low = 999, high = 99999;

        for(int number = low + 1; number < high; ++number) {
            int digits = 0;
            int result = 0;
            int originalNumber = number;

            // number of digits calculation
            while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }

            originalNumber = number;

            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                int remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

            if (result == number) {
                System.out.print(number + " ");
            }
        }
    }
}
*/