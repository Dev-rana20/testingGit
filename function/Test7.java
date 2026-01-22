package OOP;
//Generating roll_no of student Automatically
import java.time.LocalDate;

class Student {

    private String roll_no;
    static private int count=1;

    private String assignRollNo(){
       int year = LocalDate.now().getYear();
        String rn = "Uni-" + year + "-" + count;
        count++;
        return rn;
    }

     Student(){
        roll_no=assignRollNo();
    }
    public String getRollNo(){
        return roll_no;
    }
}

public class Test7 {
    public static void main(String[] args) {
        Student s =new Student();
        Student s1 =new Student();
        Student s2 =new Student();
        System.out.println(s.getRollNo());
        System.out.println(s1.getRollNo());
        System.out.println(s2.getRollNo());
    }
}
