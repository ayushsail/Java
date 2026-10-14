package Z2_Projects.Alarmclock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("ALARM CLOCK\n");

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime alarmTime = null;

        String filePath =
                "D:\\ULTRON\\JAVA\\Z2_Projects\\Alarmclock\\AlarmRingtone.wav";

        try (Scanner s = new Scanner(System.in)) {

            // Keep asking until a valid alarm time is entered.
            while (alarmTime == null) {
                try {
                    System.out.print("Enter alarm time (HH:MM:SS): ");
                    String inputTime = s.nextLine().trim();

                    alarmTime = LocalTime.parse(inputTime, formatter);

                    System.out.println("Alarm set for " + alarmTime);
                }
                catch (DateTimeParseException e) {
                    System.out.println(
                            "INVALID TIME. Please use HH:MM:SS");
                }
            }

            AlarmClock alarmClock =
                    new AlarmClock(alarmTime, filePath, s);

            Thread alarmThread = new Thread(alarmClock);
            alarmThread.start();

            // Keep the Scanner open until the alarm thread finishes.
            boolean interrupted = false;

            while (alarmThread.isAlive()) {
                try {
                    alarmThread.join();
                }
                catch (InterruptedException e) {
                    interrupted = true;
                }
            }

            if (interrupted) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nAlarm application closed.");
    }
}