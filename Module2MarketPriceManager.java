
import java.util.Scanner;

public class Module2MarketPriceManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Calculate total");
            System.out.println("2. Check price category");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Price per kg: ");
                    double price = sc.nextDouble();

                    System.out.print("Quantity in kg: ");
                    double qty = sc.nextDouble();

                    if (price > 0 && qty > 0) {
                        System.out.printf("Total: Rs. %.2f%n",
                                price * qty);
                    } else {
                        System.out.println("Enter positive values.");
                    }
                    break;

                case 2:
                    System.out.print("Enter price per kg: ");
                    double p = sc.nextDouble();

                    if (p < 30) {
                        System.out.println("Low price");
                    } else if (p <= 100) {
                        System.out.println("Medium price");
                    } else {
                        System.out.println("High price");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!,Thanks");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        sc.close();
    }
}
