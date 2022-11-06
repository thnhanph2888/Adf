package s1_introduction_to_java.practice;

import java.util.Scanner;

public class BmiCacurlator {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Your weight(in kilogram): ");
        weight = sc.nextDouble();
        System.out.println("Your height(in meter6): ");
        height = sc.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18){
            System.out.printf("%-20.2f%s", bmi, "UnderWeight");
        } else if (bmi < 25.0){
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s", bmi, "OverWeight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
