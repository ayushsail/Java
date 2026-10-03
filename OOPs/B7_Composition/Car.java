package OOPs.B7_Composition;

public class Car {
    
    String model;
    int year;
    Engine engine;

    Car (String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }

    void start () {
        this.engine.start();
        System.out.printf("The %s is RUNNING.\n",this.model);
    }
}
