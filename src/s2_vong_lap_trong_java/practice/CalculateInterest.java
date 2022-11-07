package s2_vong_lap_trong_java.practice;

import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        int money = Integer.parseInt(sc.nextLine());
        System.out.println("Enter number of months: ");
        int month = Integer.parseInt(sc.nextLine());
        System.out.println("Enter annual interest rate in percentage(%): ");
        double interestRate = Double.parseDouble(sc.nextLine());
        double totalInterest = 0;
        totalInterest += money * ((interestRate/100)/12 * month);
        System.out.println("Total of interest: " + totalInterest);
    }
}
