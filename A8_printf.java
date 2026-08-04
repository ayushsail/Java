/*
======================== PRINTF ========================

Definition:
- printf() is used to print formatted output.

Syntax:
System.out.printf("format", values);

Format:
%[flags][width][.precision][datatype-specifier]

--------------------------------------------------------
1. DATATYPE SPECIFIERS
--------------------------------------------------------

%s  -> String
%c  -> Character
%d  -> Integer
%f  -> Floating-point
%b  -> Boolean
%n  -> New Line

Example:
System.out.printf("%s %d %.2f", name, age, height);

--------------------------------------------------------
2. PRECISION
--------------------------------------------------------

Controls decimal places.

%.1f  -> 3.1
%.2f  -> 3.14
%.3f  -> 3.142

--------------------------------------------------------
3. FLAGS
--------------------------------------------------------

+  ->  Show + for positive numbers.
,  ->  Comma separator (1,000).
(  ->  Negative numbers in parentheses.
(space) -> Space for positive, '-' for negative.

Example:
%+.2f
%,.2f
%(.2f
% .2f

--------------------------------------------------------
4. WIDTH
--------------------------------------------------------

Minimum number of characters.

%5d   -> Right aligned.
%-5d  -> Left aligned.
%05d  -> Zero padded.

========================================================
*/

public class A8_printf {
    public static void main(String[] args) {
        System.out.println("PRINTF STATEMENT\n");


        // 1. %[datatype-specifier]  &  2. %[.precision]

        String name = "Patrick";
        char c = 'P';
        int age = 5;
        double height = 60.5;
        boolean isStupid = true;

        System.out.printf("hello!! %s\n",name);
        System.out.printf("your name starts with a '%c'\n",c);
        System.out.printf("your age is still %d\n",age);
        System.out.printf("your are %.1f inches tall\n",height);
        System.out.printf("%s is Stupid : %b\n\n",name,isStupid);

        System.out.printf("%s's name starts with %c.\nhe is %d year old and his height is %.1f inches.\nIt is %b that %s is Stupid.\n\n",name,c,age,height,isStupid,name);



        // 2. %[flags]

        double price1 = 999999.0;
        double price2 = 1432.0;
        double price3 = 32341.0;
        double price4 = -33.0;

        // '+' -> output a plus after positive num
        System.out.printf("%+.2f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);
        System.out.printf("%+.2f\n\n", price4);
        
        // ',' -> comma grouping separator after 3 - digits
        System.out.printf("%,.2f\n", price1);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%,.2f\n", price3);
        System.out.printf("%,.2f\n\n", price4);
        
        // '(' -> negative num are enclosed in ()
        System.out.printf("%(.2f\n", price3);
        System.out.printf("%(.2f\n\n", price4);
        
        // ' ' (space) -> display a minus if negative, space if positive
        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);
        System.out.printf("% .2f\n\n", price4);



        // 3. %[widht] 

        int id1 = 1;
        int id2 = 23;
        int id3 = 234;
        int id4 = 2345;
        int id5 = 23456;

        // '0'  ->  zero padding
        System.out.printf("%05d\n", id1);
        System.out.printf("%05d\n", id2);
        System.out.printf("%05d\n", id3);
        System.out.printf("%05d\n", id4);
        System.out.printf("%05d\n\n", id5);
        
        // positive num -> right justified padding
        System.out.printf("%5d\n", id1);
        System.out.printf("%5d\n", id2);
        System.out.printf("%5d\n", id3);
        System.out.printf("%5d\n", id4);
        System.out.printf("%5d\n\n", id5);
        
        // negative num -> left justified padding
        System.out.printf("%-5d\n", id1);
        System.out.printf("%-5d\n", id2);
        System.out.printf("%-5d\n", id3);
        System.out.printf("%-5d\n", id4);
        System.out.printf("%-5d\n\n", id5);
    }
}
