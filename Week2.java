import java.util.Scanner;
 class Week2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Farmers' Market - One Sale Receipt");
        System.out.print("Enter product name : ");
        String name = sc.nextLine();

        System.out.print("Enter unit (kg/piece/litre) : ");
        String unit = sc.nextLine();

        System.out.print("Enter unit price : ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity sold : ");
        int qty = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter short note (or press Enter) : ");
        String notes = sc.nextLine();

        // use double so 10/20 style integer division does not hide the money
        double revenue = price * qty;

        System.out.println();
        System.out.println("----------- SALE RECEIPT -----------");
        System.out.println("Product : " + name);
        System.out.println("Unit    : " + unit);
        System.out.println("Price   : " + price);
        System.out.println("Qty     : " + qty);
        System.out.println("Notes   : " + notes);
        System.out.println("Revenue : " + revenue);
        System.out.println("------------------------------------");

        sc.close();
    }
}

