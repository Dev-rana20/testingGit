package OOP;

class Animal{
    void voice(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void voice(){
        System.out.println("Dog barks");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal obj= new Animal();
        Animal obj2= new Dog();
        obj.voice();
        obj2.voice();
    }
}
