package OOPs.A9_ToString;

public class Car {
    
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    // Overriding toString method

    @Override 
    public String toString() {
        return "A " + this.color + " " + this.make + " " + this.model + " " + this.year + ". ";
    }


}
