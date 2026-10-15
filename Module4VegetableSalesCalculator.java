
import java.util.Scanner;

interface Sellable {
    double calculateAmount(double quantity);
}

class Vegetable implements Sellable {
    private String name;
    private double pricePerKg;

    public Vegetable(String name, double pricePerKg) {
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    @Override
    public double calculateAmount(double quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero.");
        }
        return pricePerKg * quantity;
    }

    public String getName() {
        return name;
    }
}

public class Module4VegetableSalesCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vegetable vegetable = new Vegetable("Potato", 30.0);

        try {
            System.out.print("Enter potato quantity in kg: ");
            double quantity = Double.parseDouble(sc.nextLine());

            System.out.printf("%s total: Rs. %.2f%n",
                    vegetable.getName(),
                    vegetable.calculateAmount(quantity));

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Calculation finished.");
            sc.close();
        }
    }
}
