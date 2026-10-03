/*
======================= GETTERS & SETTERS =======================

Definition:
- Getters and setters are methods used to control access to
  an object's private data.
- they help protect object data.
- add rule for accessing or modifying them.

GETTER - Method that make a field READABLE.

SETTER - Method that make a field WRITEABLE.

Why use Getters & Setters?
- Keep fields private.
- Prevent direct access to object data.
- Add validation rules before modifying data.
- Control which fields can be read or modified.
- Support ENCAPSULATION.

Example:

class BankAccount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }
}

Usage:

BankAccount account = new BankAccount();

account.setBalance(5000);
System.out.println(account.getBalance());

---------------------------------------------------------------

READ-ONLY FIELD:
- Provide a getter but no setter.
- The value can be read but cannot be changed directly.

Example:
private final String accountNumber;

public String getAccountNumber() {
    return accountNumber;
}

WRITE-ONLY FIELD:
- A setter can be provided without a getter.
- Less common and used only when the value should not be read back.

---------------------------------------------------------------

IMPORTANT:
- Fields should generally be private when using encapsulation.
- Getter usually starts with "get".
- Setter usually starts with "set".
- Boolean getters commonly use "is".
- Setters are useful for validation.
- A final field cannot be reassigned after initialization.

===============================================================
*/

package OOPs.B5_GetterSetter;

public class Main {
    public static void main(String[] args) {
        System.out.println("GETTER & SETTER METHODS\n");

        Car car = new Car("Charger", "Yellow", 10000);

        // Since to keep the data safe and do not allow direct access,
        // we keep the variable private using "private" keyword.
        // So that we cannot access them directly and change them.
        /*
        car.model = "Supra"             // not allowed
        car.price = 1                   // not allowed
        System.out.println(car.model)   // not allowed
        */


        // Inorder to access private data/variables, we use getter or setter methods
        System.out.printf("A %s %s %s\n",car.getColor(),car.getModel(),car.getPrice());
        
        
        // Changing color & price
        car.setColor("Red");
        car.setPrice(8000);
        
        System.out.printf("A %s %s %s\n",car.getColor(),car.getModel(),car.getPrice());
    }
}
