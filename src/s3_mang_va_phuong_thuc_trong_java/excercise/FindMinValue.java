package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array: ");
        int size = Integer.parseInt(sc.nextLine());
        int[] array = new int[size];
        int i;
        for (i = 0; i < size; i ++){
            System.out.println("Enter element " + i + ": ");
            array[i] = Integer.parseInt(sc.nextLine());
        }
        int min = array[0];
        for (i = 0; i < size; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        String indexMin = "";
        for (i = 0; i < size; i++){
            if (min == array[i]){
                indexMin +=  i +" ";
            }
        }
        System.out.println("array is: " + Arrays.toString(array));
        System.out.println("Min value is: " + min);
        System.out.println("Position min value is: " + indexMin);
    }
}
