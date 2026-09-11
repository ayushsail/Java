import java.util.Scanner;

public class Z9_BankingProgram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        boolean exit = true;
        
        while (exit) {
            System.out.println("*********BANKING SYSTEM*********");
            System.out.println("1.Show Balance");
            System.out.println("2.Deposite");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit"); 
            System.out.println("********************************");
            System.out.print("Enter your choice (1-4) : ");
            int choice = s.nextInt();
            
            switch (choice) {
                case 1 -> System.out.println("show balance");
                case 2 -> System.out.println("Deposite");
                case 3 -> System.out.println("Withdraw");
                case 4 -> exit = false;
                default -> System.out.println("INVALID CHOICE!!!");
            }
        }
        // double balance;

        while (exit) {
            
        }


        s.close();
    }

}
