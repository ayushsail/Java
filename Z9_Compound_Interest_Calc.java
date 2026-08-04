import java.util.Scanner;

public class Z9_Compound_Interest_Calc {
    public static void main(String[] args) {
        System.out.println("COMPOUND INTEREST CALCULATOR\n");

        Scanner s=new Scanner(System.in);

        double principal;
        double rate;
        int timesCompound;
        int years;
        double amount;

        System.out.print("Enter principal value : ");
        principal = s.nextDouble();

        System.out.print("Enter interest rate (in %) : ");
        rate = s.nextDouble() / 100;

        System.out.print("Enter the no. of times compounded per year : ");
        timesCompound = s.nextInt();

        System.out.print("Enter the no. of years : ");
        years = s.nextInt();

        amount = principal*Math.pow(1 + rate / timesCompound, timesCompound * years);

        System.out.printf("The amount after %d years is : $%.2f",years,amount);

        s.close();
    }
}
