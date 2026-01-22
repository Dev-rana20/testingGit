package OOP;

public class constructorOverloading {
    int id;
    String name;
    double salary;
    constructorOverloading(){
    }
    constructorOverloading(int id, String name){
        this.id=id;
        this.name=name;
    }
    constructorOverloading(int id,String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public static void main(String[] args) {
        constructorOverloading c1= new constructorOverloading();
        constructorOverloading c2= new constructorOverloading(10,"dev");
        constructorOverloading c3= new constructorOverloading(10,"dev",10000d);
        System.out.println("Id: "+c1.id+" Name: "+c1.name+" Salary: "+c1.salary);
        System.out.println("Id: "+c2.id+" Name: "+c2.name+" Salary: "+c2.salary);
        System.out.println("Id: "+c3.id+" Name: "+c3.name+" Salary: "+c3.salary);

    }
}
