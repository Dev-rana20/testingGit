package OOP;
import java.util.Scanner;
enum Day{
    MON,TUE,WED,THU,FRI,SAT,SUN
}

public class enumExample {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a first 3 letter of a day: ");
        String s= sc.next().toUpperCase();
        Day d= Day.valueOf(s);
        switch (d) {
            case MON:
                System.out.println("Monday");
                break;
            case TUE:
                System.out.println("Tuesday");
                break;
            case WED:
                System.out.println("Wednesday");
                break;
            case SAT:
                System.out.println("WeekEnd");
                break;
            case SUN:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Other Day");
                break;
        }
        sc.close();
    }
}
