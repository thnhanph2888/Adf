package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class deleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayInteger = {10,2,3,4,5,6,2,3,9,10};
        System.out.println("Enter the element you want to delete: ");
        int element = Integer.parseInt(sc.nextLine());
        boolean isExist = false;
        int index = 0;
        String indexDelete = "";
        for (int i = 0; i < arrayInteger.length; i++){
            if (element == arrayInteger[i]){
                isExist = true;
                index = i;
                for (int j = index; j < arrayInteger.length - 1; j++){
                    arrayInteger[j] = arrayInteger[j+1];
                }
                indexDelete += " " + i;
            }
        }
        if (isExist){
            System.out.println("Deleted element have position: " + indexDelete);
            System.out.println("Array after delete: " + Arrays.toString(arrayInteger));
        } else {
            System.out.println("Element " + element + " not found!");
        }
    }
}
