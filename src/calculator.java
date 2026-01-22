import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        System.out.println("ENTER TWO NUMBERS FOR CALCULATION..!");
        Scanner sc= new Scanner(System.in);
        double a= sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("SELECT OPERATOR + - % / *");
        char c=sc.next().charAt(0);
        switch(c){
            case '+':
                System.out.println(a+b);
                break;
                case '-':
                System.out.println(a-b);
                break;
                case '%':
                System.out.println(a%b);
                break;
                case '/':
                System.out.println(a/b);
                break;
                case '*':
                System.out.println(a*b);
                break;
                default :
                System.out.println("INVALID OPERATOR");
                break;
        }
                sc.close();

    }
}
