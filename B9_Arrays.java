/*
Array - collection of values of the same data type.
*/

import java.util.Arrays;
import java.util.Scanner;

public class B9_Arrays {
    public static void main(String[] args) {
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





        s.close();
    }
    
}
