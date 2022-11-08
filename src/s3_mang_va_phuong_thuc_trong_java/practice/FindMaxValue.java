package practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        int[] arrayNum = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Enter element " + (i + 1) + ": ");
            arrayNum[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Property list: " + Arrays.toString(arrayNum));
        int max = arrayNum[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (max < arrayNum[i]){
                max = arrayNum[i];
                index += i;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
