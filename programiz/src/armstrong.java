import java.util.Scanner;

public class armstrong {
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
