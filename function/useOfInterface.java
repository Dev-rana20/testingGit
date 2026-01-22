package OOP;

 interface payment {
    void pay();
}
class UPI implements payment{
    @Override
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}
class cardPayment implements payment{
    @Override
    public void pay(){
        System.out.println("Payment done using Cradit card");
    }
}
public class useOfInterface {
    public static void main(String [] args){
        UPI u= new UPI();
        payment p= new cardPayment();
        p.pay();
        u.pay();
    }
}
