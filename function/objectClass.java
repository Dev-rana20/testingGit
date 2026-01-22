package OOP;

public class objectClass {
    @Override
    public String toString(){
        return "student details";
    }
    public static void main(String[] args) {
        objectClass obj= new objectClass();

       String s=  obj.toString();
       System.out.println(s);
    }
}
