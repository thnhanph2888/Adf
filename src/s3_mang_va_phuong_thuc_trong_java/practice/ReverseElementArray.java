package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementArray {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a siza Array: ");
            size = Integer.parseInt(sc.nextLine());
            if (size > 20){
                System.out.println("Size dose not exceed 20");
            }
        } while (size > 20);
        int[] array = new int[size];
        int  i = 0;
        while (i < array.length){
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = Integer.parseInt(sc.nextLine());
            i++;
        }
        System.out.println("Array: " + Arrays.toString(array));
        for (i = 0; i < size/ 2; i++){
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println("Array reversed: " + Arrays.toString(array));
    }
}
