/*
=========================== ARRAYLIST ===========================

Definition:
- ArrayList is a resizable array that stores OBJECTS.
- Unlike arrays, its size can grow or shrink dynamically.
- Since ArrayList stores objects, primitive values use
  their corresponding wrapper classes through autoboxing.

Syntax:
ArrayList<wrapper class> list = new ArrayList<>();

Example:
ArrayList<String> cities = new ArrayList<>();

cities.add("Mumbai");
cities.add("Delhi");
cities.add("Pune");

---------------------------------------------------------------

COMMON METHODS:

add(value)
- Adds an element to the end.

add(index, value)
- Adds an element at a specific index.

get(index)
- Returns the element at the given index.

set(index, value)
- Replaces an existing element.

remove(index)
- Removes the element at the given index.

size()
- Returns the number of elements.

contains(value)
- Checks whether an element exists.

clear()
- Removes all elements.

---------------------------------------------------------------

SORTING:

Collections.sort(list);

- Sorts elements in their natural order.
- For example:
    numbers → ascending order
    Strings → alphabetical order

Requires:
import java.util.Collections;

---------------------------------------------------------------

ITERATION:

for (String city : cities) {
    System.out.println(city);
}

- Enhanced for loop can be used to visit each element.

---------------------------------------------------------------

ARRAY vs ARRAYLIST

Array:
- Fixed size
- Can store primitives and objects
- Uses .length

ArrayList:
- Dynamic size
- Stores objects
- Uses .size()
- Provides built-in methods for adding, removing, searching, etc.

IMPORTANT:
- ArrayList index starts from 0.
- ArrayList cannot directly store primitive types.
- Use wrapper classes such as Integer, Double, Character, etc.
- ArrayList is part of the Collections Framework.

===============================================================
*/

package A4_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A1_ArrayList {
    public static void main (String[] args) {
        System.out.println("ARRAY LIST\n");

        // ArrayList<WrapperClass> reference = new ArrayList<>();

        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(3);
        // number.remove(0);            // remove with help of index
        System.out.println("\nArrayList of Integers : " + number);
        System.out.println("Size : " + number.size());
        
        ArrayList<Double> decimals = new ArrayList<>();
        decimals.add(3.14);
        decimals.add(9.99);
        decimals.add(4.62);
        // decimals.remove(0);          // remove with help of index
        System.out.println("\nArrayList of Doubles : " + decimals);
        System.out.println("Size : " + decimals.size());
        
        
        ArrayList<String> fruits = new ArrayList<>();
        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Coconut");
        
        fruits.set(1, "Jackfruit");             // udpate element
        System.out.println("\nArrayList of Strings : " + fruits);
        System.out.println("Size : " + fruits.size());
        System.out.println("Fruit at index 3 : " + fruits.get(3));
        
        
        // Sorting ArrayLists using collections framework
        Collections.sort(number);
        Collections.sort(decimals);
        Collections.sort(fruits);
        
        System.out.println("\n\nAFTER SORTING : ");
        System.out.println("ArrayList of Integers : " + number);
        System.out.println("ArrayList of Doubles : " + decimals);
        System.out.println("ArrayList of Strings : " + fruits);
        

        // Enhanced for loop for iterating throughout the ArrayLists
        for (String fruit : fruits) {
            System.out.println(fruit);
        }        




        // EXCERCISE
        // Accept userinput and store it in ArrayLists
        Scanner s = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        
        System.out.print("Enter number of food items : ");
        int numOfFood = s.nextInt();
        s.nextLine();

        for (int i = 1; i<=numOfFood; i++) {
            System.out.printf("Enter Food Item %d : ",i);
            String food = s.nextLine();
            foods.add(food);
        }
        System.out.println(foods);

        s.close();
    }
}
