
//display factors of a number
import java.util.Scanner;
public class display_factors {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter a number here:");
        int n= in.nextInt();
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }

    }
}

