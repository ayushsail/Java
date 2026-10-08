/*
=========================== INTERFACES ===========================

Definition:
- An interface is a blueprint/contract that speicifies a set of methods,
- that implementing classes MUST define.
- A class uses "implements" keyword to implement an interface.
- A class can implement MULTIPLE interfaces, providing
  multiple-inheritance-like behavior.

Interface can contain:
- Abstract methods
- Default methods
- Static methods
- Private methods
- Constants (public static final)

Syntax:

interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing report");
    }
}

IMPORTANT:
- Interface methods that are abstract must be implemented
  by the implementing class.
- An interface cannot be instantiated directly.
- A class can implement multiple interfaces.
- A class can extend one class and implement multiple interfaces.

Example:

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

class Duck implements Flyable, Swimmable {
    // implements both interfaces
}

=================================================================
*/

/*
Interface - A blueprint of class that speicifies a set of abstract methods,
          - that implementing classes MUST define.
          - Support Multiple Inheritance like behaviour.
*/

package A2_OOPs.B2_Interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println("INTERFACES\n");

        Rabbit rabbit = new Rabbit();
        Eagle eagle = new Eagle();
        Fish fish = new Fish();

        rabbit.flee();
        eagle.hunt();

        fish.flee();
        fish.hunt();;
    }
}