/*
========================= 2D ARRAYS =========================

Definition:
- A 2D array is an array where each element is another array.
- Used to store data in rows and columns.
- Commonly used for matrices, tables, grids, etc.

Syntax:
dataType[][] array = {
    {value1, value2},
    {value3, value4}
};

Accessing elements:
array[row][column]

Example:
groceries[0][3]    -> row 0, column 3

--------------------------------------------------------------
LOOPING THROUGH 2D ARRAY
--------------------------------------------------------------

for (String[] row : array) {
    for (String item : row) {
        System.out.print(item + " ");
    }
    System.out.println();
}

- Outer loop → rows
- Inner loop → elements/columns

--------------------------------------------------------------
LENGTH
--------------------------------------------------------------

array.length        -> number of rows
array[row].length   -> number of columns in that row

--------------------------------------------------------------
UPDATING ELEMENTS
--------------------------------------------------------------

array[row][column] = newValue;

Example:
groceries[0][3] = "pineapple";

--------------------------------------------------------------
IMPORTANT
--------------------------------------------------------------

- Index starts from 0.
- First index represents the row.
- Second index represents the column.
- Java 2D arrays can have different row lengths
  (jagged arrays).

==============================================================
*/
package A1_JavaBasics;

public class C2_2dArray {
    public static void main(String[] args) {
        System.out.println("2D ARRAYS\n");

        String[] fruits = {"mango", "apple", "banana", "orange"};
        String[] vegitable = {"onion","tomato","potato","carrot"};
        String[] meats = {"chicken","pork","fish","beef"};


        // 2D - Array
        String[][] groceries = {fruits, vegitable, meats};
        
        // Display 2D - Array (using nested enhanced loop)
        System.out.println("Items : ");
        for (String[] items : groceries) {
            for (String item : items) {
                System.out.print(item+ " ");
            }
            System.out.println();
        }
        
        /*
        Alternate Way
        String[][] groceries = {{"mango", "apple", "banana", "orange"},
                                {"onion","tomato","potato","carrot"},
                                {"chicken","pork","fish","beef"}};
        */


        // Lenght of 2d-array 
        System.out.println("\nLenght of 2d-array groceries : " +groceries.length);
        System.out.printf("Lenght of rows in 2d-array : %d, %d, %d\n",groceries[0].length,groceries[1].length,groceries[2].length);
        
        // changing values at given index
        // array[row][column]
        groceries[0][3] = "pineapple";
        System.out.println("\norange replace with pineapple : ");
        for (String[] items : groceries) {
            for (String item : items) {
                System.out.print(item+ " ");
            }
            System.out.println();
        }


        // Telephone number pad 
        char[][] numberPad = {{'1', '2', '3'},
                              {'4', '5', '6'},
                              {'7', '8', '9'},
                              {'*', '0', '#'}};

        System.out.println("\n\nNUMBER PAD : ");
        for (char[] row : numberPad) {
            for (char item : row) {
                System.out.print(item + "  ");
            }
            System.out.println();
        }

    }
}
