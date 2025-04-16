import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // Pickup date
        System.out.println("Rental Pickup day: mm/dd/yy");
        String pickup = myScanner.next();
        // Rental days
        System.out.println("Rental days: ");
        int days = myScanner.nextInt();
        // Toll Tag
        System.out.println("Toll tag?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int tollTag = myScanner.nextInt();
        // GPS
        System.out.println("GPS?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int gps = myScanner.nextInt();
        // Roadside Assistance
        System.out.println("Roadside Assistance?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int RA = myScanner.nextInt();
        // age
        System.out.println("age: ");
        int age = myScanner.nextInt();
        // Variables
        float DC = 29.99F;
        float UC = 0.70F;
        float TT = 3.95F;
        float GPSS = 2.95F;
        float RAA = 3.95F;
        // formulas
        float days_charge = days * DC;
        float underage_charge = days_charge * UC;
        float toll = days * TT;
        float GPS = days * GPSS;
        float ra = days * RAA;
        // Basic car rental Charge
        System.out.printf("Your basic car rental fee is $%.2f%n", days_charge);
        System.out.println("-------------------------------------------------------------");
        // if statements
        if (tollTag == 1) {
            System.out.printf("The Toll Tag fee for your rental is: $%.2f%n", toll);
        } else {
            toll = 0;
        }
        System.out.println("-------------------------------------------------------------");
        if (age < 25) {
            System.out.printf("The Underage surcharge for your rental is: $%.2f%n", underage_charge);
        } else {
            underage_charge = 0;
        }
        System.out.println("-------------------------------------------------------------");
        if (RA == 1) {
            System.out.printf("The Roadside Assistance fee for your rental is: $%.2f%n", ra);
        } else {
            ra = 0;
        }
        System.out.println("-------------------------------------------------------------");
        if (gps == 1) {
            System.out.printf("The GPS fee for your rental is: $%.2f%n", GPS);
        } else {
            GPS = 0;
        }
        System.out.println("-------------------------------------------------------------");
        // total cost
        float total_cost = days_charge + toll + underage_charge + ra + GPS;
            System.out.printf("The total cost is: $%.2f%n",  total_cost);
    }
}
