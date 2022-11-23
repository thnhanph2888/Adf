package excercise;

import java.util.Scanner;

public class GiaiThuat {
    static void fibo(int n,int n2,int one, int two){
           int three;
           int count = 2;
           three = two + one;
           if (count <= n){
               fibo(n -1,n2, two, three);
           } else {
               System.out.println("f(" + n2 + ") = " + three);
           }

    }
    public static void main(String[] args) {
        System.out.println("Nhap vao mot so nguyen");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while (n > 20) {
            System.out.println("Vui long nhap lai n <= 20");
            n = Integer.parseInt(sc.nextLine());
        }
        int fibZero = 1;
        int fibOne = 1;
        int fibTwo ;
        int count = 2;
        if (n == 0){
            System.out.println(fibZero);
        } else if (n==1){
            System.out.println(fibOne);
        } else {
            fibo(n,n,fibZero,fibOne);
//            System.out.println(fibo(n,fibZero,fibOne));
//            while (count <= n) {
//                fibTwo = fibOne + fibZero;
//                fibZero = fibOne;
//                fibOne = fibTwo;
//                count++;
//            }
//            System.out.println("f(" + n + ") = " + fibOne);
        }
    }
}
