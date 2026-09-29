/*
========================= ARRAY OF OBJECTS =========================

Definition:
- An array of objects stores references to multiple objects
  of the same class.
- The array stores object references, not the objects themselves.

---------------------------------------------------------------
CREATING AN ARRAY OF OBJECTS
---------------------------------------------------------------

Example:

Book b1 = new Book("Java");
Book b2 = new Book("Python");

Book[] books = {b1, b2};

Or:

Book[] books = new Book[2];
books[0] = new Book("Java");
books[1] = new Book("Python");

---------------------------------------------------------------
ANONYMOUS OBJECTS
---------------------------------------------------------------

- An object created without storing its reference in a variable.

Example:

Book[] books = {
    new Book("Java"),
    new Book("Python")
};

---------------------------------------------------------------
ACCESSING OBJECTS
---------------------------------------------------------------

- Use a loop to access each object.

for (Book book : books) {
    book.read();
}

- In an enhanced for-loop, the data type is the class name.

---------------------------------------------------------------
IMPORTANT
---------------------------------------------------------------

- Array size is fixed.
- All elements must be of the same class type.
- Each array element stores a reference to an object.
- Object attributes can be modified through the array.

Example:

books[0].title = "C++";

===============================================================
*/

package OOPs.A4_ArrayOfObject;

public class Main {
    public static void main(String[] args) {
        System.out.println("ARRAY OF OBJECTS\n");

        Car car1 = new Car ("Mustang","Red");
        Car car2 = new Car ("Corvette", "Blue");
        Car car3 = new Car ("Charge", "Yellow");

        Car[] cars = {car1, car2, car3};

        /*
        // Alternate Way - Assign size to Array of Object
        Car[] cars = new Car[3]; 
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        */



       /*
       // Alternate Way - Creating anonymous object itself in the Array of Object
                        - anonymous object - object which don't have any reference variable

       Car[] cars = {new Car("Mustang","Red"),
                     new Car("Corvette", "Blue"),
                     new Car("Charge", "Yellow")};
       */

        // Enhanced for-loops => here the DataType is the ClassName
        for (Car car : cars) {
            car.drive();
        }
        
        // Changing color of cars
        for (Car car : cars) {
            car.color = "black";
        }

        System.out.println("\nAfter Changing color : ");
        for (Car car : cars) {
            car.drive();
        }


    }
}
