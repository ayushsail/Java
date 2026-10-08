package Z1_Exercises;
import java.util.Random;
import java.util.Scanner;

public class Z9_NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("NUMBER GUESSING GAME\n");

        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int guess = 0;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int random = r.nextInt(min,max+1);
        // System.out.println(random);

        do {
            System.out.printf("Enter a number guess (%d to %d) : ",min,max);
            guess = s.nextInt();
            attempts += 1;

            if (guess < random) {
                System.out.println("TOO LOW!!! TRY AGAIN!");
            }
            else if (guess > random) {
                System.out.println("TOO HIGH!!! TRY AGAIN!");
            }
            else {
                System.out.println("Bingo!!! You guessed the number in " + attempts + " attempts");
                System.out.println("The number is " + random);
            }

        } while (guess != random);

        s.close();
    }
}
