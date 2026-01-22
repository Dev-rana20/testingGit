package OOP;

class Outer{
   static int x=10;
    static class Inner{
        void display(){
            System.out.println("The value of X is: "+ x);
        }
    }
}

public class InnerclassTypeStatic {
    public static void main(String[] args) {
        Outer.Inner i= new Outer.Inner();
        i.display();
    }
}
