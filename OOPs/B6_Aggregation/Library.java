package OOPs.B6_Aggregation;

// Class Library
public class Library {
    
    String name;
    int year;

    // Library class uses Array of object Book class
    Book[] books;
    // So Library class "has-a" relation between Book object as a part of its structure.

    Library (String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo () {
        System.out.printf("The %d %s\n", this.year, this.name);
        System.out.println("Books Available : ");
        for (Book book : books) {
            book.displayInfo();
        }
    }
}
