
import java.util.*;
import java.io.*;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return name + " - Price: Rs." + price
                + ", Quantity: " + quantity;
    }
}

public class FarmersMarketTracker {
    static ArrayList<Product> products = new ArrayList<>();
    static double totalSales = 0;

    static void addProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
        System.out.println("Product added successfully!");
    }

    static void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product p : products) {
            System.out.println(p);
        }
    }

    static void sellProduct(String name, int quantity) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                if (p.quantity >= quantity && quantity > 0) {
                    p.quantity -= quantity;
                    double amount = p.price * quantity;
                    totalSales += amount;

                    System.out.println("Sale successful!");
                    System.out.println("Amount: Rs." + amount);
                } else {
                    System.out.println("Insufficient stock or invalid quantity.");
                }
                return;
            }
        }
        System.out.println("Product not found.");
    }

    static void searchProduct(String name) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println(p);
                return;
            }
        }
        System.out.println("Product not found.");
    }

    static void sortProducts() {
        products.sort(Comparator.comparing(p -> p.name.toLowerCase()));
        System.out.println("Products sorted by name.");
    }

    static void saveData() {
        try (PrintWriter writer = new PrintWriter(
                new FileWriter("farmers_market.txt"))) {
            for (Product p : products) {
                writer.println(p.name + "," + p.price + "," + p.quantity);
            }
            writer.println("Total Sales," + totalSales);
            System.out.println("Data saved to farmers_market.txt");
        } catch (IOException e) {
            System.out.println("Error saving data.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Farmers Market Tracker ---");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Sell Product");
            System.out.println("4. Search Product");
            System.out.println("5. Sort Products");
            System.out.println("6. Show Total Sales");
            System.out.println("7. Save Data");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();
                    addProduct(name, price, quantity);
                    break;

                case 2:
                    displayProducts();
                    break;

                case 3:
                    System.out.print("Enter product name: ");
                    String sellName = sc.nextLine();
                    System.out.print("Enter quantity to sell: ");
                    int sellQuantity = sc.nextInt();
                    sc.nextLine();
                    sellProduct(sellName, sellQuantity);
                    break;

                case 4:
                    System.out.print("Enter product name to search: ");
                    searchProduct(sc.nextLine());
                    break;

                case 5:
                    sortProducts();
                    break;

                case 6:
                    System.out.println("Total Sales: Rs." + totalSales);
                    break;

                case 7:
                    saveData();
                    break;

                case 0:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
