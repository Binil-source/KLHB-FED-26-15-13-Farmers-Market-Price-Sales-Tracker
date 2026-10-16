
import java.util.Scanner;

public class Module3MarketSalesAnalyzer {

    static double matrixTotal(double[][] sales) {
        double total = 0;

        for (int row = 0; row < sales.length; row++) {
            for (int col = 0; col < sales[row].length; col++) {
                total += sales[row][col];
            }
        }

        return total;
    }

    static int countSalesAbove(double[][] sales, double limit) {
        int count = 0;

        for (double[] day : sales) {
            for (double amount : day) {
                if (amount > limit) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] sales = new double[2][3];

        System.out.println(
            "Enter sales amounts for 2 days and 3 products per day:"
        );

        for (int r = 0; r < sales.length; r++) {
            for (int c = 0; c < sales[r].length; c++) {
                sales[r][c] = sc.nextDouble();
            }
        }

        System.out.printf("Total sales amount: Rs. %.2f%n",
                matrixTotal(sales));

        System.out.print("Enter amount threshold: ");
        double threshold = sc.nextDouble();

        System.out.println("Number of entries above threshold: "
                + countSalesAbove(sales, threshold));

        sc.close();
    }
}
