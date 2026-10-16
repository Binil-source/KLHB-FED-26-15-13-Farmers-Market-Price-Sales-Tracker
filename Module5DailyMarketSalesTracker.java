
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List
import java.util.Scanner;

public class Module5DailyMarketSalesTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Path path = Path.of("daily_market_sales.txt");

        try {
            System.out.print("Enter product name: ");
            String name = sc.nextLine().trim();

            System.out.print("Enter sales amount (Rs.): ");
            double amount = Double.parseDouble(sc.nextLine().trim());

            String record = name + " | Rs. " + amount
                    + System.lineSeparator();

            Files.writeString(path, record,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);

            System.out.println("\nSaved sales records:");
            List<String> lines = Files.readAllLines(path);

            for (String savedLine : lines) {
                System.out.println(savedLine);
            }

        } catch (NumberFormatException e) {
            System.out.println("Sales amount must be a valid number.");
        } catch (IOException e) {
            System.out.println("Could not access the file: "
                    + e.getMessage());
        } finally {
        }
    }
}
