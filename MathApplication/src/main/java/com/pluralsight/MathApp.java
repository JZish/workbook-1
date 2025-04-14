package com.pluralsight;

public class MathApp {
    //main method of where code will run
    //all code will be in this method
    public static void main(String[] args) {

     /*
       Create two variables to represent the salary for Bob and Gary, name them
       bobSalary and garySalary. Create a new variable named
       highestSalary. Determine whose salary is greater using Math.max() and
       store the answer in highestSalary. Set the initial salary variables to any value
       you want. Print the answer (i.e "The highest salary is ...")
     */

        int bobSalary = 78000;
        int garySalary = 125000;

        int highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is " + highestSalary);

        System.out.println("---------------------------------");

        /*
        Find and display the smallest of two variables named carPrice and
        truckPrice. Set the variables to any value you want
        */

        int carPrice = 32000;
        int truckPrice = 44000;

        System.out.println("The lowest price is " + Math.min(carPrice, truckPrice));

        System.out.println("---------------------------------");

        /*
        Find and display the area of a circle whose radius is 7.25
        */
        double radius = 7.25;

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of this circle is " + area);

        System.out.println("---------------------------------");

        /*
        Find and display the square root a variable after it is set to 5.0
        */

        double number = 5.0;

        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of this number is " + squareRoot);

        System.out.println("---------------------------------");


        //Find and display the distance between the points (5, 10) and (85, 50)


        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is: " + distance);

        System.out.println("---------------------------------");


        //Find and display the absolute (positive) value of a variable after it is set to -3.8


        double value = -3.8;

        double absolute = Math.abs(value);

        System.out.println("The absolute value is " + absolute);

        System.out.println("---------------------------------");

        /*
        Find and display a random number between 0 and 1
        */

        System.out.println("The random number is " + Math.random());

        System.out.println("---------------!Finished!------------------");

    }


}
