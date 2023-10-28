class sound{
    int i;
    void setvalue(int i){
        this.i=i;


    }
    void paper(){
        System.out.println(i);
    }

}
class cons{
    public static void main(String[] args) {
        sound t=new sound();
        t.setvalue(10);
        t.paper();

    }
}
