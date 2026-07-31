/*
========================== OPERATORS ==========================

Definition:
- Operators are special symbols used to perform operations
  on variables and values (operands).

Example:
int a = 10;
int b = 5;
int c = a + b;

---------------------------------------------------------------
1. ARITHMETIC OPERATORS
---------------------------------------------------------------
Used to perform mathematical calculations.

Operator    Meaning          Example
+           Addition         a + b
-           Subtraction      a - b
*           Multiplication   a * b
/           Division         a / b
%           Modulus          a % b (Remainder)

Example:
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0

---------------------------------------------------------------
2. AUGMENTED ASSIGNMENT OPERATORS
---------------------------------------------------------------
Shortcut operators that perform an operation and assign
the result back to the same variable.

Operator    Equivalent To
+=          a = a + b
-=          a = a - b
*=          a = a * b
/=          a = a / b
%=          a = a % b

Example:
int a = 10;
a += 5;     // a = 15
a *= 2;     // a = 30

---------------------------------------------------------------
3. INCREMENT & DECREMENT OPERATORS
---------------------------------------------------------------
Used to increase or decrease a variable by 1.

++    Increment
--    Decrement

Example:
int x = 5;

x++;    // x becomes 6
x--;    // x becomes 5

Types:

1. Pre-Increment
   ++x
   - Value is increased first, then used.

2. Post-Increment
   x++
   - Current value is used first, then increased.

Similarly:

--x  -> Pre-Decrement
x--  -> Post-Decrement

---------------------------------------------------------------
4. ORDER OF OPERATIONS (PEMDAS)
---------------------------------------------------------------
Java follows operator precedence while evaluating expressions.

P -> Parentheses ()
E -> Exponents (Math.pow())
M -> Multiplication (*)
D -> Division (/)
A -> Addition (+)
S -> Subtraction (-)

Easy Trick:
Please Excuse My Dear Aunt Sally
(or)
Please Excuse My Dope Ass Swag 

Example:
7 - 4 * (7 - 5) / 2.0

Step 1: Parentheses
7 - 4 * 2 / 2.0

Step 2: Multiplication
7 - 8 / 2.0

Step 3: Division
7 - 4.0

Step 4: Subtraction
3.0

---------------------------------------------------------------
Important Notes:
---------------------------------------------------------------
- Integer division removes the decimal part.
    5 / 2 = 2

- Decimal division returns a decimal result.
    5 / 2.0 = 2.5

- '%' returns the remainder after division.
    7 % 3 = 1

- Parentheses have the highest priority.

===============================================================
*/

public class A4_operators {
    public static void main(String[] args) {
        System.out.println("OPERATORS\n");
        
        int a = 10;
        int b = 2;
        int c;


        // 1. ARITHMETIC OPERATION
        System.out.println("\n1. ARITHMETIC OPERATION\n");
        c = a + b;
        System.out.println(a+ " + " +b+ " = " +c);
        c = a - b;
        System.out.println(a+ " - " +b+ " = " +c);
        c = a * b;
        System.out.println(a+ " * " +b+ " = " +c);
        c = a / b;
        System.out.println(a+ " / " +b+ " = " +c);
        c = a % b;
        System.out.println(a+ " % " +b+ " = " +c);
        
        
        // 2. AUGMENTED ASSIGNMENT OPERATION
        System.out.println("\n2. AUGMENTED ASSIGNMENT OPERATION\n");
        
        a += b;     // a = a + b
        System.out.println(a);
        a -= b;     // a = a - b
        System.out.println(a);
        a *= b;     // a = a * b
        System.out.println(a);
        a /= b;     // a = a / b
        System.out.println(a);
        a %= b;     // a = a % b
        System.out.println(a);
        
        
        // 3. INCREMENT/DECREMENT OPERATION
        System.out.println("\n3. INCREMENT/DECREMENT OPERATION\n");
        int x = 1;
        x++;        // x = x + 1
        System.out.println(x);
        x--;        // x = x - 1
        System.out.println(x);


        // 4. ORDER OF OPERATION [P-E-M-D-A-S]
        System.out.println("\n4. ORDER OF OPERATION [P-E-M-D-A-S]\n");
        /*
        P - Parenthesis
        E - Exponents
        M - Multiplication
        D - Division
        A - Addition
        S - Subtraction
        
        // Please Excuse My Dope Ass Swag (P-E-M-D-A-S)
        */

        double result = 7 - 4 * (7 - 5) / 2.0;
        System.out.println("7 - 4 * (7 - 5) / 2.0 = "+result);









    }

}
