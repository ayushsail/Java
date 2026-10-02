/*
======================= VARIABLE SCOPE =======================

Scope = The part of the program where a variable can be used.

1. LOCAL SCOPE
- Variable declared inside a method/block.
- Can only be used within that method/block.
- Created when the method starts and removed when it ends.

2. CLASS SCOPE
- Variable declared inside the class but outside methods.
- Can be accessed by methods of the class.
- A static class variable is shared by all methods/objects.

--------------------------------------------------------------
VARIABLE PRIORITY
--------------------------------------------------------------

- If a local variable and class variable have the same name,
  Java prefer the LOCAL variable first.

Example:

static int x = 3;       // Class variable

static void test() {
    int x = 2;          // Local variable
    System.out.println(x);
}

Output: 2

- To access the class variable when the names are the same,
  use the class name:

System.out.println(ClassName.x);

--------------------------------------------------------------
SIMPLE EXAMPLE
--------------------------------------------------------------

static int x = 10;     // Class scope

static void show() {
    int x = 20;        // Local scope
    System.out.println(x);
}

show() → 20

- Local x (20) takes priority over class x (10).

===============================================================
*/
package JavaBasics;

public class B8_VariableScope {

    static int x = 3;       // Class Scope      no usage

    public static void main(String[] args) {
        System.out.println("VARIABLE SCOPE\n");

        int x = 1;      // Local Scope

        System.out.println(x);

        dosomething();

    }

    static void dosomething() {
        int x = 2;      // Local Scope

        System.out.println(x);
    }
}
