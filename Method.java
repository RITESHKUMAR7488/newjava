public class Method {
    public static void main(String[] args) {
        System.out.println("1");
        Method buzo=new Method();
        buzo.run();
        buzo.eat();
        Birds sp=new Birds();
        sp.fly();
    
    }
    public void run(){
        
        System.out.println("i m running");
        
    }
    void eat(){
        System.out.println("i am eating choclates");
    }
    
    
}
class Birds{
    void fly(){
        System.out.println("i m flying");

    }
}
 
    



