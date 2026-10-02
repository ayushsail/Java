/*
========================= VARIABLES =========================

Definition:
- A variable is a reusable container used to store a value.
- It behaves as if it were the value it contains.
- The value stored in a variable can be changed during program execution.

Types of Variables:

1. Primitive Variables
   - Store the actual value directly in memory (Stack).
   - Faster and memory efficient.
   - Hold only a single value.

   Primitive Data Types:
   - byte
   - short
   - int
   - long
   - float
   - double
   - char
   - boolean

2. Reference Variables
   - Store the memory address (reference) in the Stack using Heap concept.
   - The actual object is stored in the Heap.
   - Used for non-primitive data.

   Examples:
   - String
   - Array
   - Object
   - ArrayList
   - Scanner

Primitive            Reference
---------            ---------
int                  String
double               Array
char                 Object
boolean              Scanner

Creating a Variable:
1. Declaration
   - Specifies the data type and variable name.
   Syntax:
       dataType variableName;

2. Assignment
   - Assigns a value to the variable.
   Syntax:
       variableName = value;

3. Initialization
   - Declaration and Assignment together.
   Syntax:
       dataType variableName = value;

Examples:
int age;              // Declaration
age = 18;             // Assignment
int marks = 95;       // Initialization

Variable Naming Rules:
- Can contain letters, digits, '_' and '$'
- Cannot start with a digit.
- Cannot use Java keywords.
- Case-sensitive (age and Age are different).
- Use camelCase naming convention.

Examples:
int studentAge;
double accountBalance;
String firstName;

=============================================================
*/
package JavaBasics;
public class A2_variable {
    public static void main(String[] args) {
        System.out.println("VARIABLES\n");

        

        System.out.println("PRIMITIVE DATATYPE \n");

        int age = 19;
        System.out.println("Your age is "+age);
        
        double height = 5.4;
        System.out.println("Your height is "+height);
        
        char initial = 'A';       //  Single Quote 
        System.out.println("Your initial is "+initial);
        
        boolean isStudent = true;
        boolean isOnline = false;
        System.out.println("it's " + isStudent + " That I am a Student");
        if(isOnline) {
            System.out.println("He is Online");
        }
        else {
            System.out.println("He is NOT Online");
        }
        
        
        System.out.println("\nREFERENCE DATATYPE \n");

        String name = "Ayush Sail";
        System.out.println("Hello!! "+name);
        
        int year = 2025;
        String car = "Mustang";
        String color = "Red";
        double price = 19999.99;
        char symbol = '$';
        System.out.println("Your choice is a "+color+ ' ' +year+ ' ' +car);
        System.out.println("The price is : "+symbol+price);



    }
}