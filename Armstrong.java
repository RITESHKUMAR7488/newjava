public class Armstrong {
    public static void main(String[] args) {
        int no=1;
        int t1=no;
     
        int length =0;
        while(t1!=0){
            t1=t1/10;
            length=length+1;
        }
      int t2=no;
      int rem;
      int arm=0;
      while(t2!=0){
        rem=t2/10;
        int mul=1;
        for(int i=1;i<=length;i++){
            mul=mul*rem;
        }
        arm=arm+mul;
        t2=t2/10;
      }
      if(no==arm){
        System.out.println(no+"no is armstrong");
      }
      else{
        System.out.println(no+"is not armstrong");
      }
    }
    
}
