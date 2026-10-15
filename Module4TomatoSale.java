import java.util.Scanner;

class MarketProduct {
    private String name;
    private double price;
    private double stock;

    public MarketProduct(String name, double price, double stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double sell(double quantity) {
        if (quantity <= 0 || quantity > stock) {
            throw new IllegalArgumentException("Invalid quantity.");
        }

        stock -= quantity;
        return price * quantity;
    }

    public String toString() {
        return name + " | Rs. " + price + "/kg | Stock: " + stock + " kg";
    }
}

public class Module4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MarketProduct product = new MarketProduct("Tomato", 35.0, 50.0);
        System.out.println("Current product: " + product);

        try {
            System.out.print("Enter quantity to sell: ");
            double quantity = Double.parseDouble(sc.nextLine());

            double amount = product.sell(quantity);
            System.out.printf("Sale successful. Amount: Rs. %.2f%n", amount);
            System.out.println("Updated product: " + product);

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sale operation completed.");
            sc.close();
        }
    }
}
