/*
========================== CONSTRUCTOR ==========================

Definition:
- Constructor = special member used to initialize an object.
- It is automatically called when an object is created.
- Used to assign initial values to object attributes.
- Can accept parameters.

Syntax:
ClassName(parameters) {
    // initialize attributes
}

Example:
public class Student {
    
    String name;
    int roll;
    double gpa;
    boolean isStudying;

    // Constructor
    Student(String name, int roll, double gpa, boolean isStudying) {
        this.name = name;
        this.roll = roll;
        this.gpa = gpa;
        this.isStudying = isStudying;
    }
}

Object creation:
Student stud1 = new Student("Ayush", 19, 8.7);

---------------------------------------------------------------
THIS KEYWORD
---------------------------------------------------------------

- "this" refers to the current object.
- Used to distinguish instance variables from parameters
  when they have the same name.

Example:
this.name = name;

- this.name → object's instance variable
- name     → constructor parameter

---------------------------------------------------------------
IMPORTANT
---------------------------------------------------------------

- Constructor name must be the same as the class name.
- Constructor has NO return type, not even void.
- Called automatically when using "new".
- Constructors can be overloaded.
- If no constructor is written, Java provides a default
  no-argument constructor.

===============================================================
*/

package OOPs.A2_Constructor;

public class Main {
    public static void main(String[] args) {
        System.out.println("CONSTRUCTOR\n");

        Student stud1 = new Student("Ayush Sail", 19, 8.7, true);
        Student stud2 = new Student("Spongebob Squarepants", 20, 8.5, true);
        Student stud3 = new Student("Patrick Seastar", 21, 9.9, false);


        System.out.println(stud1.name+ " has secured " +stud1.gpa+ " gpa and his roll no is " +stud1.roll);
        System.out.println(stud2.name+ " has secured " +stud2.gpa+ " gpa and his roll no is " +stud2.roll);
        System.out.println(stud3.name+ " has secured " +stud3.gpa+ " gpa and his roll no is " +stud3.roll+ "\n");


        stud1.isStudying();
        stud2.isStudying();
        stud3.isStudying();


    }
}
