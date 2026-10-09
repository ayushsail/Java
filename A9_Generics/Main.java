/*
============================= GENERICS =============================

Definition:
- Generics allow classes, interfaces, and methods to work with
  different data types while maintaining type safety.
- Basically a concept where you can write a class, interace or method,
  that is compatible with different DataTypes.
- They allow reusable code without sacrificing compile-time
  type checking.

TYPE PARAMETER:
- A placeholder representing a type.
- Written inside angle brackets <>.

Example:
class Container<T> { }

Here:
T → Type parameter

TYPE ARGUMENT:
- The actual type supplied when using a generic class or method.

Example:
Container<String> item = new Container<>();

Here:
String → Type argument

----------------------------------------------------------------

GENERIC CLASS WITH ONE TYPE PARAMETER:

class Container<T> {
    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

Usage:
Container<String> c = new Container<>();

c.setValue("Java");
System.out.println(c.getValue());

----------------------------------------------------------------

GENERIC CLASS WITH MULTIPLE TYPE PARAMETERS:

class Pair<T, U> {
    T first;
    U second;
}

Usage:
Pair<String, Integer> p = new Pair<>();

Here:
T → String
U → Integer

- Each type parameter can represent a different data type.

----------------------------------------------------------------

COMMON TYPE PARAMETER CONVENTIONS:

T → Type
E → Element
K → Key
V → Value
N → Number

These are naming conventions, not mandatory keywords.

----------------------------------------------------------------

ADVANTAGES:
- Code reusability.
- Compile-time type safety.
- Reduces unnecessary type casting.
- Helps create flexible data structures and algorithms.

IMPORTANT:
- Use wrapper classes instead of primitive types in generics.
  Example: Integer instead of int.
- Type parameters can represent reference types.
- Generics are commonly used in collections such as ArrayList,
  HashMap, and other reusable classes.
- Type parameters can also be used in generic methods.
- Java generally implements generics using TYPE ERASURE.

====================================================================
*/


/*
Generics - A concept where you can write a class, interace or method,
         - that is compatible with different DataTypes.
         - <T> type parameter (placeholder that gets replaced with a real datatype).
         - <String> type arguments (specifies the type)
*/

package A9_Generics;

public class Main {
    public static void main(String[] args) {
        System.out.println("GENERICS\n");


        // Strings
        Box<String> boxOfStrings = new Box<>();

        boxOfStrings.setItem("Ayush");
        System.out.println(boxOfStrings.getItem());
        

        // Integers
        Box<Integer> boxOfIntegers = new Box<>();

        boxOfIntegers.setItem(9999);
        System.out.println(boxOfIntegers.getItem());
        

        // Double
        Box<Double> boxOfDouble = new Box<>();

        boxOfDouble.setItem(3.142);
        System.out.println(boxOfDouble.getItem());



        Product<String,Integer> phone = new Product<>("Iphone", 1000);

        System.out.println("\n\nItem : " +phone.getItem());
        System.out.println("Price : $" +phone.getPrice());










    }
}
