package practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountStudentPassed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int size = Integer.parseInt(sc.nextLine());
        int[] arrayScore = new int[size];
        int i;
        for (i = 0; i < size; i++){
            System.out.println("Enter score " + i + ": ");
            arrayScore[i] = Integer.parseInt(sc.nextLine());
        }
        int count = 0;
        for (i = 0; i < size; i++){
            if (arrayScore[i] >= 5 && arrayScore[i] <= 10){
                count++;
            }
        }
        System.out.println("List score: " + Arrays.toString(arrayScore));
        System.out.println("The nummber of students passed the exam is: " + count);
    }
}
