package Z1_Exercises;
import java.util.Scanner;

public class Z9_QuizGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        String[] questions = {"What is the main function of router ?",
                              "Which part of the computer is considered the brain ?",
                              "What year was Facebook launched ?",
                              "Who is know as the father of computer ?",
                              "What was the first programming language ?"};
        
        String[][] options = {{"1. Storing Files","2. Encrypting Data","3. Directing internet traffic","4. Managing passwords"},
                              {"1. CPU","2. Hardrive","3. RAM","4. GPU"},
                              {"1. 2000","2. 2004","3. 2006","4. 2008"},
                              {"1. Steve Jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
                              {"1. COBOL","2. C","3. Fortran","4. Assembly"}};
        
        int[] answers = {3, 1, 2, 4, 3};

        int guess; 
        int score = 0;
        
        System.out.println("***************************");
        System.out.println("WELCOME TO JAVA QUIZ GAME !");
        System.out.println("***************************");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
                
            }
            System.out.print("Enter your guess : ");
            guess = s.nextInt();

            if (guess == answers[i]) {
                score++;
                System.out.println("*********");
                System.out.println("CORRECT !");
                System.out.println("*********\n");
            }
            else {
                System.out.println("*********");
                System.out.println("WRONG !");
                System.out.println("*********\n");
            }

        }

        System.out.println("The Score : " +score+ " Out of " +questions.length );

        

        s.close();
    }
}