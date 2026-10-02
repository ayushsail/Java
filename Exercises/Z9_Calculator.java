package Exercises;
import java.util.Scanner;
public class Z9_Calculator {
    public static void main(String[] args) {
        System.out.println("CALCULATOR\n");
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the expression : ");
        String expression = s.nextLine();
        
        expression = expression.trim();         // trim unwanted spaces
        String[] separate = expression.split("\\s+");         // separate when white space/tab occurs
        
        double a = Double.parseDouble(separate[0]);
        String op = separate[1];
        double b = Double.parseDouble(separate[2]);

        switch (op) {
            case "+" -> System.out.printf("%.2f %s %.2f = %.2f",a,op,b,a+b);
            case "-" -> System.out.printf("%.2f %s %.2f = %.2f",a,op,b,a-b);
            case "*" -> System.out.printf("%.2f %s %.2f = %.2f",a,op,b,a*b);
            case "/" -> System.out.printf("%.2f %s %.2f = %.2f",a,op,b,a/b);
            case "%" -> System.out.printf("%.2f %s %.2f = %.2f",a,op,b,a%b);
            default -> System.out.println("Invalid Input");
        }

       s.close();
    }
}
