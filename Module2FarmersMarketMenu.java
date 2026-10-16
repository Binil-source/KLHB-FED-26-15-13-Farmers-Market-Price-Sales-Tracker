import java.util.Scanner;

public class FarmersMarketMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("\n--- FARMERS MARKET MENU ---");
            System.out.println("1. Check stock status");
            System.out.println("2. Calculate sale amount");
            System.out.println("3. Show price table");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter stock quantity (kg): ");
                    int stock = sc.nextInt();

                    if (stock <= 0) {
                        System.out.println("Out of stock");
                    } else if (stock < 10) {
                        System.out.println("Low stock");
                    } else {
                        System.out.println("Stock available");
                    }
                    break;

                case 2:
                    System.out.print("Enter price per kg: ");
                    double price = sc.nextDouble();

                    System.out.print("Enter quantity sold: ");
                    double quantity = sc.nextDouble();

                    if (price > 0 && quantity > 0) {
                        double total = price * quantity;

                        if (total >= 1000) {
                            total = total * 0.95;
                            System.out.println("5% bulk discount applied.");
                        }

                        System.out.printf("Total amount: Rs. %.2f%n", total);
                    } else {
                        System.out.println(
                                "Price and quantity must be positive.");
                    }
                    break;

                case 3:
                    System.out.print("Enter price per kg: ");
                    double tablePrice = sc.nextDouble();

                    for (int kg = 1; kg <= 5; kg++) {
                        System.out.printf("%d kg = Rs. %.2f%n",
                                kg, kg * tablePrice);
                    }
                    break;

                case 0:
                    System.out.println("Exiting menu.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}
