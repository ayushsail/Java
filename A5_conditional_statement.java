/*
==================== CONDITIONAL STATEMENTS ====================

Definition:
- Conditional statements are used to make decisions in a program.
- They execute different blocks of code depending on whether a
  condition is true or false.

Conditions:
- A condition is a boolean expression that evaluates to:
    true
    false

Comparison Operators:
==    Equal to
!=    Not equal to
>     Greater than
<     Less than
>=    Greater than or equal to
<=    Less than or equal to

Logical Operators:
&&    Logical AND
||    Logical OR
!     Logical NOT

---------------------------------------------------------------
1. if Statement
---------------------------------------------------------------
- Executes a block of code only if the condition is true.

Syntax:

if(condition){
    // code
}

Example:

if(age >= 18){
    System.out.println("You can vote.");
}

---------------------------------------------------------------
2. if-else Statement
---------------------------------------------------------------
- Executes one block if the condition is true,
  otherwise executes another block.

Syntax:

if(condition){
    // code if true
}
else{
    // code if false
}

Example:

if(isStudent){
    System.out.println("Student");
}
else{
    System.out.println("Not a Student");
}

---------------------------------------------------------------
3. else-if Ladder
---------------------------------------------------------------
- Used when multiple conditions need to be checked.
- Java evaluates conditions from top to bottom.
- Once a condition becomes true, the remaining conditions
  are skipped.

Syntax:

if(condition1){
    ...
}
else if(condition2){
    ...
}
else if(condition3){
    ...
}
else{
    ...
}

Example:

if(age < 13){
    System.out.println("Child");
}
else if(age < 20){
    System.out.println("Teen");
}
else{
    System.out.println("Adult");
}

---------------------------------------------------------------
4. Nested if Statement
---------------------------------------------------------------
- An if statement inside another if statement.

Example:

if(age >= 18){
    if(isStudent){
        System.out.println("Adult Student");
    }
}

---------------------------------------------------------------
String Validation
---------------------------------------------------------------
To check whether a String is empty:

name.isEmpty()

Returns:
true  -> String has no characters
false -> String contains text

Example:

while(name.isEmpty()){
    System.out.println("Enter your name.");
}

---------------------------------------------------------------
Boolean Variables
---------------------------------------------------------------
A boolean variable stores only two values:

true
false

Example:

boolean isStudent = true;

if(isStudent){
    System.out.println("Student");
}

---------------------------------------------------------------
Important Notes
---------------------------------------------------------------
1. Every if condition must return true or false.

2. Use == for comparison,
   not = (assignment).

Wrong:
if(age = 18)

Correct:
if(age == 18)

3. Curly braces {} improve readability
   and are recommended even for single statements.

4. Conditions are checked from top to bottom.

5. else is optional and executes only when
   all previous conditions are false.

6. Multiple conditions can be combined using
   logical operators (&&, ||, !).

Example:
if(age >= 18 && isStudent)

===============================================================
*/

import java.util.Scanner;

public class A5_conditional_statement {
    public static void main(String[] args) {
        System.out.println("CONDITIONAL STATEMENT\n");
        Scanner s = new Scanner(System.in);
        double age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name : ");
        name = s.nextLine();
        
        
        // Name Validation
        while (name.isEmpty()) {
            System.out.println("You haven't entered you name!!!, Enter you name to move forward.");
            System.out.print("Enter your name : ");
            name = s.nextLine();
        }
        System.out.println("Helloo!!! " + name);


        System.out.print("Enter your age : ");
        age = s.nextDouble();
        
        System.out.print("Are you a Student (true/false) : ");
        isStudent = s.nextBoolean();


        // Age Criteria
        if (age < 0) {
            System.out.println("You haven't born yet!!");
        }
        else if (age == 0) {
            System.out.println("Congratulations!! It's your first day on Earth.");
        }
        else if (age >= 1 && age <= 4) {
            System.out.println("You are a baby.");
        }
        else if (age >= 5 && age <= 12) {
            System.out.println("You are a child.");
        }
        else if (age >= 13 && age <= 18) {
            System.out.println("You are a teen.");
        }
        else if (age >=19 && age <=45) {
            System.out.println("You are a UNC!!!");
        }
        else if (age >=46 && age <=65) {
            System.out.println("You are getting old!!!");
        }
        else if (age >=66 && age <=85) {
            System.out.println("OH!!! too old.");
        }
        else if (age >=86 && age <=140) {
            System.out.println("Damm!!!");
        }


        // Student Validation
        if (isStudent) {
            System.out.println("You are Student.");
        }
        else {
            System.out.println("You are NOT a Student.");
        }


        s.close();
    }
}
