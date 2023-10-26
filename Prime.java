import java.util.Scanner;

public class Prime{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int no=sc.nextInt();
        int tem=0;
        for(int i=2; i<=no; i++)
        {
            if(no%i==0){
                tem=tem+1;
            }

        }
        if(tem>0){
            System.out.println(no+ " is not a prime no.");
        }
        else{
            System.out.println(no+" is a prime no.");
        }
    }
}