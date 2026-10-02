package Exercises;
import java.util.Scanner;

public class Z9_BankingProgram {

    // since scanner is going to be use in different method, so make it static global
    static Scanner s = new Scanner(System.in);  
    
    public static void main(String[] args) {
        double balance=0;
        
        boolean exit = true;    
        while (exit) {
            System.out.println("\n\n**************");
            System.out.println("BANKING SYSTEM");
            System.out.println("**************");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            System.out.println("**************");
            System.out.print("Enter your choice (1-4) : ");
            int choice = s.nextInt();
            
            switch (choice) {
                case 1 -> System.out.printf("**************\nYOUR BALANCE : $%.6f\n**************", showBalance(balance));
                case 2 -> balance += deposite();
                case 3 -> balance -= withdraw(balance);
                case 4 -> exit = false;
                default -> System.out.println("INVALID CHOICE!!!");
            }
        }
        System.out.println("*****************************");
        System.out.println("Thank you ! Have a nice day !");
        System.out.println("*****************************");
        
        s.close();
    }
    
    
    // SHOW BALANCE 
    static double showBalance(double balance) {
        return balance;
    }

    // DEPOSITE 
    static double deposite() {
        System.out.print("Enter the amount : ");
        double amount = s.nextDouble();

        if (amount < 0) { System.out.println("Amount can't be negative"); return 0; }
        else { return amount; }
    }

    // WITHDRAW 
    static double withdraw(double balance) {
        System.out.print("Enter the amount : ");
        double amount = s.nextDouble();

        if (amount > balance) { System.out.println("Insufficient Funds !!"); return 0; }
        else if (amount < 0) { System.out.println("Amount can't be negative"); return 0; }
        else { return amount; }
    }
}
