package Exercises;
import java.util.Scanner;

public class Z9_Temp_convertor {
    public static void main(String[] args) {
        System.out.println("TEMPERATURE CONVERTOR\n");

        Scanner s = new Scanner(System.in);

        System.out.println("1. Celsius --> Kelvin");
        System.out.println("2. Celsius --> Fahrenheit");
        System.out.println("3. Kelvin --> Celsius");
        System.out.println("4. Kelvin --> Fahrenheit");
        System.out.println("5. Fahrenheit --> Celsius");
        System.out.println("6. Fahrenheit --> Kelvin");

        System.out.print("\nEnter your choice : ");
        int choice = s.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius : ");
            double cel = s.nextDouble();

            double kel = cel + 273.15;
            System.out.printf("Temperature in Kelvin : %.2f K%n", kel);
        }

        else if (choice == 2) {
            System.out.print("Enter temperature in Celsius : ");
            double cel = s.nextDouble();

            double fah = (cel * 9.0 / 5.0) + 32;
            System.out.printf("Temperature in Fahrenheit : %.2f °F%n", fah);
        }

        else if (choice == 3) {
            System.out.print("Enter temperature in Kelvin : ");
            double kel = s.nextDouble();

            double cel = kel - 273.15;
            System.out.printf("Temperature in Celsius : %.2f °C%n", cel);
        }

        else if (choice == 4) {
            System.out.print("Enter temperature in Kelvin : ");
            double kel = s.nextDouble();

            double fah = (kel - 273.15) * 9.0 / 5.0 + 32;
            System.out.printf("Temperature in Fahrenheit : %.2f °F%n", fah);
        }

        else if (choice == 5) {
            System.out.print("Enter temperature in Fahrenheit : ");
            double fah = s.nextDouble();

            double cel = (fah - 32) * 5.0 / 9.0;
            System.out.printf("Temperature in Celsius : %.2f °C%n", cel);
        }

        else if (choice == 6) {
            System.out.print("Enter temperature in Fahrenheit : ");
            double fah = s.nextDouble();

            double kel = (fah - 32) * 5.0 / 9.0 + 273.15;
            System.out.printf("Temperature in Kelvin : %.2f K%n", kel);
        }

        else {
            System.out.println("Invalid Choice!!");
        }

        s.close();
    }
}
