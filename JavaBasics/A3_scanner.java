/*
====================== INPUTS - SCANNER CLASS ======================

Definition:
- Scanner is a predefined class used to take input from the user.
- It belongs to the java.util package.

Import:
import java.util.Scanner;

Create Scanner Object:
Scanner s = new Scanner(System.in);

Common Methods:

next()         -> Reads one word
nextLine()     -> Reads an entire line
nextInt()      -> Reads an integer
nextDouble()   -> Reads a double
nextFloat()    -> Reads a float
nextBoolean()  -> Reads true/false
nextLong()     -> Reads a long
nextShort()    -> Reads a short
nextByte()     -> Reads a byte

Example:

Scanner s = new Scanner(System.in);

System.out.print("Enter your age: ");
int age = s.nextInt();

System.out.print("Enter your name: ");
String name = s.next();

System.out.println("Name: " + name);
System.out.println("Age: " + age);

Important Notes:
- Import Scanner before using it.
- System.in represents keyboard input.
- next() reads only one word.
- nextLine() reads the complete line including spaces.
- Mixing nextInt() and nextLine() may require an extra
  nextLine() to consume the leftover newline.
- Close the Scanner when finished:
      s.close();

===========================================================
*/
package JavaBasics;

import java.util.Scanner;

public class A3_scanner {
    public static void main(String[] args) {
        System.out.println("SCANNER - INPUTS\n");

        Scanner s = new Scanner(System.in);         // Create a Scanner Object - "s", or any name you want.


        System.out.print("Enter your name : ");
        String name = s.nextLine();
        
        System.out.print("Enter your age : ");
        int age = s.nextInt();

        System.out.print("What is your gpa : ");
        double gpa = s.nextDouble();

        System.out.print("Enter your grade : ");
        char grade = s.next().charAt(0);

        System.out.print("Are you a student? (true/false) : ");
        boolean isStudent = s.nextBoolean();


        System.out.println("\nHello!! "+name);
        System.out.println("You are "+age+ " years old.");
        System.out.println("Your gpa  is " +gpa);
        System.out.println("Your grade  is " +grade);
        if (isStudent) { System.out.println(name+ " is a Student.");}
        else {System.out.println(name+ " is NOT a Student.");}


        // COMMON ISSUE - '\n' - nextline character
        /*
        If we take a input of int and then of a String, there's is a issue of storing '\n' in String input.
        coz the int stores only the ineteger and the moment we hit enter,
        the enter = '\n' from the input buffer get stored in the String input.

        So we write "s.nextline();" after taking input of int and double.
        */

       System.out.print("\nEnter your roll number : ");
       int roll = s.nextInt();
       s.nextLine();        // prevention of '\n' and clear the input buffer.

       System.out.print("Enter your favorite color : ");
       String color = s.nextLine();

       System.out.println("Your roll number is "+roll+ " and your favorite color is "+color);

       

       
       
       
       //  EXERCISE - area of rectangular
       Scanner a = new Scanner(System.in);
       
       double length = 0;
       double breadth = 0;
       
       System.out.print("\nEnter lenght(cm) :");
       length = a.nextDouble();
       
       System.out.print("Enter breadth(cm) :");
       breadth = a.nextDouble();
       
       double area = length*breadth;
       System.out.println("The Area of Rectangle is "+area+ "cm²");
       


       a.close();
       s.close();
   // close the scanner object at the end of program, preventing unexpected behaviour.
    
    }
}
