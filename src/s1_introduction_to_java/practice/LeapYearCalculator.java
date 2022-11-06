package s1_introduction_to_java.practice;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;
        boolean isLeapYear = false;
        System.out.println("Enter a year: ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (isDivisibleBy4){
            if (isDivisibleBy100) {
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            }else {
                isLeapYear = false;
            }
        }
        if (isLeapYear){
            System.out.printf("%d is a leap year!", year);
        } else{
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
