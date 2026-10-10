/*
========================= MULTITHREADING =========================

Definition:
- Multithreading allows a program to execute multiple threads
  concurrently.
- (Thread - A set of instructions that run independently)
- Useful for background tasks, responsive applications, and
  time-consuming operations.

CONCURRENCY vs PARALLELISM:
- Concurrency → Multiple tasks make progress during overlapping
  periods.
- Parallelism → Multiple tasks execute at the same time.

----------------------------------------------------------------

CREATING MULTIPLE THREADS:

- Create separate Thread objects for different tasks.
- Call start() on each thread to begin execution independently.

Example:

Thread t1 = new Thread(new Task());
Thread t2 = new Thread(new AnotherTask());

t1.start();
t2.start();

- Both threads can run concurrently.
- The order in which their instructions execute is not guaranteed.

----------------------------------------------------------------

IMPORTANT THREAD METHODS:

1. start()
- Starts a new thread and schedules its execution.
- The thread executes its run() method.

2. run()
- Contains the task performed by the thread.
- Calling run() directly does not start a new thread.

3. sleep(milliseconds)
- Pauses the CURRENT thread for approximately the specified time.
- Throws InterruptedException if interrupted while sleeping.

Example:
Thread.sleep(1000);

- 1000 milliseconds = 1 second.

4. join()
- Makes the calling thread wait until the specified thread
  terminates.

Example:
t1.join();

- The current thread waits for t1 to finish.
- Throws InterruptedException if the waiting thread is interrupted.

5. currentThread()
- Returns a reference to the currently executing thread.

Example:
Thread.currentThread().getName();

6. getName()
- Returns the name of a thread.

7. setName(name)
- Changes the name of a thread.

----------------------------------------------------------------

UNDERSTANDING JOIN():

t1.start();
t2.start();

t1.join();
t2.join();

System.out.println("All tasks finished");

- Both tasks start before the main thread waits for them.
- The main thread waits for t1 and then t2.
- The final message normally appears after both threads finish.

IMPORTANT:
- join() does not stop or pause the other thread.
- It pauses only the thread that calls join().
- If waiting is interrupted, join() can throw
  InterruptedException before the target thread finishes.

----------------------------------------------------------------

INTERRUPTED EXCEPTION:

- Occurs when a thread is interrupted while sleeping or waiting.
- Interruption can be used to request that a task stop.

Example:

catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    return;
}

- Restores the interruption status and stops the current task.

----------------------------------------------------------------

IMPORTANT NOTES:
- main() executes on the main thread.
- Each Thread has its own execution path and stack.
- Threads share the process's heap memory.
- Shared mutable data can cause race conditions.
- Synchronization and concurrency utilities help coordinate threads.
- Use start(), not a direct run() call, to start a new thread.
- Runnable separates the task from the thread executing it.
- Creating threads does not automatically improve performance.

==================================================================
*/

package B1_Concurrency.A2_MultiThreading;

public class Main {
    public static void main(String[] args) {
        System.out.println("MULTITHREADING\n");

        Thread thread0 = new Thread(new MyRunnable("PING"));
        Thread thread1 = new Thread(new MyRunnable("PONG"));


        System.out.println("GAME START\n");
        
        thread0.start();
        thread1.start();
        // thread1 & thread2 are running concurrently.

        // We can make the main thread wait for this two thread to finish,
        // By using thread.join() method.
        try {
            thread0.join();
            thread1.join();
        }
        catch (InterruptedException e) {
            System.out.println("Main Thread was interrupted.");
        }


        // Main thread waits for the thread0 & thread1 to finish.
        // thread.join method prevents the printing of "GAME OVER" before the above thread finsishes.
        System.out.println("\nGAME OVER");
    }
}