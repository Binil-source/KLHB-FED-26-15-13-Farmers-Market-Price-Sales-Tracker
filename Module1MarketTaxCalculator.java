
import java.util.Scanner;

public class Module1MarketTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.05;

        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter number of units: ");
        int units = sc.nextInt();

        double subtotal = price * units;
        double tax = subtotal * GST_RATE;
        double bill = subtotal + tax;

        System.out.printf("Subtotal: Rs. %.2f%n", subtotal);
        System.out.printf("Estimated 5%% tax: Rs. %.2f%n", tax);
        System.out.printf("Final bill: Rs. %.2f%n", bill);

        System.out.println("Valid price and quantity: "
                + (price > 0 && units > 0));

        sc.close();
    }
}
