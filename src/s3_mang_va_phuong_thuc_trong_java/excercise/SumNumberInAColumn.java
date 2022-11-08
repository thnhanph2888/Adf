package excercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumNumberInAColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int row = Integer.parseInt(sc.nextLine());
        System.out.println("Enter column");
        int column = Integer.parseInt(sc.nextLine());
        int[][] arrayNum = new int[row][column];
        int i, j;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                System.out.println("Enter number [" + i + "][" + j + "]");
                arrayNum[i][j] = Integer.parseInt(sc.nextLine());
            }
        }
        int columnSum = 0;
        int sum = 0;
        do {
            System.out.println("Enter column you want to sum");
            columnSum = Integer.parseInt(sc.nextLine());

            if (columnSum > column || columnSum < 1) {
                System.out.println("column is not exist. Please choice 1 to " + column);
            } else {
                for (i = 0; i < row; i++) {
                    sum += arrayNum[i][columnSum - 1];
                }
            }
        } while (columnSum > column || columnSum < 1);

        System.out.println("Array is" + Arrays.deepToString(arrayNum));
        System.out.println("Sum of element in column" + columnSum + " is: " + sum);
    }
}
