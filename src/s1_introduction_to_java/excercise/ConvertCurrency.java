package s1_introduction_to_java.excercise;

import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args) {
        int vnd;
        int usd;
        final int rate = 23000;
        System.out.println("Nhập VND: ");
        Scanner scanner = new Scanner(System.in);
        vnd = scanner.nextInt();
        usd = vnd / rate;
        System.out.println("USD = " + usd + "\n Nhập USD" );
        usd = scanner.nextInt();
        vnd = usd * rate;
        System.out.println("VND = " + vnd) ;
    }
}
