package A9_Generics;

// Class with two Generic parameter
public class Product<T,U> {             // using common convention
    T item;
    U price;

    Product (T item, U price) {
        this.item = item;
        this.price = price;
    }


    public T getItem() {
        return this.item;
    }

    public U getPrice() {
        return  this.price;
    }
}
