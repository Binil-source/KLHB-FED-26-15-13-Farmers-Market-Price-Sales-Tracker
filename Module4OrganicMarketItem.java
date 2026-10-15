
class MarketItem {
    protected String name;
    protected double price;

    public MarketItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void display() {
        System.out.println(name + " costs Rs. " + price + " per kg");
    }
}

class OrganicItem extends MarketItem {
    private boolean certifiedOrganic;

    public OrganicItem(String name, double price,
                       boolean certifiedOrganic) {
        super(name, price);
        this.certifiedOrganic = certifiedOrganic;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Certified organic: " + certifiedOrganic);
    }
}

public class Module4OrganicMarketItem {
    public static void main(String[] args) {
        MarketItem item = new OrganicItem("Tomato", 45.0, true);
        item.display();
    }
}
