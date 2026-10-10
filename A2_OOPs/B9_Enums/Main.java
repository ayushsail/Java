/*
============================= ENUMS =============================

Definition:
- Enum (Enumeration) is a special type that represents a fixed
  set of named constants.
- Improves code readability, type safety, and maintainability.
- Enums can be used with switch statements.

Example:

enum OrderStatus {
    PENDING,
    PROCESSING,
    COMPLETED,
    CANCELLED
}

---------------------------------------------------------------

COMMON ENUM METHODS:

valueOf(String)
- Returns the enum constant matching the given name.
- Throws IllegalArgumentException if the name is invalid.

Example:
OrderStatus status = OrderStatus.valueOf("COMPLETED");

values()
- Returns an array containing all enum constants.

Example:
for (OrderStatus status : OrderStatus.values()) {
    System.out.println(status);
}

name()
- Returns the exact name of the enum constant.

Example:
System.out.println(status.name());

ordinal()
- Returns the zero-based position of the constant in the enum.
- Avoid using ordinal() as a permanent identifier because changing
  the declaration order changes the ordinal values.

---------------------------------------------------------------

ENUMS WITH FIELDS, CONSTRUCTORS & METHODS:

enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private final int level;

    Priority(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}

Usage:
Priority p = Priority.HIGH;
System.out.println(p.getLevel());

---------------------------------------------------------------

ENUMS WITH SWITCH:

switch (status) {
    case PENDING -> System.out.println("Order is waiting");
    case PROCESSING -> System.out.println("Order is in progress");
    case COMPLETED -> System.out.println("Order is finished");
    case CANCELLED -> System.out.println("Order was cancelled");
}

---------------------------------------------------------------

IMPORTANT:
- Enum constants are written in UPPERCASE by convention.
- Enums provide a fixed set of valid values.
- Enums can have fields, constructors, and methods.
- Enum constructors cannot be called directly with new.
- Enums can implement interfaces, but cannot extend another class.
- valueOf() is case-sensitive.
- Use toUpperCase() or another normalization approach when accepting
  user input in different letter cases.
- Enums are generally safer than using arbitrary strings for a
  predefined set of options.

===============================================================
*/

package A2_OOPs.B9_Enums;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ENUMS\n");

        try (Scanner s = new Scanner(System.in)) {

            System.out.print("Enter a day of the week : ");
            String response = s.nextLine().toUpperCase();

            Day day = Day.valueOf(response);

            System.out.println("\nDay : " +day);
            System.out.println("Day number : " +day.getDayNumber());

            
            // enums are more efficient with swithces compare to the Strings.
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY -> System.out.println("It's a WEEKDAY  :(");
                case THURSDAY -> System.out.println("Half way there to the Weekend  :)");
                case FRIDAY -> System.out.println("Its a Weekend Night today  :)");
                case SATURDAY, SUNDAY -> System.out.println("It's a WEEKEND !! :)");
                // YOU CAN ALSO USE dayNumber INSTEAD OF THE CONSTANT
            }
        }
        catch(IllegalArgumentException e) {
            System.out.println("Please enter a valid day !");
        }
        
    }
}
