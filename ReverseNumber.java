import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("enter your number");
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int rem;
        int rev=0;
        while(no!=0){
            rem=no%10;
            rev=rev*10+rem;
            no=no/10;

        }
        System.out.println(rev);

    }
    
}
