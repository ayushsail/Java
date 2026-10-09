package A9_Generics;


// Class with one Generic parameter
public class Box<T> {           // using common convention
    
    T item;

    public void setItem (T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
    
}
