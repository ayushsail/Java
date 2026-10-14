package Z2_Projects.Alarmclock;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable {

    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("HH:mm:ss");

    AlarmClock(LocalTime alarmTime, String filePath, Scanner scanner) {
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {

        LocalDateTime now = LocalDateTime.now();

        // Combine the current date with the selected alarm time.
        LocalDateTime targetTime =
                LocalDateTime.of(now.toLocalDate(), alarmTime);

        // If the time has already passed, schedule it for tomorrow.
        if (!targetTime.isAfter(now)) {
            targetTime = targetTime.plusDays(1);
        }

        System.out.println("Waiting for alarm: "
                + targetTime.format(
                        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));

        while (LocalDateTime.now().isBefore(targetTime)) {

            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("\nAlarm countdown interrupted.");
                return;
            }

            LocalTime currentTime = LocalTime.now();

            System.out.printf(
                    "\rCurrent time: %s",
                    currentTime.format(FORMATTER));
        }

        playSound();
    }

    private void playSound() {

        File file = new File(filePath);

        try (AudioInputStream audioStream =
                     AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();

            try {
                clip.open(audioStream);
                clip.start();

                System.out.println(
                        "\n\nALARM RINGING! Press Enter to stop.");

                scanner.nextLine();
            }
            finally {
                // Stop and release the audio resource.
                clip.stop();
                clip.close();
            }
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("\nAudio file format is not supported.");
        }
        catch (LineUnavailableException e) {
            System.out.println("\nAudio resource is unavailable.");
        }
        catch (IOException e) {
            System.out.println("\nCould not read the alarm audio file.");
        }
    }
}