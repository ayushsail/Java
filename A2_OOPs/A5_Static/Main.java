/*
================== STATIC VARIABLE & METHODS ==================

Definition:
- static makes a variable or method belong to the CLASS,
  rather than to a specific object.
- A static member is shared by all objects of the class.
- Commonly used for shared data and utility methods.

--------------------------------------------------------------
STATIC VARIABLE
--------------------------------------------------------------

- Only one copy is created for the entire class.
- All objects share the same static variable.
- Access using the class name.

Example:

class Employee {
    static String company = "TechCorp";
    String name;
}

Employee.company;

--------------------------------------------------------------
STATIC METHOD
--------------------------------------------------------------

- Belongs to the class instead of an object.
- Can be called using the class name.
- Can directly access static members.

Example:

class Calculator {
    static int square(int n) {
        return n * n;
    }
}

Calculator.square(5);

--------------------------------------------------------------
IMPORTANT
--------------------------------------------------------------

- Static → class-level member.
- Non-static → object-level member.
- Static members can be accessed without creating an object.
- A static method cannot directly access non-static members.

Syntax:
ClassName.staticVariable
ClassName.staticMethod()

==============================================================
*/

package A2_OOPs.A5_Static;

public class Main {
    public static void main(String[] args) {
        System.out.println("STATIC VARIABLE & METHODS\n");

        Friend frd1 = new Friend("SpongeBob");
        Friend frd2 = new Friend("Patrick");
        Friend frd3 = new Friend("Squidward");
        Friend frd4 = new Friend("Sandy");

        System.out.printf("Names of Friends : %s, %s, %s, %s.\n",frd1.name,frd2.name,frd3.name,frd4.name);

        // Static variable is access using class name itself
        // System.out.println("Number of Friends : " +Friend.numOfFriend);
        
        
        // Static method is access using class name itself
        Friend.showFriends();



        // Example - Math class has a static method - round
        //         - here we do not create a class to call the round method.
        Math.round(0.99);

    }
}
