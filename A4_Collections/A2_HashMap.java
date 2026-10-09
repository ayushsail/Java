/*
============================= HASHMAP =============================

Definition:
- HashMap is a data structure that stores data as KEY-VALUE pairs.
- Each key must be unique, but values can be duplicated.
- Does not guarantee any specific iteration order.
- Uses hashing to store and retrieve entries efficiently.

Syntax:
HashMap<KeyType, ValueType> map = new HashMap<>();

Example:
HashMap<String, Integer> scores = new HashMap<>();

----------------------------------------------------------------

COMMON METHODS:

put(key, value)
- Adds a new key-value pair or updates an existing key's value.

get(key)
- Returns the value associated with the given key.
- Returns null if the key is not found (or its value is null).

remove(key)
- Removes the entry associated with the given key.

size()
- Returns the number of key-value pairs.

containsKey(key)
- Checks whether a key exists.

containsValue(value)
- Checks whether a value exists.

isEmpty()
- Checks whether the HashMap contains no entries.

clear()
- Removes all key-value pairs.

getOrDefault(key, defaultValue)
- Returns the value for a key, or a default if the key is absent.

----------------------------------------------------------------

ITERATING THROUGH A HASHMAP:

1. Using keySet():

for (String key : scores.keySet()) {
    System.out.println(key + " : " + scores.get(key));
}

- keySet() returns a set of all keys.

2. Using entrySet():

for (var entry : scores.entrySet()) {
    System.out.println(entry.getKey() + " : " + entry.getValue());
}

- entrySet() provides access to both keys and values.

----------------------------------------------------------------

IMPORTANT:
- Keys are unique; adding an existing key replaces its value.
- Values can be duplicated.
- HashMap allows one null key and multiple null values.
- Average lookup and insertion are typically O(1).
- Iteration order is not guaranteed.
- HashMap is not inherently thread-safe.
- Uses generics to specify key and value types.
- It is part of the Java Collections Framework.

====================================================================
*/

package A4_Collections;

import java.util.HashMap;

public class A2_HashMap {
    public static void main(String[] args) {
        System.out.println("HASHMAP\n");

        HashMap<String,Double> fruitShop = new HashMap<>();

        fruitShop.put("apple",0.50);
        fruitShop.put("orange",0.75);
        fruitShop.put("banana",0.25);
        fruitShop.put("coconut",1.00);

        
        // fruitShop.remove("banana");
        
        System.out.println("Number of items : " +fruitShop.size());
        
        System.out.println("\nPrice of coconut is " +fruitShop.get("coconut"));
        
        System.out.println("\nIs there coconut in the shop : " +fruitShop.containsKey("coconut"));
        System.out.println("Is there pineapple in the shop : " +fruitShop.containsKey("pineapple"));

        System.out.println("\nIs there any item for $1 : " +fruitShop.containsValue(1.00) + "\n\n");
        
        
        System.out.println("Items : ");
        for (String key : fruitShop.keySet()) {
            System.out.println(key + " : $" +fruitShop.get(key));
        }
    }
}
