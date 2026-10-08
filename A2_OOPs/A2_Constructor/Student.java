package A2_OOPs.A2_Constructor;

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
    // "this" refers to whichever object is currently called.
    // for example, for objects named "stud1","stud2".
    // So "this" refers to "stud1", when "stud1" is called.
    // Student(String name, int roll, double gpa) {
    //     stud1.name = name;
    //     stud1.roll = roll;
    //     stud1.gpa = gpa;
    //     stud1.isStudying = true;
    // }
    // similarly for all objects



    void isStudying() {
        if (this.isStudying) { System.out.println(this.name+ " is Studying"); }
        else { System.out.println(this.name+ " is NOT Studying"); }
    }
}

