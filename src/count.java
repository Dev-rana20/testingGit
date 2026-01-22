import java.util.Scanner;
public class count {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       System.out.print("Enter a large number:");
       int num= sc.nextInt();
       int count=0;
        if(num==0){
            count=1;
            System.out.println("There is only "+count+" digit.");
        }
        else{
            if(num<0){
                num=-num;
            }
            while(num>0){
                num=num/10;
                 count++;

            }
            System.out.println("There are total "+count+" digits.");
        }
        sc.close();
    }
}
