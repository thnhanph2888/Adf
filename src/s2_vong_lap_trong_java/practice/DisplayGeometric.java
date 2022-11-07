package s2_vong_lap_trong_java.practice;

import java.util.Scanner;

public class DisplayGeometric {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice!");
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                System.out.println("Enter a length");
                int length = Integer.parseInt(sc.nextLine());
                System.out.println("Enter a width");
                int width = Integer.parseInt(sc.nextLine());
                for (i = 0; i < width; i++){
                    for (j = 0; j < length; j++){
                        System.out.print("*  ");
                    }
                    System.out.println("");
                }
                break;
            case 2:
                while (choice != 5) {

                    System.out.println("1. top-left");
                    System.out.println("2. top-right");
                    System.out.println("3. bottom-left");
                    System.out.println("4. bottom-right");
                    System.out.println("5. Exit");
                    System.out.println("Enter your choice!");

                    choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            for (i = 0; i < 8; i++) {
                                for (j = 0; j < 8 - i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (i = 0; i < 8; i++) {
                                for (j = 0; j < i; j++) {
                                    System.out.print("   ");
                                }
                                for (k = 0; k < 8 - i; k++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (i = 0; i < 8; i++) {
                                for (j = 0; j < i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 4:
                            for (i = 0; i < 8; i++) {
                                for (j = 0; j < 8 - i; j++) {
                                    System.out.print("   ");
                                }
                                for (k = 0; k < i; k++) {
                                    System.out.print(" * ");
                                }
                                System.out.println("");
                            }
                            break;
                    }
                }
                break;
            case 3:
                 for (i = 0; i < 8; i ++){
                     for (j = 0; j < 8 - i; j+=1){
                         System.out.print(" ");
                     }
                     for (k = 0; k <= i * 2 ; k+=1){
                         System.out.print("*");
                     }
                     System.out.println("");
                 }
        }
    }
}
