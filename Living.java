// abstract class Living {
//     abstract void move();   
    
// }
 class Animals extends Living{
    void move(){
        System.out.println("walk");
    }

}
 class Bird extends Living{
    void move(){
        System.out.println("fly");
    }
    
}
class test{
    public static void main(String[] args) {    
        Bird b=new Bird();
        b.move();
        Animals a=new Animals();
        a.move();
    }
}
