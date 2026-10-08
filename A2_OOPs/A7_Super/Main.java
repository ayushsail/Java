/*
============================= SUPER =============================

Definition:
- "super" refers to the immediate parent class (subclass <- superclass)
Used inside a subclass's constructor to access parent class members.
- calls the parent constructor to initialized attriubtes.
- Used in method overriding

---------------------------------------------------------------
USES OF super
---------------------------------------------------------------

1. CALL PARENT CONSTRUCTOR

super(arguments);

- Must be the first statement in a subclass constructor.
- Used to initialize parent-class attributes.

Example:

class Device {
    String brand;

    Device(String brand) {
        this.brand = brand;
    }
}

class Phone extends Device {
    Phone(String brand) {
        super(brand);
    }
}

---------------------------------------------------------------
2. ACCESS PARENT VARIABLE

super.variable;

- Used when parent and child have variables with the same name.

Example:

class Parent {
    int value = 10;
}

class Child extends Parent {
    int value = 20;

    void show() {
        System.out.println(super.value);  // Parent value
    }
}

---------------------------------------------------------------
3. CALL PARENT METHOD

super.method();

- Used to call the parent version of a method,
  especially when the method is overridden.

Example:

class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        super.move();              // Parent method
        System.out.println("Car moves");
    }
}

---------------------------------------------------------------
IMPORTANT
---------------------------------------------------------------

- super refers to the immediate parent class.
- super() calls the parent constructor.
- super.variable accesses a parent variable.
- super.method() calls a parent method.
- super() must be the first statement in a constructor.

===============================================================
*/

package A2_OOPs.A7_Super;

public class Main {
    public static void main(String[] args) {
        System.out.println("SUPER CLASS & SUB CLASS");

        Person person = new Person("Ayush","Sail");
        System.out.println("\nName of Person : "+person.ShowName());


        Student stud = new Student("Rohan", "Vyas", 9.8);
        System.out.println("\nName of Student : "+stud.ShowName());
        System.out.println("GPA of Student : "+stud.showGPA());


        Employee emp = new Employee("Varun", "Prabhu", 96000);
        System.out.println("\nName of Employee : "+emp.ShowName());
        System.out.println("Salary of Employee : "+emp.showSalary());



    }
}
