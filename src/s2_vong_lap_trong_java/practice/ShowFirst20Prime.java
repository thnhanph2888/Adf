package s2_vong_lap_trong_java.practice;

import java.util.Scanner;

public class ShowFirst20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of primes to print");
        int amount = Integer.parseInt(sc.nextLine());
        int count = 0;
        int n = 0;
        boolean flag = true;
        while (count < amount){
           if (n >= 2){
               for (int i = 2; i <= Math.sqrt(n); i++){
                   if (n % i == 0){
                       flag = false;
                       break;
                   }
               }
               if (flag){
                   count++;
                   System.out.println(n);
               }
               flag = true;
           }
           n++;
        }
    }
}
