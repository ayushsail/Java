package Z1_Exercises;
import java.util.Scanner;
import java.util.Random;

public class Z9_SlotMachine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Random r = new Random();

        System.out.println("****************************");
        System.out.println("WELCOME TO JAVA SLOT MACHINE");
        System.out.println("     Symbols : $ # @ & ?");
        System.out.println("****************************");
        
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;


        while (balance > 0) {
            // Current Balance and Bet input
            System.out.println("\nCurrent Balance : $" + balance);
            System.out.print("Place your bet amount : ");
            bet = s.nextInt();
            s.nextLine();

            // Bet Validation
            if (bet > balance) { System.out.println("INSUFFICIENT BALANCE\n"); continue; }
            else if (bet <=0) { System.out.println("Bet must be greater than 0\n"); continue;}

            else {
                balance -= bet;
            }

            // Slot spinning & payout
            System.out.println("SPINNING......");

            row = spinRow();

            printRow(row);

            payout = getPayout(row,bet);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            }
            else { System.out.println("Sorry you lost this round !"); }

            // Play again case
            System.out.print("Do you want to play again (Y/N) : ");
            playAgain = s.nextLine().toUpperCase();

            if (playAgain.equals("N")) { break; }

        }
        System.out.println("GAME OVER ! Your final Balance is " + balance);
        
        
        s.close();
    }


    // Spin Row method
    static String[] spinRow () {

        String[] symbols = {"$","#","@","&","?"};
        String[] row = new String[3];
        Random r = new Random();

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[r.nextInt(symbols.length)];
        }

        return row;
    }


    // Print Row method
    static void printRow (String[] row) {
        System.out.println("***********");
        System.out.println(" " + String.join(" | ",row));
        System.out.println("***********");
    }


    // Get Payout method
    static int getPayout (String[] row, int bet) {
        // if 3 symbols matched
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "?" -> bet*3;
                case "#" -> bet*4;
                case "@" -> bet*5;
                case "&" -> bet*10;
                case "$" -> bet*20;
                default -> 0;
            };
        }
        // if 2 symbols matched
        else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "?" -> bet*1;
                case "#" -> bet*2;
                case "@" -> bet*3;
                case "&" -> bet*5;
                case "$" -> bet*10;
                default -> 0;
            };
        }
        // if 2 symbols matched
        else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "?" -> bet*1;
                case "#" -> bet*2;
                case "@" -> bet*3;
                case "&" -> bet*5;
                case "$" -> bet*10;
                default -> 0;
            };
        }
        // if 2 symbols matched
        else if (row[0].equals(row[2])) {
            return switch (row[0]) {
                case "?" -> bet*1;
                case "#" -> bet*2;
                case "@" -> bet*3;
                case "&" -> bet*5;
                case "$" -> bet*10;
                default -> 0;
            };
        }
        return 0;
    }
}
