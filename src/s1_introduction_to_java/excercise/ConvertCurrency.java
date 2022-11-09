package s1_introduction_to_java.excercise;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        double vnd;
        double usd;
        final int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = scanner.nextInt();
        vnd = usd * rate;
        System.out.println("VND = " + vnd) ;
    }
}
