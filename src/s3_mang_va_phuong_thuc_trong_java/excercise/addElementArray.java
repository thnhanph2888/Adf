package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class addElementArray {
    public static void main(String[] args) {
        int[] arrayInteger = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter the number to insert: ");
        Scanner sc = new Scanner(System.in);
        int element = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the position insert: ");
        int index = Integer.parseInt(sc.nextLine());
        int size = arrayInteger.length;
        if (index <= - 1 || index >= arrayInteger.length - 1){
            System.out.println("Element cannot be inserted at this position of the array!");
        } else {
            for (int i = size - 1; i >= index; i--){
                if (i == index){
                    arrayInteger[i] = element;
                } else {
                    arrayInteger[i] = arrayInteger[i - 1];
                }
            }
        }
        System.out.println("Array: " + Arrays.toString(arrayInteger));
    }
}
