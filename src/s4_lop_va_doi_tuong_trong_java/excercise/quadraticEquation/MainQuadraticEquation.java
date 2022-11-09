package excercise.quadraticEquation;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("QuadraticEquaton: ax2 + bx + x = 0");
        System.out.println("Enter a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Enter b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Enter c: ");
        int c = Integer.parseInt(sc.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta >= 0){
            System.out.println("The equation has two roots: " + quadraticEquation.getRoot1() + " and " + quadraticEquation.getRoot2());
        } else if (delta == 0){
            System.out.println(" The equation has on root: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
