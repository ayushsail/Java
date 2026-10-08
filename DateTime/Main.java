/*
========================= DATE & TIME =========================

Java provides the modern Date-Time API through the java.time
package.

MAIN CLASSES:

1. LocalDate
- Represents a date without time or timezone.
- Example: 2026-10-08

Example:
LocalDate date = LocalDate.now();

---------------------------------------------------------------

2. LocalTime
- Represents a time without date or timezone.

Example:
LocalTime time = LocalTime.now();

---------------------------------------------------------------

3. LocalDateTime
- Represents both date and time.
- Does NOT contain timezone information.

Example:
LocalDateTime dateTime = LocalDateTime.now();

---------------------------------------------------------------

4. Instant
- Represents a moment on the UTC timeline.
- Useful for timestamps and machine-to-machine time.

Example:
Instant timestamp = Instant.now();

---------------------------------------------------------------

COMMON METHODS:

LocalDate / LocalTime / LocalDateTime:

now()
- Returns the current date/time.

of(...)
- Creates a date/time using specified values.

plusDays()
- Adds days.

minusDays()
- Subtracts days.

plusHours()
- Adds hours.

minusHours()
- Subtracts hours.

isBefore()
- Checks whether this date/time occurs before another.

isAfter()
- Checks whether this date/time occurs after another.

isEqual()
- Checks whether two date/time objects represent the same value.

---------------------------------------------------------------

DATE/TIME FORMATTING:

DateTimeFormatter class - Used to format date/time objects into custom text.

Example:

DateTimeFormatter formatter =
    DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

String formatted = dateTime.format(formatter);

COMMON PATTERNS:

dd   → day
MM   → month
yyyy → year
HH   → hour (24-hour)
mm   → minute
ss   → second

---------------------------------------------------------------

CREATING CUSTOM DATE/TIME:

LocalDate date =
    LocalDate.of(2026, 11, 15);

LocalTime time =
    LocalTime.of(14, 30, 45);

LocalDateTime dateTime =
    LocalDateTime.of(2026, 11, 15, 14, 30);

---------------------------------------------------------------

IMPORTANT:
- java.time classes are immutable.
- Date/time operations return a NEW object rather than
  modifying the existing object.

Example:
date = date.plusDays(5);

- LocalDate, LocalTime and LocalDateTime do not contain
  timezone information.
- Use Instant for a point on the UTC timeline.
- Use ZonedDateTime when a specific timezone is required.

===============================================================
*/

package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        System.out.println("DATE & TIME\n");

        // 1. LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("1. DATE : " +localDate);

        // 2. LocalTime
        LocalTime localTime = LocalTime.now();
        System.out.println("2. TIME : " +localTime);

        // 3. LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("3. DATE & TIME : " +localDateTime);

        // 4. UTC Timestamp
        Instant instant = Instant.now();
        System.out.println("4. UTC : " +instant +"\n\n");



        // Custom format - using DateTimeFormatter class
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy   HH:mm:ss");

        String newDateTime = dateTime.format(formatter);

        System.out.println("FORMATTED DATE & TIME : " +newDateTime);

        System.out.println("\n\n");



        // Custom Date Time Object
        LocalDateTime date1 = LocalDateTime.of(2026, 12, 25, 12,0, 0);
        System.out.println("Chrismas Date : " +date1);
        
        LocalDateTime date2 = LocalDateTime.of(2027, 1, 1, 0,0, 0);
        System.out.println("New Year Date : " +date2 + "\n");


        // Comparing Date & Time
        if (date1.isBefore(date2)) { System.out.println(date1 +" is earlier than " +date2); }
        
        else if (date1.isAfter(date2)) { System.out.println(date1 +" is later than " +date2); }
        
        else if (date1.isEqual(date2)) { System.out.println(date1 +" is equal to " +date2); }

    }
}
