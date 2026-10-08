package A2_OOPs.B6_Aggregation;

// Independent class Book
public class Book {
    
    String title;
    int pages;

    Book (String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    void displayInfo () {
        System.out.printf("%s (%d pages)\n",this.title, this.pages);
    }
}
