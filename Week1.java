public class Week1 {
    public class Week1Tracker {
    public static void main(String[] args) {
        // INPUT  (fixed values for week 1 - no Scanner yet)
        String productName = "Tomato";
        String unit = "kg";
        double unitPrice = 40.0;
        int quantity = 5;

        // PROCESS
        double revenue = unitPrice * quantity;

        // OUTPUT
        System.out.println("======================================");
        System.out.println(" Farmers' Market Price & Sales Tracker");
        System.out.println(" Week 1 - First Program");
        System.out.println("======================================");
        System.out.println("Product : " + productName);
        System.out.println("Unit    : " + unit);
        System.out.println("Price   : " + unitPrice);
        System.out.println("Qty     : " + quantity);
        System.out.println("Revenue : " + revenue);
        System.out.println("======================================");

        // Desk-check: 40.0 * 5 = 200.0
    }
}


}
