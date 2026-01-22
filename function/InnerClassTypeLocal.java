package OOP;

class Outer{
    void inner(){
        class Local{
            void display(){
                System.out.println("This is a Local Innner Class ");
            }
        }
        Local l= new Local();
        l.display();
    }
}

public class InnerClassTypeLocal {
    public static void main(String[] args) {
        Outer o= new Outer();
        o.inner();
    }
}
