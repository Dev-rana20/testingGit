package OOP;

interface Demo{
    void show();
}

public class innerClassTypeAnonymous {
    public static void main(String[] args) {
        Demo d =new Demo() {
            public void show(){
                System.out.println("An example of Anonymous Inner Class.");
            }
        };
        d.show();
    }
}
