public class StarPrintI {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print(" ");
            }
            for(int m=1;m<=i;m++){
                if(i>=2 && m>1){
                    System.out.print(" ");

                }
                else{
                    System.out.print("*");
                }
            }
            System.err.println();
        }
    }
    
}
