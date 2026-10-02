/*
=========================== ABSTRACTION ===========================

Definition:
- Abstraction = hiding implementation details and showing only
  the essential features.

- Achieved using:
    1. Abstract classes
    2. Interfaces

ABSTRACT CLASS:
- A class declared using the "abstract" keyword.
- Cannot be instantiated directly.
- Can contain both:
    → Abstract methods
    → Concrete methods

ABSTRACT METHOD:
- A method declared without a body.
- Must be implemented by a concrete subclass.

Syntax:
abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("Shape");
    }
}

IMPORTANT:
- abstract keyword is use to define abstract classes and methods.
- Abstract is the process of hiding implementation details
- and showing only the essentials features.
- Abstract classes CAN'T be instantiated directly
- Abstract classes can also contain Abstract methods (which must be implemented by subclass)
- they can also contain concrete methods (which are inherited by subclass)
- Abstract class can have constructors, variables, and concrete methods.
- A subclass must implement all inherited abstract methods,
  unless the subclass is also abstract.
- Abstract class provides a common structure for related classes.

==================================================================
*/

package OOPs.A10_Abstract;

public class Main {
    public static void main(String[] args) {
        System.out.println("ABSTRACT\n");

        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(5,3);
        Rectangle rectangle = new Rectangle(4, 5);


        System.out.printf("Area of Circle of radius %.2f : %.2f\n",circle.radius, circle.area());
        System.out.printf("Area of Triangle of base %.2f & " +
                "height %.2f : %.2f\n", triangle.base, triangle.height, triangle.area());
        System.out.printf("Area of Rectangle of height %.2f & " +
                "width %.2f : %.2f\n", rectangle.length, rectangle.width, rectangle.area());

        
        circle.display();
    }
}
