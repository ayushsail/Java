/*
======================== FOR LOOP ========================

For Loop - Used to repeat a block of code a specific number of times.

Syntax:
for (initialization; condition; update) {
    // code
}

Flow:
1. Initialization → runs once
2. Condition → checked before each iteration
3. Code executes
4. Update → runs after each iteration
5. Repeats until condition becomes false

Examples:
i++  → increment
i--  → decrement
i+=2 → increase by 2
i-=2 → decrease by 2

Note:
- Best when the number of iterations is known.

==========================================================
*/

import java.util.Scanner;

public class B5_ForLoop {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("FOR LOOPS");

        // increment
        System.out.println("\n\nIncrement");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        // decrement
        System.out.println("\n\nDecrement");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        // even
        System.out.println("\n\nEven num");
        for (int i = 2; i < 11; i+=2) {
            System.out.print(i + " ");
        }
        // odd
        System.out.println("\n\nOdd num");
        for (int i = 1; i < 11; i+=2) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n");
        
        
        
        // Happy New Year
        Scanner s=new Scanner(System.in);
        int start = 10;
        System.out.print("Enter the starting number of the countdown : ");
        start = s.nextInt();


        for (int i = start; i>=0; i--) {
                System.out.println(i);
                Thread.sleep(1000);     // 1000ms delay using thread class with sleep method
        }
        System.out.println("HAPPY NEW YEAR !!!!");
        

        s.close();
    }
}
