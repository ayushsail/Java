package Z2_Projects.MusicPlayer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;

public class Main {
    public static void main(String[] args) {

        // supported files formats - .wav, .au, .aiff

        String[] songs = {"D:\\ULTRON\\JAVA\\Z2_Projects\\MusicPlayer\\songs\\peekaboo.wav",
                          "D:\\ULTRON\\JAVA\\Z2_Projects\\MusicPlayer\\songs\\gnx.wav",
                          "D:\\ULTRON\\JAVA\\Z2_Projects\\MusicPlayer\\songs\\tv off.wav",
                          "D:\\ULTRON\\JAVA\\Z2_Projects\\MusicPlayer\\songs\\squabble up.wav",
                          "D:\\ULTRON\\JAVA\\Z2_Projects\\MusicPlayer\\songs\\wacced out murals.wav"
        };

        int currentSong = 2;

        try (Scanner s = new Scanner(System.in)) {

            Clip clip = loadClip(songs[currentSong]);

            String response = "";
            
            while ( !response.equals("Q")) {
                System.out.println("\n\n**************************************");
                System.out.println("*************MUSIC PLAYER*************");
                System.out.println("**************************************");
                System.out.println("P : Play\nS : Stop\nR : Reset\nN : Next Song\nB : Previous Song\nQ : Quit");
                System.out.println("**************************************");
                System.out.println("CURRENT SONG : " +new File(songs[currentSong]).getName());
                System.out.println("**************************************");
                System.out.print("Enter your choice : ");
                response = s.next().toUpperCase();

                switch (response) {
                    case "P" -> clip.start();           // PLAY
                    case "S" -> clip.stop();            // STOP
                    case "R" -> clip.setMicrosecondPosition(0);     // RESET

                    case "N" -> {                       // NEXT
                        clip.stop(); 
                        clip.close();

                        currentSong = (currentSong + 1) % songs.length;
                        clip = loadClip(songs[currentSong]);
                        clip.start();
                    }

                    case "B" -> {                       // PREVIOUS
                        clip.stop();
                        clip.close();

                        currentSong = (currentSong - 1 + songs.length) % songs.length;
                        clip = loadClip(songs[currentSong]);
                        clip.start();
                    }

                    case "Q" -> clip.close();           // QUIT

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


    // Load an audio file and return it's clip
    static Clip loadClip (String filePath) 
        throws IOException, UnsupportedAudioFileException,
            LineUnavailableException {
        // These above mentioned exceptions are passed to the calling method.

        File file = new File(filePath);

        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            return clip;
        }
    }
}
