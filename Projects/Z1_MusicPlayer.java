package Projects;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;

public class Z1_MusicPlayer {
    public static void main(String[] args) {
        System.out.println("MUSIC PLAYER\n");

        // supported files - .wav, .au, .aiff

        String[] songs = {"D:\\ULTRON\\JAVA\\Projects\\songs\\tv off.wav",
                          "D:\\ULTRON\\JAVA\\Projects\\songs\\gnx.wav",
                          "D:\\ULTRON\\JAVA\\Projects\\songs\\peekaboo.wav",
                          "D:\\ULTRON\\JAVA\\Projects\\songs\\squabble up.wav",
                          "D:\\ULTRON\\JAVA\\Projects\\songs\\wacced out murals.wav"
        };

        Random r = new Random();

        File file = new File(songs[r.nextInt(songs.length)]);

        try (Scanner s = new Scanner(System.in);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            
            while ( !response.equals("Q")) {
                System.out.println("P : Play\nS : Stop\nR : Reset\nQ : Quit");
                System.out.print("Enter your choice : ");
                response = s.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice !");
                }

            }


        }

        catch (FileNotFoundException e) {
            System.out.println("File not found !");
        }

        catch (LineUnavailableException e) {
            System.out.println("Unable to access audio resource !");
        }

        catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file not supported !");
        }

        catch (IOException e) {
            System.out.println("Something went wrong !");
        }

        finally {
            System.out.println("\n\nThankyou! Bye Bye!!");
        }


        
    }
}
