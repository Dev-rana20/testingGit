package OOP;

interface anonymous{
    void display();
}

public class innerClassTypeAnonymous2 {
    public static void main(String[] args) {
        anonymous a= new anonymous() {
            public void display(){
                System.out.println("Anonymous inner class can create class without declaring it we are creating object of anonymous class not an object of anonymous interface");
            }
        };
        a.display();
    }
}
