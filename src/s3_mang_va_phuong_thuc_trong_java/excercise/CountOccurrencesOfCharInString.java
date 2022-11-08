package excercise;

import java.util.Scanner;

public class CountOccurrencesOfCharInString {
    public static void main(String[] args) {
        String str = "abcabcc";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character to count");
        char character = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (character == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Count = " + count);
    }
}
