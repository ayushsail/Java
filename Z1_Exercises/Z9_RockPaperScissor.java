package Z1_Exercises;
import java.util.Scanner;
import java.util.Random;

public class Z9_RockPaperScissor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("******************");
        System.out.println("ROCK PAPER SCISSORS");
        System.out.println("******************\n");

        String[] choices = {"rock", "paper", "scissors"};
        String userChoice;
        String computerChoice = choices[r.nextInt(3)];
        String playagain = "yes";


        do {
            System.out.print("Enter your choice (rock, paper, scissors) : ");
        userChoice = s.nextLine().toLowerCase();
        
        if (!userChoice.equals("rock") && 
            !userChoice.equals("paper") &&
            !userChoice.equals("scissors")) {
            System.out.println("INVALID INPUT !!");
            continue;
        }
        
        else {
            System.out.println("Computer choice : " +computerChoice);
            
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie !\n"); 
            }
            
            else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    userChoice.equals("scissor") && computerChoice.equals("paper") ||
                    userChoice.equals("paper") && computerChoice.equals("rock")) {

                System.out.println("You Win !\n");
            }

            else { System.out.println("You Lose !\n"); }

            System.out.print("Play again ? (yes/no) : ");
            playagain = s.nextLine();
        }

        }while(playagain.equals("yes"));

        System.out.println("Thanks for playing !");
        

        s.close();
    }
}
