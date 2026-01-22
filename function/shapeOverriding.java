package OOP;
class Shape{
    void draw(){
        System.out.println("Draw any shape");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw a circle");
    }
}

public class shapeOverriding {
    public static void main(String[] args) {
        Shape s1= new Shape();
        Shape s2= new Circle();
        s1.draw();
        s2.draw();  
    }
}
