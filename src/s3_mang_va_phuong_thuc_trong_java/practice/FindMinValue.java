package practice;

import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array = {2,2,5,4,645,32,452,3,5};
        System.out.println("The smallest element is: " + minValue(array));
    }
    public static int minValue(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
