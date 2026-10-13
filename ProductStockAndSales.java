import java.util.Scanner;

public class ProductStockAndSales {

    static double calculateTotal(double price, double quantity) {
        return price * quantity;
    }

    // Method overloading
    static double calculateTotal(double price, double quantity,
                                 double discountPercent) {
        double total = price * quantity;
        return total - total * discountPercent / 100;
    }

    // Recursion
    static int sumStock(int[] stock, int index) {
        if (index == stock.length) {
            return 0;
        }
        return stock[index] + sumStock(stock, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {"Tomato", "Potato", "Onion"};
        double[] prices = new double[3];
        int[] stock = new int[3];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter price per kg for "
                    + products[i] + ": ");
            prices[i] = sc.nextDouble();

            System.out.print("Enter stock (kg) for "
                    + products[i] + ": ");
            stock[i] = sc.nextInt();
        }

        System.out.println("\n--- PRODUCT LIST ---");
        double priceSum = 0;

        for (int i = 0; i < products.length; i++) {
            System.out.printf("%s | Rs. %.2f/kg | Stock: %d kg%n",
                    products[i], prices[i], stock[i]);
            priceSum += prices[i];
        }

        System.out.println("Total stock: " + sumStock(stock, 0));
        System.out.printf("Average price: Rs. %.2f%n",
                priceSum / prices.length);

        System.out.print("Enter quantity of Tomato sold: ");
        double quantity = sc.nextDouble();

        double total = calculateTotal(prices[0], quantity);
        double discountedTotal =
                calculateTotal(prices[0], quantity, 10);

        System.out.printf("Sale total: Rs. %.2f%n", total);
        System.out.printf("Sale total after 10%% discount: Rs. %.2f%n",
                discountedTotal);

        sc.close();
    }
}