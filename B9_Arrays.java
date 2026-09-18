/*
=========================== ARRAYS ===========================

Definition:
- collection of values of the same data type.
- Fixed size once created.
- Index starts from 0.

--------------------------------------------------------------
CREATING AN ARRAY
--------------------------------------------------------------

String[] fruits = {"apple", "orange", "banana"};
String[] foods;         // empty array
String[] foods = new String[5];     // empty array of size 5

Access:
fruits[0]          -> first element
fruits.length      -> number of elements

Update:
fruits[0] = "mango";

--------------------------------------------------------------
LOOPING THROUGH ARRAY
--------------------------------------------------------------

for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}

Enhanced for-loop:
for (String fruit : fruits) {
    System.out.println(fruit);
}

--------------------------------------------------------------
ARRAYS CLASS
--------------------------------------------------------------

import java.util.Arrays;

Arrays.sort(array);              // Sorts array
Arrays.fill(array, value);       // Fills all elements

--------------------------------------------------------------
USER INPUT
--------------------------------------------------------------

int size = s.nextInt();
s.nextLine();                    // consume leftover \n

String[] foods = new String[size];

for (int i = 0; i < foods.length; i++) {
    foods[i] = s.nextLine();
}

--------------------------------------------------------------
SEARCHING AN ARRAY
--------------------------------------------------------------

- Use a loop to compare each element with the target.
- Use .equals() when comparing Strings.

if (array[i].equals(target)) {
    // found
}

--------------------------------------------------------------
IMPORTANT
--------------------------------------------------------------

- Arrays store same data type.
- Array size is fixed.
- Index starts at 0.
- Last index = length - 1.
- Arrays store primitive values or references to objects.

==============================================================
*/

import java.util.Arrays;
import java.util.Scanner;

public class B9_Arrays {
    public static void main(String[] args) {
        // ARRAYS - BASICS
        System.out.println("ARRAYS - BASICS\n");

        String[] fruits = {"apple", "orange", "pineapple", "banana"};

        System.out.println("reference of array fruits is " +fruits);        // gives reference/address of the array 
        System.out.println("element at index 2 is " +fruits[2]);            // Accessing elements in Array
        System.out.println("Length of array fruits is " +fruits.length);    // Length of Array

        // changing values at given index
        fruits[0] = "mango";
        System.out.println("apple replace with " +fruits[0]);


        // print all the elements of an array
        System.out.println("\nAll elements of array fruits : ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf(fruits[i] + "  ");
        }
        
        // Enhanced for-loop (for-each loop)
        System.out.println("\n\nAll elements of array fruits (enhanced for-loop) : ");
        // for fruit in fruits, print fruit
        for (String fruit : fruits) {
            System.out.print(fruit + "  ");
        }
        

        // Sorting Array - using class Arrays
        Arrays.sort(fruits);
    
        System.out.println("\n\nAfter Sorting : ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf(fruits[i] + "  ");
        }
        
        // Filling Array - using class Arrays
        Arrays.fill(fruits,"Watermelon");
    
        System.out.println("\n\nAfter Filling with Watermelon : ");
        for (int i = 0; i < fruits.length; i++) {
            System.out.printf(fruits[i] + "  ");
        }



        // USER INPUT IN ARRAY
        System.out.println("\n\n\nUSER INPUT IN ARRAY\n");
        Scanner s = new Scanner(System.in);
        
        int sizeOfArray;    
        String[] foods;     // create an empty array
        
        System.out.printf("Enter the size of Array : ");
        sizeOfArray = s.nextInt();
        s.nextLine();       // consume leftover "\n" in input buffer
        
        // assigning size to array
        foods = new String[sizeOfArray];
        
        // alternate way - creating and assigning in same line
        // String[] foods = new String[SizeOfArray];
        
        
        for (int i = 0; i < foods.length; i++) {
            System.out.printf("Enter food item %d : ",i+1);
            foods[i] = s.nextLine();
        }
        
        System.out.print("Food items : ");
        for (String food : foods) {
            System.out.print(food + " ");
        }
        

        
        // SEARCH AN ARRAY
        System.out.println("\n\n\nSEARCH AN ARRAY\n");

        // search int in array
        int[] numbers = {1,9,5,2,6,3};
        int target = 3;
        boolean isFound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (target == numbers[i]) {
                System.out.printf("%d found at index %d\n",target,i);
                isFound = true;
                break;
            }
        }
        if (!isFound) { System.out.printf("%d not present in Array.\n",target); }


        // search String in array
        String[] animals = {"tiger","lion","elephant","owl","eagel"};
        String target1 = "eagel";
        boolean isFound1 = false;

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].equals(target1)) {
                System.out.printf("%s found at index %d\n",target1,i);
                isFound1 = true;
                break;
            }
        }
        if (!isFound1) { System.out.printf("%d not present in Array.\n",target1); }



        s.close();
    }
    
}
