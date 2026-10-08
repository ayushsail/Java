package A2_OOPs.B7_Composition;

public class Engine {
    
    String type;

    Engine (String type) {
        this.type = type;
    }

    void start () {
        System.out.printf("\n\nThe %s engine is STARTED.\n", this.type);
    }
}
