package Z1_Exercises;
import java.util.Scanner;
public class Z9_Weight_Converter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("============================ WEIGHT CONVERTER ============================");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Enter choice : ");
        int choice = s.nextInt();
        if (choice == 1) {
                System.out.print("Enter your weight in lbs : ");
                double lbs = s.nextDouble();
                System.out.printf("Weight in kgs : %.3f kilograms",lbs/2.20462);
            }
        else if (choice == 2) {
            System.out.print("Enter your weight in kgs : ");
            double kgs = s.nextDouble();
            System.out.printf("Weight in lbs : %.3f pounds", kgs*2.20462);
        }
        else {
            System.out.println("Invlid Input");
        }

        s.close();

    }
}
