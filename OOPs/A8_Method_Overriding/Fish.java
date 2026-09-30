package OOPs.A8_Method_Overriding;

// DERIVED CLASS FROM ANIMALS
public class Fish extends Animals {
    

    @Override                   
    String move () {
        return "swimming";
    }

    // Adding Override annotation
    // So that you and another developer know that this method is being overriden
    // It's also provides a system of checks and balances, if you misspell the overriding method
}
