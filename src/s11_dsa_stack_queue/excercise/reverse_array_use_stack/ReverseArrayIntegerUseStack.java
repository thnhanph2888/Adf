package excercise.reverse_array_use_stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayIntegerUseStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int[] arrayInteger = new int[Integer.parseInt(sc.nextLine())];
        int size = arrayInteger.length;
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = Integer.parseInt(sc.nextLine());
        }
        Stack<Integer> stack = new Stack<>();
        for (int j : arrayInteger) {
            stack.push(j);
        }
        System.out.println("Before reverse: " + Arrays.toString(arrayInteger));
        for (int i = 0; i < arrayInteger.length; i++){
            arrayInteger[i] = stack.pop();
        }
        System.out.println("After reverse: " + Arrays.toString(arrayInteger));
    }

}
