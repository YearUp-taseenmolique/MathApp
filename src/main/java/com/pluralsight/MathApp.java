package com.pluralsight;

public class MathApp {
    public static void main(String[] args){

        // Question 1:
        // declare variables here

        int bob_salary = 150000;
        int gary_salary = 200000;

        // then code solution

        int highestSalary = Math.max(bob_salary, gary_salary);


        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The highest salary is " + highestSalary);

        // REPEAT FOR NEXT EXERCISE

        // ------------------------ Question 2

        // declare variables here

        int carPrice = 10000;
        int truckPrice = 15000;

        // then code solution

        int cheapestPrice = Math.min(carPrice, truckPrice);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The cheapest price is " + cheapestPrice);

        // REPEAT FOR NEXT EXERCISE

        // ------------------------ Question 3

        // declare variables here

        double radius_of_circle = 7.25;

        // then code solution

        double area_of_circle = (Math.PI * radius_of_circle * radius_of_circle);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The area of the circle is " + area_of_circle);

        // REPEAT FOR NEXT EXERCISE

        // ------------------- Question 4

        // declare variables here

        double variable = 5.0;

        // then code solution

        double result = Math.sqrt(variable);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The square root is " + result);

        // REPEAT FOR NEXT EXERCISE


        // ------------------- Question 5

        // declare variables here

        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        // then code solution

        double distance = (x2 - x1) + (y2 - y1);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The distance between the two points are " + distance);

        // REPEAT FOR NEXT EXERCISE

        // ------------------- Question 5

        // declare variables here

        double second_variable = -3.8;

        // then code solution

        double absolute_value = Math.abs(second_variable);

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The absolute value is " + absolute_value);

        // REPEAT FOR NEXT EXERCISE

        // ------------------- Question 7

        // declare variables here

        int randomNumber_1 = 0;
        int randomNumber_2 = 1;

        // then code solution

        double randomNumber = (double)(Math.random() * randomNumber_2) + randomNumber_1;

        // then use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

        System.out.println("The random number is " + randomNumber);

        // REPEAT FOR NEXT EXERCISE

        // END
    }
}
