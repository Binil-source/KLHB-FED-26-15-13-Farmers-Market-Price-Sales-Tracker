import java.util.Scanner;

public class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double MARKET_FEE_RATE = 0.02;

        System.out.print("Enter product name: ");
        String productName = sc.nextLine();

        System.out.print("Enter price per kg (Rs.): ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity available (kg): ");
        int quantity = sc.nextInt();

        double stockValue = price * quantity;
        double marketFee = stockValue * MARKET_FEE_RATE;

        System.out.println("\n--- FARMERS MARKET TRACKER ---");
        System.out.printf("Product: %s%n", productName);
        System.out.printf("Price per kg: Rs. %.2f%n", price);
        System.out.printf("Quantity: %d kg%n", quantity);
        System.out.printf("Stock value: Rs. %.2f%n", stockValue);
        System.out.printf("Estimated market fee (2%%): Rs. %.2f%n",
                marketFee);

        int wholePrice = (int) price;
        System.out.println("Price converted to int: " + wholePrice);
        System.out.println("Quantity is positive: " + (quantity > 0));

        sc.close();
    }
}
