import java.util.Scanner;

public class SandwichShop {

    public static void main(String[] args) {
        // input
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What size sandwich would you like?");
        System.out.println("(1) Regular");
        System.out.println("(2) Large");
        int size = myScanner.nextInt();

        System.out.println("What is your age? ");
        int age = myScanner.nextInt();

        // Sandwich size

        float regular = 5.45F;

        float large = 8.95F;

        // age discount

        if (age <= 17 && size == 1) {
            System.out.printf("%.2f", (regular * 0.90F));
        } else if (age >= 65 && size == 1) {
            System.out.printf("%.2", (regular * 0.80F));
        } else if (age >=18 && age <=64 && size == 1){
            System.out.println(regular);
        }

        if (age <= 17 && size == 2) {
            System.out.printf("%.2f", (large * 0.90F));
        } else if (age >= 65 && size == 2) {
            System.out.printf("%.2f", (large * 0.80F));
        } else if (age >=18 && age <=64 && size == 2 ){
            System.out.println(large);
        }
   }
}






