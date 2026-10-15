
import java.util.ArrayList;
import java.util.List;

public class Module6MarketProductManager {
    public static void main(String[] args) {
        List<String> products = new ArrayList<>();

        products.add("Tomato");
        products.add("Potato");
        products.add("Onion");
        products.add("Tomato");

        products.remove("Onion");
        products.sort(String.CASE_INSENSITIVE_ORDER);

        System.out.println("Unique product names:");

        products.stream()
                .distinct()
                .forEach(name -> System.out.println(name));

        System.out.println("Products containing 'to':");

        products.stream()
                .filter(name -> name.toLowerCase().contains("to"))
                .forEach(System.out::println);
    }
}
