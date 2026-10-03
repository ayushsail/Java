/*
=========================== AGGREGATION ===========================

Definition:
- Aggregation represents a "HAS-A" relationship between objects.
- One object contains or uses another object as part of its structure.
- The contained object/s can exist independently.

Example:
- A Library HAS-A collection of Books.
- A Book can exist even without a Library.

Structure:

Library
   |
   | HAS-A
   ↓
 Book[]

IMPORTANT:
- The contained object has an independent lifecycle.
- Aggregation represents a WEAK "has-a" relationship.
- The contained object is usually created outside the containing
  object and then passed to it.

Difference from Composition:
- Aggregation → contained object can exist independently.
- Composition → contained object depends strongly on the owner.

==================================================================
*/

package OOPs.B6_Aggregation;

public class Main {
    public static void main(String[] args) {
        System.out.println("AGGREGATION\n");

        Book[] books = {new Book("The Fellowship of the Ring", 423),
                        new Book("The Two Towers", 352),
                        new Book("The Return of the King", 416)
        };

        // Alternate way : 
        /*
        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);
        Book[] books = {book1, book2, book3}
        */


        Library lib = new Library("NYC Public Library", 1897, books);

        lib.displayInfo();


        // So this is Aggregation
        // If the Library object is removed, the Book objects can still exist independently.
        // this is major difference between Aggregation & Composition (upcoming concept)
    }
}
