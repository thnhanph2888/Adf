package s2_vong_lap_trong_java.practice;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập số nguyên b: ");
        int b = Integer.parseInt(sc.nextLine());
        while (a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println("Ước chung " + "lớn nhất của: " + a + " và " + b + " là: " + a);
    }
}
