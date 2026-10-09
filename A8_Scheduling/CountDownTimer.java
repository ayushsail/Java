package A8_Scheduling;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDownTimer {
    public static void main(String[] args) {
        System.out.println("COUTNDOWN TIMER\n");
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of seconds to countdown from : ");
        int n = s.nextInt();

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int count = n;

            @Override 
            public void run() {
                
                System.out.println(count);
                count--;

                if (count <0) {
                    System.out.println("\nHAPPY NEW YEAR !!!!!!");
                    timer.cancel();
                }
            }
        };


        timer.scheduleAtFixedRate(task, 1000,1000);

        s.close();
    }
}
