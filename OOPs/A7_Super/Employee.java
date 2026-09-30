package OOPs.A7_Super;

// SUB CLASS OF PERSON
public class Employee extends Person {
    
    int salary;

    Employee (String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    int showSalary () {
        return this.salary;
    }
}
