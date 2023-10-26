public class Employee {
    String name;
    int e_id;
    
        Employee(String name,int e_id){
            this.name=name;
            this.e_id=e_id;

        }
    
    public static void main(String[] args) {
        Employee e1=new Employee("ritesh",10);
        Employee e2=new Employee("nitesh",78);
        System.out.println("Employee 1: "+e1.name+" "+e1.e_id);
        System.out.println("Employee 2: "+e2.name+" "+e2.e_id);
    }
    
}
