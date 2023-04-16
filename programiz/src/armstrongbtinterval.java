
//armstrong no. between intervals
import java.util.Scanner;
public class armstrongbtinterval {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first term:");
        int a= in.nextInt();
        System.out.print("Enter last term:");
        int b= in.nextInt();
        for(int i=a; i<=b; i++){
            int original_no=i;
            int sum=0;

            while(i!=0){
                int rem=i%10;
                sum+=(rem*rem*rem);
                i/=10;
            }
            if(original_no==sum){
                System.out.println(original_no);
            }

        }
    }
}
