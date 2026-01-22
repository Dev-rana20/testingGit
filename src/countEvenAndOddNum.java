import java.util.Scanner;
public class countEvenAndOddNum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a digit to find odd and  even numbers in it");
        int num= sc.nextInt();
        int even=0,odd=0;
        if(num==0){
            System.out.println("Even: 1 Odd: 0");
            sc.close();
            return;
        }
        if(num<0){
            num=-num;
        }
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                even++;
            }
            else{
                odd++;
            }
            num=num/10;
        }
        System.out.println("Even: "+even+ " Odd: "+odd);
                sc.close();

    }
}
