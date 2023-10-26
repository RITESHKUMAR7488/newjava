import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
     System.out.println("enter word");
     Scanner sc=new Scanner(System.in);
     String word=sc.nextLine();
     int size=word.length();
     String rev="";
     for(int i=size-1; i>=0; i--){
        rev=rev+word.charAt(i);
     }
     System.out.println(rev);

    
       
    }
    
}
