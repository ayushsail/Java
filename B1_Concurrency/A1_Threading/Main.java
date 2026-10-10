/*
============================= THREADING =============================

Definition:
- Threading allows a program to execute multiple tasks concurrently.
- Each thread represents an independent path of execution.
- Threads can improve responsiveness and help with time-consuming
  or I/O-bound operations such as file reading and network requests.
- Concurrent tasks may run in parallel when multiple CPU cores
  and suitable execution conditions are available.

- The main() method runs on the MAIN THREAD.

-------------------------------------------------------------------

WHY USE THREADING?
- Perform background tasks while the main thread continues working.
- Improve application responsiveness.
- Handle multiple tasks without blocking the entire application.

-------------------------------------------------------------------

TWO WAYS TO CREATE A THREAD:

OPTION 1: EXTEND THE THREAD CLASS (SIMPLER)

Syntax:

class WorkerThread extends Thread {

    @Override
    public void run() {
        // Task to execute
    }
}

Usage:

WorkerThread thread = new WorkerThread();
thread.start();

- The class itself becomes a Thread.
- Override run() to define the task.
- Simple to implement for basic examples.
- Java supports extending only one class, so this class cannot
  extend another class simultaneously.
- Less flexible because the task and thread are combined.

-------------------------------------------------------------------

OPTION 2: IMPLEMENT THE RUNNABLE INTERFACE (BETTER, GENERALLY PREFERRED)

Syntax:

class BackupTask implements Runnable {

    @Override
    public void run() {
        // Task to execute
    }
}

Usage:

BackupTask task = new BackupTask();
Thread thread = new Thread(task);
thread.start();

- Runnable represents the TASK to execute.
- Thread represents the THREAD that executes the task.
- Pass the Runnable object to the Thread constructor.
- The task class can still extend another class.
- Separates task logic from thread management.
- Runnable tasks can also be submitted to an ExecutorService.

WHY PREFER RUNNABLE?
- Better separation of responsibilities.
- Greater flexibility and reusability.
- Works well with modern Java concurrency tools.

-------------------------------------------------------------------

IMPORTANT THREAD METHODS:

start()
- Starts a new thread and schedules its execution.
- The new thread executes the run() method.

run()
- Contains the task executed by the thread.
- Calling run() directly is an ordinary method call;
  it does NOT start a new thread.

sleep(milliseconds)
- Pauses the CURRENT thread for approximately the specified time.
- Throws InterruptedException if the thread is interrupted while
  sleeping.

Example:
Thread.sleep(1000);

- 1000 milliseconds = 1 second.

-------------------------------------------------------------------

INTERRUPTED EXCEPTION:

- Used when a thread is interrupted while waiting or sleeping.
- Interruption can be used to request that a task stop.

Example:

try {
    Thread.sleep(1000);
}
catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    return;
}

- Restores the interruption status and stops this task.

-------------------------------------------------------------------

DAEMON THREAD:

setDaemon(true)
- Marks a thread as a daemon thread.
- Must be called before start().
- Daemon threads do not prevent the JVM from exiting once all
  non-daemon threads have finished.

Example:
thread.setDaemon(true);
thread.start();

IMPORTANT:
- A daemon thread does not necessarily stop when main() returns.
- If other non-daemon threads are still running, the JVM may
  remain active and the daemon thread may continue running.

-------------------------------------------------------------------

SYSTEM.EXIT():

System.exit(0);

- Terminates the entire Java application.
- It does NOT stop only the current thread.
- Avoid using it for ordinary thread management.

-------------------------------------------------------------------

IMPORTANT CONCEPTS:

CONCURRENCY:
- Multiple tasks make progress during overlapping periods.

PARALLELISM:
- Multiple tasks execute at the same time, such as on multiple
  CPU cores.

THREAD SAFETY:
- Shared mutable data may cause race conditions when accessed
  by multiple threads without proper coordination.
- Synchronization, locks, atomic classes, and other concurrency
  tools can help protect shared state.

EXECUTION ORDER:
- The order in which threads execute is not guaranteed.

-------------------------------------------------------------------

QUICK COMPARISON:

extends Thread
- The class itself represents a thread.
- Simpler for basic demonstrations.
- Cannot extend another class.

implements Runnable
- The class defines a task.
- A Thread executes that task.
- More flexible and generally preferred.

KEY IDEA:

Runnable → WHAT to execute
Thread   → WHERE the task executes

Always use start() when you want a new thread to execute
independently.

====================================================================
*/

package B1_Concurrency.A1_Threading;

import java.util.Scanner;

// OPTION - 2 - Implement the runnable interface (better)
public class Main {
    public static void main(String[] args) {
        System.out.println("THREADING\n");
        Scanner s = new Scanner(System.in);

        // create a couter object 
        Counter count = new Counter();

        // Pass the counter has an argument to Thread so it can execute on a separate thread.
        Thread counterThread = new Thread(count);
        
        // making this thread a Daemon Thread
        // Daemon thread will end when the main thread is over.
        // Stops the counter Thread, if the input is received under 5 seconds.
        counterThread.setDaemon(true);

        // Start the counter in the background,
        // while the main thread continues and waits for the user's input.
        counterThread.start();


        // Input acceptor
        System.out.println("You have 5 seconds to enter your name.");
        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.println("Hello! " + name);

        s.close();
    }
}





// // OPTION - 1 - Extend a thread class (simpler)
// public class Main {
//     public static void main(String[] args) {
//         System.out.println("THREADING\n");
//         Scanner s = new Scanner(System.in);

//         // create a couterThread object 
//         Counter counterThread = new Counter();

//         // making this thread a Daemon Thread
//         // Daemon thread will end when the main thread is over.
//         // Stops the counter Thread, if the input is received under 5 seconds.
//         counterThread.setDaemon(true);
        
//         // Start the counter in the background,
//         // while the main thread continues and waits for the user's input.
//         counterThread.start();


//         // Input acceptor
//         System.out.println("You have 5 seconds to enter your name.");
//         System.out.print("Enter your name : ");
//         String name = s.nextLine();
//         System.out.println("Hello! " + name);

//         s.close();
//     }
// }