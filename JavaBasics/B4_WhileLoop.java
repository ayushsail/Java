/*
====================== WHILE LOOP ======================

- Repeats a block while the condition is true.
- Condition is checked BEFORE each iteration.

Syntax:
while (condition) {
    // code
}

Note:
- May execute 0 times.

==================== DO-WHILE LOOP ======================

- Similar to while, but condition is checked AFTER execution.

Syntax:
do {
    // code
} while (condition);

Note:
- Always executes at least once.

========================================================
*/
package JavaBasics;

import java.util.Scanner;
public class B4_WhileLoop {
    public static void main(String[] args) {
        System.out.println("WHILE LOOPS\n");
        Scanner s=new Scanner(System.in);

        // WHILE LOOP
 
        // Empty name case
        String name = "";
        
        while (name.isEmpty()) {
            System.out.print("Enter your name : ");
            name = s.nextLine();
        }
        System.out.println("Hello!!! " + name);
        

        // age validation
        int age;
        System.out.print("Enter your age : ");
        age = s.nextInt();
        
        while (age<=0 || age>150) {
            System.out.println("Your age cannot be negative or Zero or more than 150 !!");
            System.out.print("Enter your age : ");
            age = s.nextInt();
        }
        System.out.println("You are " + age + " year old.");
        
        
        
        // do - while loop

        // age validation
        int a;
        
        do {
            System.out.println("Your age cannot be negative or Zero or more than 150 !!");
            System.out.print("Enter your age : ");
            a = s.nextInt();
        } while (a<=0 || a>150);
        System.out.println("You are " + a + " year old.");


        // pick number
        int num = 0;
        do {
            System.out.print("pick a number between 1 to 10 : ");
            num = s.nextInt();
        } while (num < 1 || num > 10);
        System.out.println("You picked " + num);


        s.close();
    }
}
