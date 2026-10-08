package A2_OOPs.B1_Abstraction;

// ABSTRACT CLASS
public abstract class Shape {
    
    // ABSTRACT METHOD
    abstract double area();

    // CONCRETE METHOD
    void display() {
        System.out.printf("This is a shape.");
    }
}

/* 
             Shape (abstract)
             /      |       \
            /       |        \
       Circle    Triangle   Rectangle
*/