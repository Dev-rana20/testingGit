package OOP;

import java.util.Scanner;

class AccountInfo {

    private int balance = 0;

    // deposit method
    void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Total Balance: " + balance);
        } else {
            System.out.println("Amount cannot be negative!");
        }
    }

    // withdraw method
    void withdraw(int amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // getter (good practice)
    int getBalance() {
        return balance;
    }
}

public class bankAccount {
    public static void main(String[] args) {

        AccountInfo ac = new AccountInfo();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        int dep = sc.nextInt();
        ac.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        int wd = sc.nextInt();
        ac.withdraw(wd);

        System.out.println("Final Balance: " + ac.getBalance());

        sc.close();
    }
}