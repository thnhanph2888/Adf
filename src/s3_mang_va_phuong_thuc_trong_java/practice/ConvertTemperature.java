package practice;

import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu. ");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice!");
            choice = Integer.parseInt(sc.nextLine());
            if (choice == 1){
                System.out.println("Enter Fahrenheit: ");
                fahrenheit = Double.parseDouble(sc.nextLine());
                System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
            } else if (choice == 2) {
                System.out.println("Enter Celsius: ");
                celsius = Double.parseDouble(sc.nextLine());
                System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
            } else {
                System.exit(0);
            }
        } while (choice != 0);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
