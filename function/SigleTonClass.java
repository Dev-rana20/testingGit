package OOP;

class CoffieMachine{

    private float coffieQty;
    private float sugerQty;
    private float waterQty;
    private float milkQty;

    static private CoffieMachine my=null;

    private CoffieMachine(){
        coffieQty=1;
        sugerQty=1;
        waterQty=1;
        milkQty=1;
    }

    public void fillWater(float qty){
        waterQty=qty;
    } 
    public void fillsuger(float qty){
        sugerQty=qty;
    }
    public float getCoffiee(){
        return 0.23f;
    }

    static CoffieMachine getInstance(){
        if(my==null){
            my =new CoffieMachine();

        }
        return my;
    }

}

public class SigleTonClass {
    public static void main(String[] args) {
        CoffieMachine m1= CoffieMachine.getInstance();
        CoffieMachine m2 = CoffieMachine.getInstance();

        if(m1==m2){
            System.out.println("Same");
        }
    }
}
