package A2_OOPs.B2_Interfaces;

// Fish can act as both Prey and Predator.
// It implements multiple interfaces, 
// providing multiple-inheritance-like behavior.
public class Fish implements Prey, Predator{
    @Override 
    public void flee () {
        System.out.println("*The Fish is running away*");
    }

    @Override 
    public void hunt() {
        System.out.println("*The Fish is hunting*");
    }
}
