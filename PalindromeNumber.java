import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter your no.");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int rev=0;
        int rem;
        while(a!=0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;


        }
        
        if(rev==temp){
            System.out.println("is palindrome");

        }
        else{
            System.out.println("is not palindrome");
        }
    }

        
    }
    

