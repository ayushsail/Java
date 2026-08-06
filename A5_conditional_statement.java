/*
==================== CONDITIONAL STATEMENTS ====================

Definition:
- Conditional statements are used to make decisions in a program.
- They execute different blocks of code depending on whether a
  condition is true or false.

Conditions - A condition is a boolean expression that evaluates to: either true or false

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
1. if Statement --> Executes a block of code only if the condition is true.
---------------------------------------------------------------

Syntax:

if(condition){
    // code
}

---------------------------------------------------------------
2. if-else Statement --> - Executes one block if the condition is true,
                           otherwise executes another block.
---------------------------------------------------------------

Syntax:

if(condition){
    // code if true
}
else{
    // code if false
}

---------------------------------------------------------------
3. else-if Ladder --> - Used when multiple conditions need to be checked.
                      - Once a condition becomes true, the remaining conditions are skipped.
---------------------------------------------------------------


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

---------------------------------------------------------------
4. Nested if Statement --> An if statement inside another if statement.
---------------------------------------------------------------

syntax:

if(condition){
    if(condition){
        // code if true
    }
    else {
        // code if false
    }
}
/*
==================== TERNARY OPERATOR ====================

Definition:- A shorthand for if-else used to assign a value.

Syntax:
variable = (condition) ? value_if_true : value_if_false;

==========================================================
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


        // Age Criteria --> else-if ladder
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




        // Nested - if-else
        System.out.println("\n\nMovie Ticket Price\n");
        double price = 100.0;
        System.out.print("Enter your age : ");
        int a = s.nextInt();

        System.out.print("Are you a student : ");
        boolean isStud = s.nextBoolean();

        boolean isSenior = false;
        if (a > 50) {
            isSenior = true;
        }

        if (isStud) {
            if (isSenior) {
                System.out.println("You get a 10% 'Student Discount' on your movie ticket !!");
                System.out.println("You get a 20% 'Senior Discount' on your movie ticket !!");
                System.out.println("price of ticket is $"+(price*0.7)+ " only");
            }
            else {
                System.out.println("You get a 10% 'Student Discount' on your movie ticket !!");
                System.out.println("price of ticket is $"+(price*0.9)+ " only");
            }
        }
        else if (isSenior) {
            System.out.println("You get a 20% 'Senior Discount' on your movie ticket !!");
            System.out.println("The price of ticket is $"+(price*0.8)+ " only");
        }
        
        else {
            System.out.println("The price of ticket is $"+price+ " only");

        }



        // Ternary Operator 

        // PASS & FAIL
        System.out.print("Enter your marks out of 100 : ");
        double marks = s.nextDouble();

        String result = (marks > 70) ? "PASS" : "FAIL";             // Ternary Operator
        System.out.printf("Result : %s\n",result);


        // EVEN OR ODD
        System.out.print("Enter a num : ");
        int num = s.nextInt();

        String res = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.printf("The number %d is %s\n",num,res);
        

        s.close();
    }
}

