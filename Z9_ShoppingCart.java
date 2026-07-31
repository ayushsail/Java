import java.util.Scanner;

public class Z9_ShoppingCart {
    public static void main(String[] args) {
        System.out.println("SHOPPING CART\n");
        Scanner s = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy? : ");
        item = s.nextLine();

        System.out.print("what is the price of each : ");
        price = s.nextDouble();

        System.out.print("How many would you like to buy : ");
        quantity = s.nextInt();

        total = quantity * price;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s" );
        System.out.println("Your total is " + currency + total);

        s.close();
    }
}
