/*
======================= EXCEPTION HANDLING =======================

Definition:
- An exception is an event that occurs during program execution
  and disrupts the normal flow of the program.

Examples:
- Dividing by zero
- Invalid input type
- File not found
- Null reference
- Invalid array index

Exception handling allows the program to handle these errors
instead of terminating unexpectedly.

---------------------------------------------------------------

TRY:
- Contains code that may cause an exception.

Syntax:
try {
    // risky code
}

CATCH:
- Handles an exception thrown inside the try block.

Syntax:
catch (ExceptionType e) {
    // handle exception
}

FINALLY:
- Contains code that normally executes whether an exception
  occurs or not.
- Commonly used for cleanup.

Syntax:
finally {
    // cleanup code
}

---------------------------------------------------------------

MULTIPLE CATCH BLOCKS:

try {
    // risky code
}
catch (ArithmeticException e) {
    // specific exception
}
catch (InputMismatchException e) {
    // specific exception
}
catch (Exception e) {
    // general fallback
}

IMPORTANT:
- Catch specific exceptions before general exceptions.
- Exception is a parent class of many exceptions.
- Therefore catch (Exception e) should normally be last.

---------------------------------------------------------------

TRY-WITH-RESOURCES:

try (Scanner s = new Scanner(System.in)) {
    // use resource
}

- Automatically closes resources that implement AutoCloseable.
- No separate close() is required.

---------------------------------------------------------------

IMPORTANT:
- Exception handling does not prevent exceptions from occurring.
- It allows the program to respond to them safely.
- finally is for cleanup, NOT necessarily "successful execution".
- Avoid silently ignoring exceptions.

---------------------------------------------------------------
ArithmeticException              - Invalid arithmetic operation, such as integer division by zero.
InputMismatchException           - Input does not match the expected data type.
NullPointerException              - Attempting to use a null reference.
ArrayIndexOutOfBoundsException    - Accessing an array using an invalid index.
StringIndexOutOfBoundsException   - Accessing a String using an invalid index.
NumberFormatException             - Converting an invalid String into a number.
IllegalArgumentException          - Method receives an inappropriate argument.
IllegalStateException             - Method called when the object is in an invalid state.
ClassCastException                - Invalid casting between incompatible types.
IndexOutOfBoundsException         - Index is outside the valid range of a collection/list.
IOException                       - General input/output operation failure.
FileNotFoundException             - Requested file cannot be found or opened.
EOFException                      - Unexpected end of an input stream or file.
SQLException                      - Error while interacting with a database.
InterruptedException              - A thread is interrupted while waiting or sleeping.
ConcurrentModificationException   - Collection is modified while being improperly iterated.
UnsupportedOperationException     - Requested operation is not supported.
SecurityException                 - A security violation or restricted operation occurs.


===============================================================
*/

package A5_ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("EXCEPTION HANDLING\n");

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("DIVISION");
            System.out.print("Enter first number : ");
            int a = s.nextInt();
            System.out.print("Enter second number : ");
            int b = s.nextInt();
            System.out.println(a + "/" + b +  " = " + a/b);
        }

        catch (ArithmeticException e) {                 // Dividing by zero
            System.out.println("YOU CAN'T DIVIDE BY ZERO !");
        }

        catch (InputMismatchException e) {              // Invalid Datatype Input
            System.out.println("INVALID DATATYPE ! ENTER AN INTEGER.");
        }

        catch (Exception e) {                           // All Exception included
            // SAFETY NET
            System.out.println("Something went wrong !");
        }

        finally {
            System.out.println("\nExecution completed.");
        }

    }
}
