/*
===================== RUNTIME POLYMORPHISM =====================

Definition:
- Runtime polymorphism occurs when the method to execute is
  decided at runtime based on the actual object.

- It is achieved through METHOD OVERRIDING and inheritance
  or interfaces.

Example:

Animal animal = null;

if (choice == 1) {
    animal = new Cat();
}
else if (choice == 2) {
    animal = new Dog();
}

animal.speak();


Here:
- Animal is the reference type.
- Cat and Dog are different subclasses of Animal.
- Both override the speak() method.
- The same statement:

      animal.speak();

  can execute different implementations.

If actual object = Cat  → Cat.speak()
If actual object = Dog  → Dog.speak()

This method selection is performed at RUNTIME.

---------------------------------------------------------------
KEY IDEA:

Reference Type → decides WHAT methods are accessible.
Actual Object  → decides WHICH overridden method executes.

Example:
Animal animal = new Cat();

Animal → reference type
Cat    → actual object

---------------------------------------------------------------
IMPORTANT:
- Requires inheritance or interfaces.
- Usually demonstrated using method overriding.
- Also called Dynamic Method Dispatch.
- The decision is made at runtime, not compile time.

===============================================================
*/

package A2_OOPs.B4_RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("RUNTIME POLYMORPHISM\n");
        Scanner s = new Scanner(System.in);

        Animal animal = null;

        System.out.printf("1 : Cat\n2 : Dog\n");
        System.out.print("Enter your choice : ");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.println("Your new pet is a CAT");
            animal = new Cat();
        }

        else if (choice == 2) {
            System.out.println("Your new pet is a DOG");
            animal = new Dog();
        }

        else {
            System.out.println("INVALID INPUT");
            s.close();
            return;
        }
        if (animal != null) {
            animal.speak();
        }

        s.close();
    }
}