/*
=========================== INHERITANCE ===========================

Definition:
- One class inherit the attributes & methods from another class.
- CHILD <- PARENT
- CHILD class inherit all the attributes & methods from the PARENT class
- Promotes code reusability and represents an "IS-A" relationship.

Syntax:
class Child extends Parent { }

---------------------------------------------------------------
TYPES OF INHERITANCE
---------------------------------------------------------------

1. SINGLE INHERITANCE
   One child inherits from one parent.

        Parent
           |
         Child

2. MULTILEVEL INHERITANCE
   A class inherits from a class that inherits from another.

      Grandparent
           |
         Parent
           |
         Child

3. HIERARCHICAL INHERITANCE
   Multiple child classes inherit from one parent.

          Parent
          /    \
      Child1  Child2

4. MULTIPLE INHERITANCE
   One child inherits from multiple parents.

      Parent1   Parent2
           \     /
           Child

   - Java does NOT support multiple inheritance through classes.
   - It can be achieved using interfaces.

5. HYBRID INHERITANCE
   Combination of two or more inheritance types.

        Parent
        /    \
     Child1  Child2
        \    /
        Child3

   - Java does not support hybrid inheritance involving
     multiple parent classes directly.
   - Hybrid structures can be created using classes and interfaces.

---------------------------------------------------------------
KEY TERMS
---------------------------------------------------------------

- Parent / Superclass → class being inherited from.
- Child / Subclass    → class that inherits.
- extends             → keyword for class inheritance.
- implements          → keyword for implementing interfaces.

---------------------------------------------------------------
IMPORTANT
---------------------------------------------------------------

- Constructors are NOT inherited.
- Private members cannot be accessed directly by subclasses.
- A subclass can add its own fields and methods.
- Java supports single, multilevel, and hierarchical class
  inheritance.
- Multiple and hybrid inheritance are possible through
  interfaces, subject to Java's interface rules.

===============================================================
*/

package OOPs.A6_Inheritance;

public class Main {
    public static void main(String [] args) {
        System.out.println("INHERITANCE\n");

        
        Dog tommy = new Dog();
        System.out.println("Is tommy Alive : " + tommy.isAlive);
        tommy.eat();
        tommy.speak();

        
        Cat bella = new Cat();
        System.out.println("Is bella Alive : " + bella.isAlive);
        bella.eat();
        bella.speak();
        
        
        Plant sunflower = new Plant();
        System.out.println("Is sunflower Alive : " + sunflower.isAlive);
        sunflower.photosythesis();


    }
}
