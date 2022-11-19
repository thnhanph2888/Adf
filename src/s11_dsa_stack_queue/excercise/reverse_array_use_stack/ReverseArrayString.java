package excercise.reverse_array_use_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseArrayString {

    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi");
        String string = sc.nextLine();
        String[] strings = string.split(" ");
        System.out.println("Chuoi truoc khi dao nguoc la: " + strings);
        int size = strings.length;
        String newString = "";
        for (int i = 0; i < size; i++){
            wStack.push(strings[i]);
        }

        for (int i = 0; i < size; i++) {
            newString += wStack.pop() + " ";
        }
        System.out.println("Chuoi sau khi dao nguoc la: " + newString);
    }

}
