/*
=========================== TIMER & TIMERTASK ===========================

TIMER:
- A class that schedules tasks to execute after a delay or periodically.
- Useful for reminders, scheduled updates, and repetitive actions.

TIMERTASK:
- An abstract class representing a task to be executed by a Timer.
- Extend TimerTask and override the run() method to define the task.
- Can also be implemented using an anonymous class.

Example:

Timer timer = new Timer();

TimerTask task = new TimerTask() {
    @Override
    public void run() {
        System.out.println("Reminder!");
    }
};

---------------------------------------------------------------

IMPORTANT METHODS:

1. schedule(task, delay)
- Executes the task once after the specified delay.

Example:
timer.schedule(task, 2000);

→ Executes after 2 seconds.

2. schedule(task, delay, period)
- Executes after the initial delay, then repeats with the
  specified delay between scheduled executions.

Example:
timer.schedule(task, 2000, 1000);

→ Starts after 2 seconds, then repeats every 1 second.

3. scheduleAtFixedRate(task, delay, period)
- Schedules repeated executions at a fixed rate.
- Attempts to maintain the planned execution schedule.

4. cancel()
- Timer.cancel() stops the Timer and cancels scheduled tasks.
- TimerTask.cancel() cancels that task's future executions.

5. purge()
- Removes cancelled tasks from the Timer's task queue.

---------------------------------------------------------------

IMPORTANT NOTES:
- Time values are generally measured in milliseconds.
- 1000 milliseconds = 1 second.
- TimerTask.run() contains the code that executes.
- A Timer normally uses a single background thread.
- A long-running task can delay other tasks scheduled on that Timer.
- Cancel the Timer when it is no longer needed.
- For more advanced scheduling, ScheduledExecutorService is
  generally preferred in modern Java applications.

=======================================================================
*/

package A8_Scheduling;

import java.util.Timer;
import java.util.TimerTask;

public class A1_TimerTask {
    public static void main(String[] args) {
        System.out.println("TIMER TASK\n");

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {

            int count = 5;

            @Override 
            public void run() {
                System.out.println("HELLOOOOO!!!");
                count--;

                if (count <= 0) {
                    System.out.println("\nTASK COMPLETED");
                    timer.cancel();
                }
            }
        };


        // perform task at delay of 3 seconds.
        timer.schedule(task,3000);          // unit is milliseconds

        // perform task at delay of 3 seconds, repeat the task at delay of 1 second.
        // timer.schedule(task,3000,1000);
    }
}
