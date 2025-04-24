package com.pluralsight;

import java.util.Scanner;

public class payrollCalculator {

    public static void main(String[] args) {

        //create a scanner to collect user input
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your name? ");

        //get the name from the user and store it in the name variable
        String name = myScanner.nextLine();

        //asked the hours worked
        System.out.println("Enter Hours Worked");

        //get the hours worked entered and store it in hoursWorked
        double hoursWorked = myScanner.nextDouble();

        //asked the hours worked
        System.out.println("What is the pay rate? ");

        //get the hours worked entered and store it in hoursWorked
        double payRate = myScanner.nextDouble();

        //calculate the gross pay
        double grossPay = hoursWorked * payRate;

        //output with printf & format specifiers (%s -tring %f -loat)
        //printf to keep decimal place specification and neatness
        System.out.printf("%s made $%.2f in gross pay\n", name, grossPay);

        //output with println
        System.out.println(name + " made $" + grossPay + " in gross pay");

        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * payRate * 1.5;
            grossPay += overtimePay;

            System.out.println("Overtime hours: " + overtimeHours);
            System.out.printf("\nOvertime pay: $%.2f", overtimePay);
            System.out.printf("\nGross with OT pay: $%.2f", grossPay);
        }

        myScanner.close();

    }

}
