public class Overriding {
    void show(){
        System.out.println("1");
    }

    
}
class xyz extends Overriding{
    void show() {
        System.out.println("2");
    }
    public static void main(String[] args) {
        Overriding o=new Overriding();
        o.show();
        xyz x=new xyz();
        x.show();
    }
}
