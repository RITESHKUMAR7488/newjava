public class ArmstrongBeta {
    public static void main(String[] args) {
        int no=153;
    double temp=no;
    int rem;
    double sum=0;
    while(no!=0){
        rem=no%10;
        sum=sum+Math.pow(rem,3);
        no=no/10;


    }
    if(temp==sum){
        System.out.println(temp+" is aarmstrong number");
    }
    else{
        System.out.println(temp+" is not a armstrong number");
    }
        
    }
    
    
}
