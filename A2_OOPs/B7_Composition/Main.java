/*
=========================== COMPOSITION ===========================

Definition:
- Composition represents a strong "HAS-A" or "PART-OF" relationship.
- A complex object is built using smaller objects.
- The contained object is strongly associated with the
  containing object's lifecycle.

Example:
- An Engine is PART-OF a Car.
- A Car HAS-A Engine.

In this example:
- The Engine object is created inside the Car constructor.
- The Car controls the creation of its Engine.

Example:
    this.engine = new Engine(engineType);

IMPORTANT:
- The contained object is strongly owned by the containing object.
- If the Car object becomes unreachable, its Engine can also
  become unreachable if there are no other references to it.
- The Engine is then eligible for garbage collection.

Difference from Aggregation:
- Aggregation → contained object can exist independently.
- Composition → contained object is strongly tied to the owner.

Structure:

    Car
     |
     | PART-OF / HAS-A
     ↓
   Engine

====================================================================
*/

package A2_OOPs.B7_Composition;

public class Main {
    public static void main(String[] args) {
        System.out.println("COMPOSITION\n");

        Car car = new Car("Corvette", 2025, "V8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine);     // returns hashID, engine is object, which is a reference dataType
        System.out.println(car.engine.type);    // returns engineType

        car.start();


        // So this is Composition
        // If the Car object is removed OR become unreachable,
        // that also removes the engine objects, 
        // which become unreachable & eligible for garbage collection.
        // this is major difference between Composition & Aggregation (previous concept)
    }
}
