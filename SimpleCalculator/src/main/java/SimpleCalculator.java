import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        //Greet User
        System.out.println("Welcome");

        //Ask user for first number
        System.out.println("What would you like the first number to be?");
        int num1 = myScanner.nextInt();


        //Ask user for second number
        System.out.println("What would you like the second number to be?");
        int num2 = myScanner.nextInt();

        //Do the math
        int sum = num1 + num2;

        //Display sum to user
        System.out.println("The sum is: " + sum);





    }

    // Separate method for addition

    public static int addNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static int multiplyNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static int subtractNumbers(int num1, int num2){
        return num1 + num2;
    }

}