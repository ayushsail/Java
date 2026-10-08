/*
===================== OVERLOADED CONSTRUCTORS =====================

Definition:
- Constructor overloading = multiple constructors in the same class.
- Each constructor has a different parameter list.
- Allows objects to be initialized in different ways.

Example:

class Book {

    String title;
    double price;
    String author;

    Book() {
        title = "Unknown";
        price = 0;
        author = "Unknown";
    }

    Book(String title) {
        this.title = title;
        price = 0;
        author = "Unknown";
    }

    Book(String title, double price) {
        this.title = title;
        this.price = price;
        author = "Unknown";
    }

    Book(String title, double price, String author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }
}

--------------------------------------------------------------
IMPORTANT
--------------------------------------------------------------

- Constructors must have the same class name.
- Parameter lists must differ in number, type, or order.
- Return type is NOT used for overloading.
- Java automatically selects the matching constructor
  based on the arguments passed to "new".

Example:
new Book();                    → 0-parameter constructor
new Book("Java");              → 1-parameter constructor
new Book("Java", 499.0);       → 2-parameter constructor

- Constructor overloading provides flexibility when creating
  objects with different amounts of information.

===============================================================
*/

package A2_OOPs.A3_OverloadedConstructors;

public class Main {
    public static void main(String[] args) {
        System.out.println("OVERLOADED CONSTRUCTORS\n");

        User user1 = new User();
        User user2 = new User("SpongeBob");
        User user3 = new User("Patrick","patrickstar@gmail.com");
        User user4 = new User("Squidward", "squidwardtentacle@gmail.com",34);
        

        printDetails(user1.username, user1.email, user1.age);
        printDetails(user2.username, user2.email, user2.age);
        printDetails(user3.username, user3.email, user3.age);
        printDetails(user4.username, user4.email, user4.age);

    }

    static void printDetails(String username, String email, int age) {
        System.out.println("Username : "+username);
        System.out.println("Email : "+email);
        System.out.println("Age : "+age);
        System.out.println();
    }

}
