import java.io.IOException
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class MarketProductSaver {
    String name;
    double price;
    double stock;

    MarketRecord(String name, double price, double stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

public class Module5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<MarketRecord> products = new ArrayList<>();

        System.out.print("Enter product name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter price per kg: ");
        double price = sc.nextDouble();

        System.out.print("Enter stock in kg: ");
        double stock = sc.nextDouble();

        products.add(new MarketRecord(name, price, stock));

        products.sort(Comparator.comparing(
                p -> p.name.toLowerCase()));

        Path path = Path.of("market_products.txt");

        try {
            List<String> lines = new ArrayList<>();

            for (MarketRecord p : products) {
                lines.add(p.name + "," + p.price + "," + p.stock);
            }

            Files.write(path, lines);
            System.out.println("Product saved to " + path);

            System.out.println("\n--- SAVED MARKET RECORDS (SORTED) ---");
            for (String line : Files.readAllLines(path)) {
                String[] parts = line.split(",");
                System.out.println("Product: " + parts[0]
                        + ", Price: Rs. " + parts[1]
                        + ", Stock: " + parts[2] + " kg");
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }

        sc.close();
    }
}
