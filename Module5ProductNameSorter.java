
import java.util.Arrays;
import java.util.Scanner;

public class Module5ProductNameSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product names separated by commas: ");
        String line = sc.nextLine().trim();

        String[] names = line.split(",");

        for (int i = 0; i < names.length; i++) {
            names[i] = names[i].trim();
        }

        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Products in sorted order:");

        for (String name : names) {
            if (!name.isEmpty()) {
                System.out.println(name);
            }
        }

        System.out.println("Number of entries: " + names.length);
        sc.close();
    }
}
