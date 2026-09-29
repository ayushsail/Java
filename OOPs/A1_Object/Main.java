/*
============================ OBJECTS ============================

Definition:
- Object = an entity that contains:
    1. Attributes → data/state
    2. Methods → actions/behavior

Example:
Car car = new Car();

- Car     → class
- car     → reference variable
- new Car() → creates an object

---------------------------------------------------------------
ATTRIBUTES
---------------------------------------------------------------

Attributes represent the object's data/state.

Example:
String make = "FORD";
String model = "Mustang";
int year = 1996;

Access using:
object.attribute

Example:
car.model

---------------------------------------------------------------
METHODS
---------------------------------------------------------------

Methods represent the object's behavior/actions.

Example:
car.start();
car.stop();
car.drive();
car.brake();

---------------------------------------------------------------
OBJECTS & REFERENCES
---------------------------------------------------------------

Car car1 = new Car();
Car car2 = new Car();

- Each 'new Car()' creates a separate Car object.
- car1 and car2 are references to their respective objects.

---------------------------------------------------------------
IMPORTANT
---------------------------------------------------------------

- A class is a blueprint/template for creating objects.
- An object is an instance of a class.
- Objects contain state (attributes) and behavior (methods).
- Objects are reference data types.

===============================================================
*/

package OOPs.A1_Object;

public class Main {
    public static void main(String[] args) {
        System.out.println("OOPS\n");

        Car car = new Car();

        System.out.println("Manufacturer : " +car.make);
        System.out.println("Model : " + car.model);
        System.out.println("Manfacture year : " + car.year);
        System.out.println("Price : $" +car.price);
        System.out.println("Running : " +car.isRunning+ "\n");
        
        
        
        System.out.println("Running : " +car.isRunning);
        car.start();
        System.out.println("Running : " +car.isRunning);
        car.stop();
        System.out.println("Running : " +car.isRunning+ "\n");


        car.drive();
        car.brake();


        // here we can only create cars of same company and model
        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println("\nCars : ");
        System.out.println(car1.make+ " " +car1.model);
        System.out.println(car2.make+ " " +car2.model);

        // here to make car of different models and features
        // We use "CONSTRUCTOR"


    }
}
