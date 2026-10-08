package Z2_Projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Z2_Hangman {
    public static void main(String[] args) {
        System.out.println("***********************");
        System.out.println("WELCOME TO HANGMAN GAME");
        System.out.println("***********************");
        System.out.println("     DOMAIN: Fruit     \n\n");
        Scanner s = new Scanner(System.in);

        String filePath = "D:\\ULTRON\\JAVA\\Z2_Projects\\words.txt";
        ArrayList<String> wordList = new ArrayList<>();

        try (BufferedReader r = new BufferedReader(new FileReader(filePath))) {
            String word;

            while ((word = r.readLine()) != null) {
                wordList.add(word);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }
        catch (IOException e) {
            System.out.println("Something went wrong !");
        }
        
        Random r = new Random();

        String word = wordList.get(r.nextInt(wordList.size()));

        ArrayList<Character> wordState = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        int wrongGuesses = 0;
        while (wrongGuesses < 6) {

            System.out.print("Guess a letter : ");
            char guess = s.next().toLowerCase().charAt(0);
            // since next() takes input as string, we convert it to char using charAt() method

            if (word.indexOf(guess) >= 0) {
                System.out.println("Correct guess !");
                System.out.print(getHangmanArt(wrongGuesses));
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        wordState.set(i, guess);
                    }
                }
                display(wordState);
                if (!wordState.contains('_')) {
                    System.out.print(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WON !");
                    System.out.println("The word was : " +word);
                    break;

                }
            }
            else {
                System.out.println("Wrong guess !");
                display(wordState);
                wrongGuesses++;
                System.out.println(getHangmanArt(wrongGuesses));
            }
        }
        if (wrongGuesses >= 6) {
            System.out.println("GAME OVER!!!!");
            System.out.println("The word was : " + word);
        }

        s.close();
    }

    static void display (ArrayList<Character> wordState ) {
        System.out.print("Word: ");
        for (char letter : wordState) {
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    static String getHangmanArt (int wrongGuesses) {
        return switch(wrongGuesses) {
            case 0 -> """
                    

            
                      """;
            case 1 -> """
                       O

            
                      """;
            case 2 -> """
                       O
                       |
            
                      """;
            case 3 -> """
                       O
                      /|
            
                      """;
            case 4 -> """
                       O
                      /|\\
            
                      """;
            case 5 -> """
                       O
                      /|\\
                      /
                      """;
            case 6 -> """
                       O
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }

}
