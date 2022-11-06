package s1_introduction_to_java.excercise;

import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args) {
        String yourName;
        System.out.println("Enter your name!");
        Scanner sc = new Scanner(System.in);
        yourName = sc.nextLine();
        System.out.println("Hello: " + yourName);
    }
}
