import java.util.Scanner;

public class A5_conditional_statement {
    public static void main(String[] args) {
        System.out.println("CONDITIONAL STATEMENT\n");
        Scanner s = new Scanner(System.in);
        double age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name : ");
        name = s.nextLine();
        
        
        // Name Validation
        while (name.isEmpty()) {
            System.out.println("You haven't entered you name!!!, Enter you name to move forward.");
            System.out.print("Enter your name : ");
            name = s.nextLine();
        }
        System.out.println("Helloo!!! " + name);


        System.out.print("Enter your age : ");
        age = s.nextDouble();
        
        System.out.print("Are you a Student (true/false) : ");
        isStudent = s.nextBoolean();


        // Age Criteria
        if (age < 0) {
            System.out.println("You haven't born yet!!");
        }
        else if (age == 0) {
            System.out.println("Congratulations!! It's your first day on Earth.");
        }
        else if (age >= 1 && age <= 4) {
            System.out.println("You are a baby.");
        }
        else if (age >= 5 && age <= 12) {
            System.out.println("You are a child.");
        }
        else if (age >= 13 && age <= 18) {
            System.out.println("You are a teen.");
        }
        else if (age >=19 && age <=45) {
            System.out.println("You are a uncle!!!");
        }
        else if (age >=46 && age <=65) {
            System.out.println("You are getting old!!!");
        }
        else if (age >=66 && age <=85) {
            System.out.println("OH!!! too old.");
        }
        else if (age >=84 && age <=140) {
            System.out.println("Damm!!!");
        }


        // Student Validation
        if (isStudent) {
            System.out.println("You are Student.");
        }
        else {
            System.out.println("You are NOT a Student.");
        }


        s.close();
    }
}
