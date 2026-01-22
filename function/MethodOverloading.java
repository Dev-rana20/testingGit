package OOP;

public class MethodOverloading {
    void sum(int a , int b){
        System.out.println("Addition : "+(a+b));
    }
    void sum(int a , int b, int c){
        System.out.println("Addition of 3 numbers : "+(a+b+c));
    }
    void sum(double a, double b){
        System.out.println("Addition of double number : "+(a+b));
    }
    public static void main(String[] args) {
        MethodOverloading obj= new MethodOverloading();
        obj.sum(10,20);
        obj.sum(10,20,30);
        obj.sum(10d,10d);

    }
}
