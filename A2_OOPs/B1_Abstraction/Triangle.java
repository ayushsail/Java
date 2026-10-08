package A2_OOPs.B1_Abstraction;

public class Triangle extends Shape {

    double height;
    double base;

    Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override 
    double area() {
        return 0.5*height*base;
    }
    
}
