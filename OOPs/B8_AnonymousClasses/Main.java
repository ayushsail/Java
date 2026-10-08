/*
========================= ANONYMOUS CLASSES =========================

Definition:
- An anonymous class is a class without a declared name.
- It is created and instantiated at the same time.
- Used to provide custom behavior without creating a separate
  named class.
- Useful when the behavior is needed only once.

Syntax:

ClassName object = new ClassName() {

    @Override
    void method() {
        // custom behavior
    }
};

---------------------------------------------------------------

COMMON USES:
- One-time custom behavior
- Runnable
- TimerTask
- Callbacks
- Event handling

---------------------------------------------------------------

IMPORTANT:
- Anonymous classes do not have a class name that can be referenced
  directly in the program.
- They can extend a class or implement an interface.
- They can override inherited methods.
- They are generally used for one-time or short-lived behavior.
- Each anonymous class expression creates an instance of an
  unnamed class.

---------------------------------------------------------------

ANONYMOUS CLASS vs NORMAL CLASS:

Normal class:
- Has a name.
- Can be reused to create multiple objects.
- Usually declared separately.

Anonymous class:
- Has no explicit name.
- Created at the point of use.
- Mainly used for specialized one-time behavior.

---------------------------------------------------------------

Example:

Runnable task = new Runnable() {

    @Override
    public void run() {
        System.out.println("Task is running");
    }
};

task.run();

Here:
- Runnable is the interface.
- An anonymous class provides the implementation of run().
- No separate class is created for the implementation.

===============================================================
*/

package OOPs.B8_AnonymousClasses;

public class Main {
    public static void main(String[] args) {
        System.out.println("ANONYMOUS CLASSES\n");

        // For dog named "tommy", 
        // who speaks normal dog language.
        Dog tommy = new Dog();
        System.out.println("Tommy : " +tommy.speak());


        // For dog named "Scooby Do"
        // who speaks English Language
        // So he needs a custom speak method
        // thus we use Anonymous classes

        Dog ScoobyDo = new Dog() {
            
            @Override 
            String speak() {
                return "Ruh Roh";
            }
        };

        System.out.println("Scooby do : " +ScoobyDo.speak());

        
        
    }
}
