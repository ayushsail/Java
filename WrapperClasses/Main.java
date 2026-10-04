/*
========================= WRAPPER CLASSES =========================

Definition:
- Wrapper classes convert primitive values into objects.
- They "wrap" a primitive value inside an object.

Primitive    Wrapper
---------    -------
byte         Byte
short        Short
int          Integer
long         Long
float        Float
double       Double
char         Character
boolean      Boolean

Why use Wrapper Classes?
- Collections require objects, not primitive types.
- Provide useful utility methods.
- Can represent the absence of a value using null.
- Used by many Java APIs that work with objects.

---------------------------------------------------------------

AUTOBOXING:
- Automatic conversion of a primitive into its wrapper object.

Example:
int x = 10;
Integer a = x;

UNBOXING:
- Automatic conversion of a wrapper object into its primitive value.

Example:
Integer a = 10;
int x = a;

---------------------------------------------------------------

UTILITY METHODS:

1. Primitive → String

Integer.toString(123);
Double.toString(3.14);
Character.toString('A');
Boolean.toString(true);

2. String → Primitive

Integer.parseInt("123");
Double.parseDouble("3.14");
Boolean.parseBoolean("true");

- Character does not provide a parseChar() method.
- A char can be obtained from a String using charAt().

Example:
char ch = "Hello".charAt(0);

3. Character Utility Methods

Character.isLetter(ch);
Character.isDigit(ch);
Character.isUpperCase(ch);
Character.isLowerCase(ch);
Character.isWhitespace(ch);

---------------------------------------------------------------

IMPORTANT:
- Wrapper classes are objects; primitives are not objects.
- Prefer primitives when an object is not required.
- Autoboxing and unboxing happen automatically in many situations.
- Wrapper objects are immutable.
- Wrapper classes are part of java.lang, so no import is required.

===============================================================
*/

package WrapperClasses;

public class Main {
    public static void main(String[] args) {
        System.out.println("WRAPPER CLASSES\n");

        // Wrapper classes - Integer, Double, Character, Boolean, etc.
        // String is NOT a wrapper class.

        // OLD METHOD
        /*
        Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('c');
        Boolean d = new Boolean(true);
        */
        // this methods are deprecated since version 9 Java

        // CURRENT METHOD
        // AUTOBOXING - primitive to object 
        Integer a = 123;
        Double b = 3.14;
        Character c = '@';
        Boolean d = false;

        // UNBOXING - object to primitive
        int p = a;
        double q = b;
        char r = c;
        boolean s = d;
        System.out.printf("p, q, r, s. : %d, %.2f, %c, %b.\n\n",p,q,r,s);
        
        
        
        // USEFULL UTILITY METHODS
        
        // 1. Convert primitve datatype to String using "toString" method of wrapper classes
        String e = Integer.toString(123);
        String f = Double.toString(3.14);
        String g = Character.toString('@');
        String h = Boolean.toString(false);
        
        String z = e + f + g + h;
        System.out.printf("e + f + g + h : %s\n\n",z);
        
        // 2. Convert String to primitve datatype using "parse" method of wrapper classes
        
        int u = Integer.parseInt("123");
        double v = Double.parseDouble("3.14");
        char w = "Pizza".charAt(0);         // Character dosen't have a parse method
        boolean x = Boolean.parseBoolean("true");
        System.out.printf("u, v, w, x. : %d, %.2f, %c, %b.\n\n",u,v,w,x);

        // 3. Miscelenous 
        char t = 'b';

        System.out.printf("Is Letter : %b\n", Character.isLetter(t));
        System.out.printf("Is Uppercase Letter : %b\n", Character.isUpperCase(t));
        System.out.printf("Is Lowercase Letter : %b\n", Character.isLowerCase(t));
        

    }
}
