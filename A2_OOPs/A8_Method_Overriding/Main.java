/*
======================= METHOD OVERRIDING =======================

Definition:
- Method overriding occurs when a subclass provides its own
  implementation of a method already defined in its superclass.
- Used to give specialized behavior to inherited methods.
- Allows for code reusability and give specific implementations.

Syntax:

class Parent {
    void show() {
        // parent implementation
    }
}

class Child extends Parent {
    @Override
    void show() {
        // child implementation
    }
}

--------------------------------------------------------------
EXAMPLE
--------------------------------------------------------------

class Vehicle {
    String sound() {
        return "Generic sound";
    }
}

class Bike extends Vehicle {
    @Override
    String sound() {
        return "Horn";
    }
}

--------------------------------------------------------------
@Override ANNOTATION
--------------------------------------------------------------

- @Override tells Java that the method is intended to override
  a superclass method.
- Helps detect mistakes such as misspelled method names or
  incorrect parameters.
- Not mandatory, but strongly recommended.

--------------------------------------------------------------
RULES
--------------------------------------------------------------

- Method name and parameter list must match the parent method.
- Return type must be the same or a covariant return type.
- Cannot reduce the visibility of the overridden method.
- Static methods are hidden, not overridden.
- Constructors cannot be overridden.

--------------------------------------------------------------
IMPORTANT
--------------------------------------------------------------

Inheritance → provides the inherited method.
Overriding → changes its implementation in the subclass.

==============================================================
*/

package A2_OOPs.A8_Method_Overriding;

public class Main {
    public static void main(String [] args) {
        System.out.println("METHOD OVERRIDING\n");

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        System.out.println("The Dog is " +dog.move());
        System.out.println("The Cat is " +cat.move());
        System.out.println("The Fish is " +fish.move());


    }
}
