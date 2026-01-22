package OOP;

class Car {

    class Engine {
        void details() {
            System.out.println("This vehicle has 2200cc engine.");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Car c = new Car();
        Car.Engine e = c.new Engine();
        e.details();
    }
}
