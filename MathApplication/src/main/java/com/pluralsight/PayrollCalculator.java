package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        // Name
        System.out.println("Name: ");
        String name = myScanner.nextLine();

        // Hours Worked
        System.out.println("Hours worked?: ");
        float hours = myScanner.nextFloat();

        // Pay Rate
        System.out.println("Pay Rate?: ");
        float pay = myScanner.nextFloat();

        float grossPay = hours * pay;

        System.out.println("The gross pay for " + name + " is: " + "$" + grossPay);



    }
}
