/*
======================== MATH CLASS ========================

Definition:
- The Math class provides predefined mathematical constants
  and methods.
- It belongs to the java.lang package, so no import statement
  is required.

Syntax:
Math.methodName(arguments);

Example:
double result = Math.sqrt(25);

---------------------------------------------------------------
MATHEMATICAL CONSTANTS
---------------------------------------------------------------

1. Math.PI
   - Represents the value of π (Pi).
   - Approximately 3.141592653589793

Example:
double pi = Math.PI;

Uses:
- Area of Circle
- Circumference of Circle
- Surface Area & Volume of Sphere

---------------------------------------------------------------

2. Math.E
   - Represents Euler's Number.
   - Approximately 2.718281828459045

Example:
double e = Math.E;

Uses:
- Exponential calculations
- Logarithms
- Scientific computations

---------------------------------------------------------------
COMMON MATH METHODS
---------------------------------------------------------------

1. Power

Method:
Math.pow(base, exponent)

Example:
Math.pow(2, 3) = 8

---------------------------------------------------------------

2. Absolute Value

Method:
Math.abs(number)

Returns the positive value of a number.

Examples:
Math.abs(-5) = 5
Math.abs(5) = 5

---------------------------------------------------------------

3. Square Root

Method:
Math.sqrt(number)

Example:
Math.sqrt(25) = 5

---------------------------------------------------------------

4. Round

Method:
Math.round(number)

Rounds to the nearest whole number.

Examples:
Math.round(3.4) = 3
Math.round(3.5) = 4
Math.round(3.9) = 4

---------------------------------------------------------------

5. Floor

Method:
Math.floor(number)

Rounds DOWN to the nearest whole number.

Example:
Math.floor(3.98) = 3.0

---------------------------------------------------------------

6. Ceiling (Ceil)

Method:
Math.ceil(number)

Rounds UP to the nearest whole number.

Example:
Math.ceil(3.14) = 4.0

---------------------------------------------------------------

7. Maximum

Method:
Math.max(a, b)

Returns the larger value.

Example:
Math.max(10, 20) = 20

---------------------------------------------------------------

8. Minimum

Method:
Math.min(a, b)

Returns the smaller value.

Example:
Math.min(10, 20) = 10

---------------------------------------------------------------
COMMON APPLICATIONS
---------------------------------------------------------------

1. Hypotenuse of a Right Triangle

Formula:
c = √(a² + b²)

Java:
c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

---------------------------------------------------------------

2. Circle

Circumference:
C = 2πr

Area:
A = πr²

Java:
double circumference = 2 * Math.PI * radius;
double area = Math.PI * Math.pow(radius, 2);

---------------------------------------------------------------

3. Sphere

Surface Area:
SA = 4πr²

Volume:
V = (4/3)πr³

Java:
double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

---------------------------------------------------------------
Important Notes
---------------------------------------------------------------

1. The Math class is static.
   No object needs to be created.

2. Most Math methods return a double, So use decimal values when required.
example - (4.0/3.0)

===============================================================
*/
package A1_JavaBasics;

import java.util.Scanner;

public class A7_math {
    public static void main(String[] args) {
        System.out.println("MATH CLASS\n");

        // Constants 
        // PI - value
        double num;
        num = Math.PI;
        System.out.println("pi = "+num);

        // Euler's number
        double e;
        e = Math.E;
        System.out.println("e = "+e);


        // Methods
        double result;

        result = Math.pow(2,3);      // Power - 2 raise to 3 is 8
        System.out.println("\n2 raise to 3 : "+result);

        result = Math.abs(-5);      // absolute value - gives positive val if its negative
        System.out.println("absolute val of -5 : "+result);

        result = Math.sqrt(9);      // square root
        System.out.println("square root of 9 : "+result);

        // round off 
        result = Math.round(3.14);
        System.out.println("\nround off of 3.14 : "+result);
        result = Math.round(3.98);      
        System.out.println("round off of 3.98 : "+result);

        // round down
        result = Math.floor(3.98);
        System.out.println("\nround down of 3.98 : "+result);

        result = Math.ceil(3.14);      // absolute value - gives positive val if its negative
        System.out.println("round up of 3.14 : "+result);
        
        // max - min
        result = Math.max(10,20);     // only two nums
        System.out.println("\nmax : "+result);
        
        result = Math.min(10,20);      // absolute value - gives positive val if its negative
        System.out.println("min : "+result);



        // // HYPOTENUS OF RIGHT ANGLED TRIANGLE
        // System.out.println("\nHYPOTENUS CALCULATOR\n");

        Scanner s = new Scanner(System.in);

        // double a,b,c;

        // System.out.print("Enter length of a : ");
        // a = s.nextDouble();
        // System.out.print("Enter length of b : ");
        // b = s.nextDouble();

        // c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        // System.out.println("Hypotenus of side c having side a = " + a + "cm and b = " + b + "cm : " + c + "cm");



        // CIRCUMFERENCE & AREA OF CIRCLE
        System.out.println("\nCIRCUMFERENCE & AREA OF CIRCLE\n");

        System.out.print("Enter Radius of circle : ");
        double radius = s.nextDouble();

        double circumference = 2.0 * Math.PI * radius;
        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("Circumference of circle with radius r = %.2fcm : %.2fcm\n",radius,circumference);
        System.out.printf("Area of circle with radius r = %.2fcm : %.2fcm^2\n",radius,area);
        
        
        
        // SURFACE AREA & VOLUME OF SPHERE
        System.out.println("\nSURFACE AREA & VOLUME OF SPHERE\n");

        System.out.print("Enter Radius of sphere : ");
        double rad = s.nextDouble();

        double surface_area = 4.0 * Math.PI * Math.pow(rad,2);
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("Surface Area of sphere with radius r = %.2fcm : %.2fcm^2\n",rad,surface_area);
        System.out.printf("Volume of sphere with radius r = %.2fcm : %.2fcm^3\n",rad,volume);


        s.close();
    }
}
