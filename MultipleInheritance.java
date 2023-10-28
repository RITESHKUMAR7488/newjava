interface legs{
    void show();
    
}
interface ears {
    void display();
}
class cat implements legs,ears{
    public void show(){
        System.out.println("4 legs");
        
    }
    public void display(){
        System.out.println("2 ears");
    }
    public static void main(String[] args) {
        cat c=new cat();
        c.show();
        c.display();
    }
}
