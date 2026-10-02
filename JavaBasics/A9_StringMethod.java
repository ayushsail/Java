/*
===================== STRING METHODS =====================

Definition:- String methods are built-in methods used to manipulate
             and perform operations on Strings.

----------------------------------------------------------
Common String Methods


length()              -> Returns string length.
charAt(index)         -> Returns character at index.
indexOf(value)        -> First occurrence index.
lastIndexOf(value)    -> Last occurrence index.
substring(start,end)  -> Extracts part of a string.
toUpperCase()         -> Converts to uppercase.
toLowerCase()         -> Converts to lowercase.
replace(old,new)      -> Replaces characters/text.
isEmpty()             -> Checks if string is empty.
contains(text)        -> Checks if text exists.
equals(str)           -> Case-sensitive comparison.
equalsIgnoreCase(str) -> Ignores letter case.
trim()                -> Removes leading/trailing spaces.
concat(str)           -> Joins two strings.

----------------------------------------------------------
Important Notes:
- Strings are immutable (cannot be modified).
- Most methods return a NEW String.
- Index starts from 0.

==========================================================
*/
package JavaBasics;

public class A9_StringMethod {
    public static void main(String[] args) {
        System.out.println("STRING METHODS\n");
        String name = "Ayush G sail";
        System.out.printf("String : %s\n\n",name);


        // lenght method
        System.out.printf("lenght of String : %d\n\n",name.length());

        // IndexOf method
        System.out.printf("Index of char 'G' : %d\n",name.indexOf("G"));
        System.out.printf("Index of char ' ' : %d\n\n",name.indexOf(" "));

        // CharAt method
        System.out.printf("Char present at index 6 : %c\n",name.charAt(6));
        System.out.printf("Char present at index 5 : %c\n\n",name.charAt(5));

        // LastIndexOf method
        System.out.printf("Last Index of 's' : %d\n\n",name.lastIndexOf("s"));

        // toUpperCase method
        System.out.printf("Upper Case string : %s\n",name.toUpperCase());

        // toLowerCase method
        System.out.printf("Lower Case string : %s\n\n",name.toLowerCase());

        // replace method
        System.out.printf("replace 's' with 'O' : %s\n\n",name.replace('s', 'O'));

        // isEmpty method
        System.out.printf("isEmpty : %b\n\n",name.isEmpty());

        // contains method
        System.out.printf("does String contains 'O' : %b\n",name.contains("O"));
        System.out.printf("does String contains 's' : %b\n",name.contains("s"));
        System.out.printf("does String contains ' ' : %b\n\n",name.contains(" "));

        // equals method
        System.out.printf("is your string equal to 'Joginder' : %b\n",name.equals("Joginder"));
        System.out.printf("is your string equal to 'Ayush G sail' : %b\n\n",name.equals("Ayush G sail"));
        
        // equalsIgnoreCase method
        System.out.printf("is your string equal(ignore case) to 'AYUSH G SAIL' : %b\n",name.equalsIgnoreCase("AYUSH G SAIL"));
        System.out.printf("is your string equal(ignore case) to 'AyUsH g SaIl' : %b\n\n",name.equalsIgnoreCase("AyUsH g SaIl"));
        
        // trim method
        String newname = "      Welcome!!  Good morning!!      ";
        System.out.printf("Trim unwanted space : %s\n\n",newname.trim());

        // concatenate
        System.out.printf("Concatination : %s\n",name.concat(newname));

    }
}
