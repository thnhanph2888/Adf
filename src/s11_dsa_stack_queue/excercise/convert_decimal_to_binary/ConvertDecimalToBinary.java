package excercise.convert_decimal_to_binary;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập dạng thập phân: ");
        Scanner sc = new Scanner(System.in);
        int decimal = Integer.parseInt(sc.nextLine());
       while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }
        System.out.println(stack);
    }
}
