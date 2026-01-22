package OOP;

public class studentInfo {
    int id;
    String name;
    studentInfo(int id ,String name ){
       this.id=id;
       this.name=name;
    }
    public static void main(String[] args) {
        studentInfo s1=new studentInfo(1,"Dev");
        System.out.println("id: "+s1.id+" Name: "+s1.name);
    }
}
