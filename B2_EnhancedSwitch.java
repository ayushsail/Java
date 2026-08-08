/*
==================== ENHANCED SWITCH ====================

Definition:
- Enhanced switch is a cleaner replacement for multiple
  else-if statements.
- Arrow syntax (->) was introduced in Java 14.

Syntax:
switch (expression) {
    case value1 -> statement;
    case value2 -> statement;
    default -> statement;
}

----------------------------------------------------------
Multiple Cases
----------------------------------------------------------

- Multiple cases can share the same statement using commas.

Example:
case "monday", "tuesday", "wednesday" -> System.out.println("Weekday");

==========================================================
*/

import java.util.Scanner;
public class B2_EnhancedSwitch {
    public static void main(String[] args) {
        System.out.println("ENHANCED SWITCH\n");
        Scanner s=new Scanner(System.in);


        System.out.print("Enter the day of the week : ");
        String day = s.nextLine();

        switch (day.toLowerCase()) {
            case "monday" -> System.out.println("Its a Weekday  :(");
            case "tuesday" -> System.out.println("Its a Weekday  :(");
            case "wednesday" -> System.out.println("Its a Weekday  :(");
            case "thursday" -> System.out.println("Half way there to the Weekend  :)");
            case "friday" -> System.out.println("Its a Weekend Night today  :)");
            case "saturday" -> System.out.println("Its a Weekend  :)");
            case "sunday" -> System.out.println("Its a Weekend  :)");
            default -> System.out.println("Invalid Day Input !");
        }
        
        // // Simplify Repeatative Statement - by writing it in comma separated form

        // switch (day.toLowerCase()) {
        //     case "monday","tuesday","wednesday" -> System.out.println("Its a Weekday  :(");
        //     case "thursday" -> System.out.println("Half way there to the Weekend  :)");
        //     case "friday" -> System.out.println("Its a Weekend Night today  :)");
        //     case "saturday","sunday" -> System.out.println("Its a Weekend  :)");
        //     default -> System.out.println("Invalid Day Input !");
        // }

        switch (day.toLowerCase()) {
            case "monday","tuesday","wednesday","thursday","friday" -> System.out.println("COLLEGE  :(");
            case "saturday","sunday" -> System.out.println("RELAX :)");
            default -> System.out.println("Invalid Day Input !");
        }

        s.close();
    }
}
