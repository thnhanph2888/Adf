package excercise.use_class_illegaltrianglexception;

import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao canh thu nhat a: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao canh thu hai b: ");
        int b = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao canh thu ba c: ");
        int c = Integer.parseInt(sc.nextLine());
        try {
            checkTriangle(a,b,c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
    }

    public static void  checkTriangle(int a, int b , int c) throws IllegalTriangleException {
        boolean inputFalse = a < 0 || b < 0 || c < 0;
        boolean checkSide = a + b < c || a + c < b || b + c < a;
        if (inputFalse || checkSide){
          throw new IllegalTriangleException("Triangle violet the rule. ");
        } else {
            System.out.println("That is triangle");
        }
    }
}
