package B1_Concurrency.A1_Threading;

// // OPTION - 2 - Implement the runnable interface (better)
public class Counter implements Runnable {

    @Override
    public void run() {

        // simulates 5 seconds counting 
        for (int i = 1; i <= 5; i++) {

            try {
                Thread.sleep(1000);         // 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }

            // stopping condition
            if (i == 5) {
                System.out.println("Time's Up !!");

                // Terminate the entire Java application, not just this thread.
                System.exit(0); // prevent taking input after the time is up.
            }
        }
    }
}




// // OPTION - 1 - Extend a thread class (simpler)
// public class Counter extends Thread {

//     @Override
//     public void run() {

//         // simulates 5 seconds counting 
//         for (int i = 1; i <= 5; i++) {

//             try {
//                 Thread.sleep(1000);      // 1 second
//             } catch (InterruptedException e) {
//                 System.out.println("Thread was interrupted.");
//             }

//             // stopping condition
//             if (i == 5) {
//                 System.out.println("Time's Up !!");

//                 // Terminate the entire Java application, not just this thread.
//                 System.exit(0); // prevent taking input after the time is up.
//             }
//         }
//     }
// }