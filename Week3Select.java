import java.util.Scanner;

public class Week3Select {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Farmers' Market - Sale Category");
        System.out.print("Enter product name : ");
        String name = sc.nextLine();

        System.out.print("Enter unit (kg / piece / litre) : ");
        String unit = sc.nextLine();

        System.out.print("Enter unit price : ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity sold : ");
        int qty = sc.nextInt();

        // validation
        if (price <= 0 || qty <= 0) {
            System.out.println("Invalid price or quantity. Sale cancelled.");
            sc.close();
            return;
        }

        double revenue = price * qty;

        // if-else-if ladder : sale size
        String size;
        if (qty <= 2) {
            size = "SMALL";
        } else if (qty <= 10) {
            size = "MEDIUM";
        } else {
            size = "BULK";
        }

        // switch on unit
        String unitLabel;
        switch (unit.toLowerCase()) {
            case "kg":
                unitLabel = "sold by weight";
                break;
            case "piece":
                unitLabel = "sold by count";
                break;
            case "litre":
                unitLabel = "sold by volume";
                break;
            default:
                unitLabel = "custom unit";
        }

        String level = (revenue >= 1000) ? "HIGH SALE" : "NORMAL SALE";

        System.out.println();
        System.out.println("----------- SALE SLIP -----------");
        System.out.println("Product   : " + name);
        System.out.println("Unit      : " + unit + " (" + unitLabel + ")");
        System.out.println("Price     : " + price);
        System.out.println("Qty       : " + qty + "  [" + size + "]");
        System.out.println("Revenue   : " + revenue + "  [" + level + "]");
        System.out.println("---------------------------------");

        sc.close();
    }
}

