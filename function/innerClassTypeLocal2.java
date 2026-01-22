package OOP;

class globel{
    void display(){
        class Local{
            void show(){
                System.out.println("This class belongs to globel.");
            }
        }
        Local l=new Local();
        l.show();
    }
}

public class innerClassTypeLocal2 {
    public static void main(String[] args) {
        globel g= new globel();
        g.display();
    }
}
