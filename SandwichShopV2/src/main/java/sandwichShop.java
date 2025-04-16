import java.util.Scanner;

public class sandwichShop {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What size sandwich would you like?");
        System.out.println("(1) Regular");
        System.out.println("(2) Large");
        int size = myScanner.nextInt();

        System.out.println("What is your age?");
        int age = myScanner.nextInt();

        System.out.println("Loaded?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");
        int loaded = myScanner.nextInt();

        float regularPrice = 5.45F;
        float largePrice = 8.95F;
        float loadedPrice = 0;

        float basePrice = 0;

        // Determine base price based on size
        if (size == 1) {
            basePrice = regularPrice;
            loadedPrice = 1.00F;
        } else if (size == 2) {
            basePrice = largePrice;
            loadedPrice = 1.75F;
        } else {
            System.out.println("Invalid size selected.");
            return;
        }

        // Apply discount based on age
        if (age <= 17) {
            basePrice *= 0.90; // 10% discount
        } else if (age >= 65) {
            basePrice *= 0.80; // 20% discount
        }

        // Add loaded price if selected
        if (loaded == 1) {
            basePrice += loadedPrice;
        }

        System.out.printf("Total price: $%.2f%n", basePrice);
    }
}
