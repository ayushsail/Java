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
    
======================== NESTED LOOP ========================

NESTED LOOP:
- A loop inside another loop.
- Inner loop completes all its iterations
  for each iteration of the outer loop.

Example:
for (...) {
    for (...) {
        // code
    }
}

==========================================================
*/

import java.util.Scanner;

public class B5_ForLoop {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("FOR LOOPS");
        Scanner s=new Scanner(System.in);

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
        int start = 10;
        System.out.print("Enter the starting number of the countdown : ");
        start = s.nextInt();


        for (int i = start; i>=0; i--) {
                System.out.println(i);
                Thread.sleep(1000);     // 1000ms delay using thread class with sleep method
        }
        System.out.println("HAPPY NEW YEAR !!!!");



        // Nested loops

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // printing patterns using nested loops
        System.out.print("\nEnter number of rows : ");
        int row = s.nextInt();
        
        System.out.print("Enter number of columns : ");
        int column = s.nextInt();
        
        System.out.print("Enter symbol to use : ");
        char symbol = s.next().charAt(0);
        
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }


        s.close();
    }
}
