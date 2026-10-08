package Z1_Exercises;
import java.util.Random;
import java.util.Scanner;

public class Z9_RollingDice {
    public static void main(String[] args) {
        System.out.println("ROLLING DICE\n");
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int NumOfDice;
        int total = 0;

        System.out.print("Enter no. of dice to roll : ");
        NumOfDice = s.nextInt();
        if (NumOfDice < 1) { System.out.println("Number of Dice must be greater than 0 !"); }
        else {
            for (int i = 1; i <= NumOfDice; i++) {
                int roll = r.nextInt(1,7);
                System.out.println("You rolled :");
                printDie(roll);
                total += roll;
            }
            System.out.println("Total is " +total);
        }
        s.close();
    }
    
    static void printDie(int roll) {
        String dice1 = """
                  -------
                 |       |
                 |   ●   |
                 |       |
                  -------
                """;
        String dice2 = """
                  -------
                 | ●     |
                 |       |
                 |     ● |
                  -------
                """;
        String dice3 = """
                  -------
                 | ●     |
                 |   ●   |
                 |     ● |
                  -------
                """;
        String dice4 = """
                  -------
                 | ●   ● |
                 |       |
                 | ●   ● |
                  -------
                """;
        String dice5 = """
                  -------
                 | ●   ● |
                 |   ●   |
                 | ●   ● |
                  -------
                """;
        String dice6 = """
                  -------
                 | ●   ● |
                 | ●   ● |
                 | ●   ● |
                  -------
                """;
        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll !");
        }
    }
}
