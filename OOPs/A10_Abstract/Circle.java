package OOPs.A10_Abstract;

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
