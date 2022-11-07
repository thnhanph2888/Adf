package s2_vong_lap_trong_java.practice;

import java.util.Map;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(sc.nextLine());
        if (number < 2){
            System.out.println(number + " is not a prime");
        } else {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is NOT a prime");
            }
        }
    }
}
