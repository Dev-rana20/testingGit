package OOP;

class Employee{
    private int id=0,salary =0;
    private String name= "Dev";
    void setId(int id){
        this.id=id;
    }
    void setString(String name){
        this.name=name;
    }
    void setSalary(int salary){
        this.salary=salary;
    }
    int getId(){
        return id;
    }
    int getSalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    @Override
    public String toString(){
        return "Employee id: "+id+
        " \nEmployee name: "+name+
        " \nEmployee salary: "+salary;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Employee e =new Employee();
        e.setId(11);
        e.setSalary(2000000);
        e.setString("Dev rana");
        System.out.println(e);
    }
}
