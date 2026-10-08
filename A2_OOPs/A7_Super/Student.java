package A2_OOPs.A7_Super;

// SUB CLASS OF PERSON
public class Student extends Person{
    
    double gpa;

    Student(String first, String last, double gpa) {
        super(first, last);
        this.gpa = gpa;
    }

    double showGPA () {
        return this.gpa;
    }
}
