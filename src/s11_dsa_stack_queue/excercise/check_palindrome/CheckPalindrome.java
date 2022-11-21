package excercise.check_palindrome;

import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        boolean isPalindrome = true;

        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] strings = string.toLowerCase().split("");
        for (String s : strings) {
            stack.push(s);
            queue.add(s);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            if (!Objects.equals(stack.pop(), queue.poll())){
                System.out.println("false");
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println(string + " is Palindrome");
        } else {
            System.out.println(string + " is NOT Palindrome");
        }
    }
}
