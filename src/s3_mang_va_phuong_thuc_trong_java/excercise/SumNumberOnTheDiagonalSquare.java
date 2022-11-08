package excercise;

import java.util.Scanner;

public class SumNumberOnTheDiagonalSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of matrix square: ");
        int side = Integer.parseInt(sc.nextLine());
        int i, j;
        int sum = 0;
        int[][] array = new int[side][side];
        for (i = 0; i < side; i++){
            for (j = 0; j < side; j++){
                System.out.println("Enter number [" + i + "][" + j + "]");
                array[i][j] = Integer.parseInt(sc.nextLine());
            }
        }

        for (i = 0; i < side; i++){
          sum += array[i][i];
        }
        for (i = 0; i < side; i++){
            for (j = 0; j < side; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Sum of number on the diagonal of a square matrix is: " + sum);
    }
}
