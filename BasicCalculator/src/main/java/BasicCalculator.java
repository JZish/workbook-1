import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Welcome Math Maniac!");

        System.out.println("What is your first number?");
        int num1 = myScanner.nextInt();

        System.out.println("What is your second number?");
        int num2 = myScanner.nextInt();
        // Sum
        int A = num1 + num2;
        // Subtract
        int S = num1 - num2;
        // Divide
        double D = num1 / num2;
        // Multiply
        int M = num1 * num2;

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        char operation = myScanner.next().toUpperCase().charAt(0);

        float result = 0;
        String symbol = "";

        switch (operation) {
            case 'A':
                result = num1 + num2;
                symbol = "+";
                break;
            case 'S':
                result = num1 - num2;
                symbol = "-";
                break;
            case 'M':
                result = num1 * num2;
                symbol = "*";
                break;
            case 'D':
                if (num2 != 0) {
                    result = num1 / num2;
                    symbol = "/";
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    myScanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid option selected.");
                myScanner.close();
                return;
        }

        // Display the result
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);

        myScanner.close();


    }
    
}
