package Z1_Exercises;
import java.util.Scanner;

public class Z9_MadLibs {
    public static void main(String[] args) {
        System.out.println("MAD LIBS GAME\n");

        Scanner s = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective(description) : ");
        adjective1 = s.nextLine();
        System.out.print("Enter an noun(animal/person) : ");
        noun1 = s.nextLine();
        System.out.print("Enter an adjective(description) : ");
        adjective2 = s.nextLine();
        System.out.print("Enter an verb(action) ending with ing : ");
        verb1 = s.nextLine();
        System.out.print("Enter an adjective(description) :");
        adjective3 = s.nextLine();


        System.out.println("\n\nToday I went to a " +adjective1+ " zoo.");
        System.out.println("In an exhibit, I saw a " +noun1+ ".");
        System.out.println(noun1+ " was " +adjective2+ " and " +verb1+ ".");
        System.out.println("I was " +adjective3+ "!!!");

        s.close();
    }
}
