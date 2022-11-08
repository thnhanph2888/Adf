package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size array 1: ");
        int size1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter size array 2: ");
        int size2 = Integer.parseInt(sc.nextLine());
        int i;
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        for (i = 0; i < size1; i++) {
            System.out.println("Enter element " + i + " of array1");
            array1[i] = Integer.parseInt(sc.nextLine());
        }

        for (i = 0; i < size2; i++) {
            System.out.println("Enter element " + i + " of array2 ");
            array2[i] = Integer.parseInt(sc.nextLine());
        }
        int size3 = size1 + size2;
        int[] arrayMerge = new int[size3];
        for (i = 0 ; i < size3; i++){
            if (i < size1){
                arrayMerge[i] = array1[i];
            } else {
                arrayMerge[i] = array2[i - size1];
            }
        }
        System.out.println("array1: " + Arrays.toString(array1));
        System.out.println("array2: " + Arrays.toString(array2));
        System.out.println("array after merge: " + Arrays.toString(arrayMerge));
    }
}
