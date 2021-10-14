package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
/*
        //1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate");
        double rate = scanner.nextDouble();

        //3. Multiply hours and the pay rate
        double grossPay = hours * rate;

        //4. Display
        System.out.println("The employee's gross pay is $" + grossPay);
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the season of the year?");
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int whole_number = scanner.nextInt();

        System.out.println("Enter an Adjective");
        String adjective = scanner.next();

        System.out.println("On a " + adjective + " "+ season + " day, I drink a minimum of " + whole_number + " cups of coffee");



    }
}
