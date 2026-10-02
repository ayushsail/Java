/*
=========================== toString() ===========================

Definition:
- toString() is a method inherited from the Object class.
- Used to return a String representation of an object.
- By default, it returns a class name + hash code representation.
- It can be overridden to display meaningful object details.

---------------------------------------------------------------
DEFAULT toString()
---------------------------------------------------------------

System.out.println(object);

- Java automatically calls object.toString().
- Default output is similar to:
  ClassName@hashCode

---------------------------------------------------------------
OVERRIDING toString()
---------------------------------------------------------------

@Override
public String toString() {
    return "Name: " + name + ", Age: " + age;
}

- Allows you to control how the object is represented as a String.
- Makes printing object details easier and more readable.

Example:

class Book {
    String title;
    double price;

    @Override
    public String toString() {
        return title + " - $" + price;
    }
}

System.out.println(book);

---------------------------------------------------------------
IMPORTANT
---------------------------------------------------------------

- toString() returns a String.
- It is automatically called when an object is printed
  using System.out.println().
- Recommended to use @Override when redefining it.
- Every Java class ultimately inherits from Object.

===============================================================
*/

package OOPs.A9_ToString;

public class Main {
    public static void main(String[] args) {
        System.out.println("TOSTRING\n");

        Car car1 = new Car("Ford","Mustang",1969,"Red");
        Car car2 = new Car("Toyota","Supra",1981,"White");

        // if you directly print "car1" object
        // you will get a hash code - OOPs.A9_ToString.Car@1dbd16a6  

        // to directly print the parameters/details of the object "car1"
        // we use toString method

        System.out.println(car1);     
        System.out.println(car2);     

    }
}
