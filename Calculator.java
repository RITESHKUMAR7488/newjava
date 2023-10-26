import java.util.Scanner;//15/10/23

public class Calculator {
    public static void main (String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter your first no.");
        int no1=sc.nextInt();
        System.out.println("enter your second no.");
        int no2=sc.nextInt();
        System.out.println("enter your symbol (+,-,*,/)");
        String sym=sc.next();
        float res;
        switch(sym){
        case "+": res=no1+no2;
        System.out.println("addition is"+res);
        break;
        case "-": res=no1-no2;
        System.out.println("substraction is"+res);
        break;
        case "*": res=no1*no2;
        System.out.println("multiplicaton is"+res);
        break;
        case "/": res=((float)no1/(float)no2);
        System.out.println("divison is"+res);
        break;
        
        default : System.out.println("wrong symbole");       
        break;

        }



    }
    
}
