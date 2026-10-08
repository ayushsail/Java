package A2_OOPs.A7_Super;

// MAIN CLASS - SUPER
public class Person {
    
    String first;
    String last;

    Person  (String first, String last) {
        this.first = first;
        this.last = last;
    }

    String ShowName () {
        return this.first + " " + this.last;
    }
    
}
