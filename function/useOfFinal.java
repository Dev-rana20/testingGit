package OOP;

class College{
     final String name="Sigma University";
     final void clgName(String name){
        System.out.println("student name is : "+ name);
     }
}
class Student extends College{
    void studentName(String name){
        clgName(name);
    }
}

public class useOfFinal {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.studentName("Dev");
    }
}
