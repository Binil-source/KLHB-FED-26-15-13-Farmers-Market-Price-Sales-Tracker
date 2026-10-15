
import java.util.Scanner;

public class Module3MarketProductSearch {

    static int searchProduct(String[] names, String target) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] products = {
            "Tomato", "Potato", "Onion", "Carrot"
        };

        System.out.print("Enter product to search: ");
        String target = sc.nextLine();

        int index = searchProduct(products, target);

        if (index == -1) {
            System.out.println("Product not found.");
        } else {
            System.out.println("Found at array index: " + index);
        }

        sc.close();
    }
}
