/*
========================= POLYMORPHISM =========================

Definition:
- "POLY" -> "MANY"
- "MORPH" -> "SHAPE"
- Polymorphism means "many forms".
- Polymorphism allows an object to be treated as an object
  of a common parent type while still performing its own
  specialized behavior.
- Object can identify as other objects.
- Objects can be treated as objects of a common superclass.
- Polymorphism can be achieved using Inheritance (Abstract Classes) or Interfaces

1st Example:

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

Animal[] animals = {new Dog(), new Cat()};

for (Animal animal : animals) {
    animal.sound();
}

Output:
Bark
Meow

Here:
- Animal is the common parent type.
- Dog and Cat are different forms of Animal.
- The reference type is Animal.
- The actual object determines which overridden method runs.

2nd Example:

public interface Payment {
    void pay();
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using Credit Card");
    }
}

class UPI implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using UPI");
    }
}

Payment[] payments = {
    new CreditCard(),
    new UPI()
};

for (Payment payment : payments) {
    payment.pay();
}

Here:
- Payment is the common interface.
- CreditCard and UPI provide different implementations.
- The same Payment reference can refer to different objects.
- The actual object determines which pay() method runs.


Polymorphism can be achieved using:
1. Inheritance
2. Interfaces

Types of Polymorphism:
- Compile-time → Method Overloading
- Runtime → Method Overriding

IMPORTANT:
- A parent-class reference can refer to a child-class object.
- An interface reference can refer to an implementing-class object.
- Runtime polymorphism uses dynamic method dispatch.

===============================================================
*/

package OOPs.B3_Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("POLYMORPHISM\n");

        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        // If we create a Array object Car[], 
        // It can only contains car object
        // Car[] cars = {car, bike, boat};        // Bike, Boat cannot be converted to Car

        // Similarly for Array of Bike & Boat
        // Bike[] bikes = {car, bike, boat};      // Car, Boat cannot be converted to Bike
        // Boat[] boats = {car, bike, boat};      // Car, Bike cannot be converted to Boat


        // BUT, all are identified as vehicles
        Vehicle[] vehicles = {car, bike, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }


    }
}