package OOPs.A1_Object;

public class Car {
    String make = "FORD";
    String model = "Mustang";
    int year = 1996;
    double price = 58000.98;
    boolean isRunning = false;

    // Start method
    void start() {
        System.out.println("You started the Engine");
        isRunning = true;
    }
    
    // Stop method
    void stop() {
        System.out.println("You stopped the Engine");
        isRunning = false;
    }

    // Drive method
    void drive() {
        System.out.println("You are drive the "+model);
    }

    // Brake method
    void brake() {
        System.out.println("You brake the "+model);
    }
}
