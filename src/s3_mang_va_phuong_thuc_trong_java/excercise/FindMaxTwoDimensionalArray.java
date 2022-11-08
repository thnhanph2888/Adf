package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length array ");
        int length1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter length element of array");
        int length2 = Integer.parseInt(sc.nextLine());
        int i, j;
        int[][] array = new int[length1][length2];
        String indexMax = "";
        for ( i = 0; i < length1; i++){
            for ( j = 0; j < length2; j++){
                System.out.println("Enter element [" + i +"][" + j + "]" );
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int max = array[0][0];
        for ( i = 0; i < length1; i++){
            for ( j = 0; j < length2; j++){
                if (max < array[i][j]){
                    max = array[i][j];
                }
            }
        }
        for ( i = 0; i < length1; i++){
            for ( j = 0; j < length2; j++){
                if (max == array[i][j]){
                    indexMax += "[" + i +"][" + j + "]  ";
                }
            }
        }
        System.out.println("Array is: " + Arrays.deepToString(array));
        System.out.println("Max is: " + max);
        System.out.println("Position max is: " + indexMax);
    }
}
