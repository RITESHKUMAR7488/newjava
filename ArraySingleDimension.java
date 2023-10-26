public class ArraySingleDimension {
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30};
         for(int i=0;i<a.length;i++){//for loop
            System.out.println(a[i]);
           
        }
         for(int i:a){
                System.out.println(i);//for each loop
            }
    }
    
}
