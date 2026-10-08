package A2_OOPs.B1_Abstraction;

public class Circle extends Shape {

    double radius;

    Circle(double side) {
        this.radius = side;
    }
    
    @Override 
    double area() {
        return Math.PI*radius*radius;
    }
}
