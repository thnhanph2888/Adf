package s2_vong_lap_trong_java.practice;

import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class DesignMenu {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        int i, j, k;
        switch (choice){
            case 1:
                for ( i = 0; i < 5; i++){
                     for ( j = 0; j < 5 - i; j++){
                         System.out.print(" ");
                     }
                     for (k = 0; k <= i*2; k++){
                         System.out.print("*");
                     }
                    System.out.println("");
                }
                break;
            case 2:
                for (i = 0; i < 5; i++){
                    for (j = 0; j < 5; j++){
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;
            case 3:
                for (i = 0; i < 5; i++){
                    for (j = 0; j < 10; j++){
                        System.out.print("*   ");
                    }
                    System.out.println("");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}
