
import java.util.Scanner;

public class Module1MarketBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = sc.nextLine();

        System.out.print("Enter price per kg: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity bought (kg): ");
        double quantity = sc.nextDouble();

        double total = price * quantity;
        double discount = total >= 500 ? total * 0.10 : 0;
        double finalAmount = total - discount;

        System.out.println("\n--- CUSTOMER BILL ---");
        System.out.println("Product: " + name);
        System.out.printf("Original amount: Rs. %.2f%n", total);
        System.out.printf("Discount: Rs. %.2f%n", discount);
        System.out.printf("Final amount: Rs. %.2f%n", finalAmount);

        sc.close();
    }
}
