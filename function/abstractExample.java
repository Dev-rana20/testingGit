package OOP;

abstract class Bank{
    abstract void getInterestRate();
    void bankName(){
        System.out.println("Bank of Baroda");
    }
}

class SBI extends Bank{
    @Override
    void getInterestRate(){
        System.out.println("Interest rate is 6%");
    }
}

public class abstractExample {
    public static void main(String[] args) {
        Bank b= new SBI();
        b.bankName();
        b.getInterestRate();
    }
}
