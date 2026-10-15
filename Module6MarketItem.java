import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class MarketItem {
    private String name;
    private String category;
    private double price;
    private int stock;

    public MarketItem(String name, String category,
                      double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }
}

public class Module6 {
    public static void main(String[] args) {
        List<MarketItem> items = new ArrayList<>();

        items.add(new MarketItem("Tomato", "Vegetable", 35, 20));
        items.add(new MarketItem("Potato", "Vegetable", 30, 25));
        items.add(new MarketItem("Apple", "Fruit", 100, 15));
        items.add(new MarketItem("Banana", "Fruit", 60, 30));
        items.add(new MarketItem("Onion", "Vegetable", 58, 20));

        Set<String> categories = new HashSet<>();

        for (MarketItem item : items) {
            categories.add(item.getCategory());
        }

        System.out.println("Categories: " + categories);

        Map<String, Double> priceMap = new HashMap<>();

        for (MarketItem item : items) {
            priceMap.put(item.getName(), item.getPrice());
        }

        System.out.println("Tomato price: Rs. " + priceMap.get("Tomato"));

        items.sort(Comparator.comparing(MarketItem::getName));

        System.out.println("\nProducts sorted by name:");
        items.forEach(item -> System.out.println(item.getName()));

        List<String> available = items.stream()
                .filter(item -> item.getStock() > 0)
                .map(MarketItem::getName)
                .collect(Collectors.toList());

        System.out.println("\nAvailable products: " + available);

        double averagePrice = items.stream()
                .mapToDouble(MarketItem::getPrice)
                .average()
                .orElse(0.0);

        System.out.printf("Average price: Rs. %.2f%n", averagePrice);

        Map<String, Long> countByCategory = items.stream()
                .collect(Collectors.groupingBy(
                        MarketItem::getCategory,
                        Collectors.counting()));

        System.out.println("Count by category: " + countByCategory);

        int totalStock = items.stream()
                .mapToInt(MarketItem::getStock)
                .sum();

        System.out.println("Total stock: " + totalStock + " kg");
    }
}
