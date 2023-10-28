interface I1{
    void show();

}
class TEst implements I1{
    public void show(){
        System.out.println("1");
    }
    public static void main(String[] args) {
        TEst t=new TEst();
        t.show();
    }

}

