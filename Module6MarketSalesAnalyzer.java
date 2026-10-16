
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ProduceSale {
    private String category;
    private double amount;

    public ProduceSale(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }
}

public class Module6MarketSalesAnalyzer {
    public static void main(String[] args) {
        List<ProduceSale> sales = new ArrayList<>();

        sales.add(new ProduceSale("Vegetables", 350));
        sales.add(new ProduceSale("Fruits", 500));
        sales.add(new ProduceSale("Vegetables", 250));
        sales.add(new ProduceSale("Fruits", 300));

        Map<String, Long> numberByCategory = sales.stream().collect(Collectors.groupingBy(ProduceSale::getCategory,
                        Collectors.counting()));

        Map<String, Double> revenueByCategory = sales.stream()
                .collect(Collectors.groupingBy(
                        ProduceSale::getCategory,
                        Collectors.summingDouble(ProduceSale::getAmount)));

        System.out.println("Number of sales by category: "
                + numberByCategory);
        System.out.println("Revenue by category: "
                + revenueByCategory);

        double total = sales.stream()
                .map(ProduceSale::getAmount)
                .reduce(0.0, Double::sum);

        System.out.printf("Total market revenue: Rs. %.2f%n", total);
    }
}
