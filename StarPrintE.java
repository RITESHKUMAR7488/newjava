public class StarPrintE {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int m=1;m<=4;m++){
            for(int n=1; n<=m; n++){
                System.out.print(" ");
            }
            for(int g=4;g>=m;g--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
