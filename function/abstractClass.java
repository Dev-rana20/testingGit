package OOP;

abstract class vehical{
    abstract void start();
    void info(){
        System.out.println("It is Ferrari");
    }
}
class car extends vehical{
    @Override
    void start(){
        System.out.println("It starts with key");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        car c =new car();
        c.start();
        c.info();
    }
}
