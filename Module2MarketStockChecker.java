
import java.util.Scanner;

public class Module2MarketStockChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);HI
        int lowStockCount = 0;hi jVA

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter stock for product " + i + " (kg): ");
            int stock = sc.nextInt();

            if (stock < 0) {
                System.out.println("Invalid stock. Skipping.");
                continue;
            }

            if (stock == 0) {
                System.out.println("Out of stock");
                lowStockCount++;
            } else if (stock < 10) {
                System.out.println("Low stock");
                lowStockCount++;
            } else {
                System.out.println("Stock is sufficient");
            }
        }

        System.out.println("Products needing restock: " + lowStockCount);
        sc.close();
    }
}
