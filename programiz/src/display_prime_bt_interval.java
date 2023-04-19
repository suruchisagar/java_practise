
import java.util.*;
public class display_prime_bt_interval {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first term:");
        int a= in.nextInt();
        System.out.print("Enter last term:");
        int b= in.nextInt();
        while (a<b){
            if(checkPrimeNumber(a)) {
                System.out.print(a + " ");
            }
            a++;
        }


    }

    //creating function to check prime no.
        public static boolean checkPrimeNumber(int num) {
            boolean flag = true;

            for(int i = 2; i <= num/2; ++i) {

                if(num % i == 0) {
                    flag = false;
                    break;
                }
            }

            return flag;
        }
    }

