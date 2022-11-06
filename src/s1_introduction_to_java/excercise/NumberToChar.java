package s1_introduction_to_java.excercise;

import java.util.Scanner;

public class NumberToChar {
    public static void main(String[] args) {
        int hundreds = 0, tens = 0, ones = 0;
        String strHundreds = "", strTens = "", strOnes = "";
        System.out.println("Số cần đọc là: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 10 && number > 0) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nice");
                    break;
            }
        } else if (number < 20) {
            number = number - 10;
            switch (number) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        } else if (number < 100) {
            tens = number / 10;
            ones = number % 10;
            switch (tens) {
                case 2:
                    strTens = "twenty";
                    break;
                case 3:
                    strTens = "thirty";
                    break;
                case 4:
                    strTens = "forty";
                    break;
                case 5:
                    strTens = "fifty";
                    break;
                case 6:
                    strTens = "sixty";
                    break;
                case 7:
                    strTens = "seventy";
                    break;
                case 8:
                    strTens = "eighty";
                    break;
                case 9:
                    strTens = "ninety";
                    break;
            }
            switch (ones) {
                case 1:
                    strOnes = " one";
                    break;
                case 2:
                    strOnes = " two";
                    break;
                case 3:
                    strOnes = " three";
                    break;
                case 4:
                    strOnes = " four";
                    break;
                case 5:
                    strOnes = " five";
                    break;
                case 6:
                    strOnes = " six";
                    break;
                case 7:
                    strOnes = " seven";
                    break;
                case 8:
                    strOnes = " eight";
                    break;
                case 9:
                    strOnes = " nine";
                    break;
            }
            System.out.printf(strTens + strOnes);
        } else if (number < 1000) {
            hundreds = number / 100;
            tens = (number - (hundreds * 100)) / 10;
            ones = (number - (hundreds * 100)) % 10;
            switch (hundreds) {

                case 1:
                    strHundreds = "One";
                    break;
                 case 2:
                    strHundreds = "two";
                    break;
                 case 3:
                    strHundreds = "three";
                    break;
                 case 4:
                    strHundreds = "four";
                    break;
                 case 5:
                    strHundreds = "five";
                    break;
                 case 6:
                    strHundreds = "six";
                    break;
                 case 7:
                    strHundreds = "seven";
                    break;
                 case 8:
                    strHundreds = "eight";
                    break;
                 case 9:
                    strHundreds = "nine";
                    break;
            }
            switch (ones) {
                case 1:
                    strOnes = " one ";
                    break;
                case 2:
                    strOnes = " two";
                    break;
                case 3:
                    strOnes = " three";
                    break;
                case 4:
                    strOnes = " four";
                    break;
                case 5:
                    strOnes = " five";
                    break;
                case 6:
                    strOnes = " six";
                    break;
                case 7:
                    strOnes = " seven";
                    break;
                case 8:
                    strOnes = " eight";
                    break;
                case 9:
                    strOnes = " nine";
                    break;
            }

            switch (tens) {
                case 0:
                    strTens = "";
                    break;
                case 1:
                    strTens = "ten";
                    break;
                case 2:
                    strTens = "twenty";
                    break;
                case 3:
                    strTens = "thirty";
                    break;
                case 4:
                    strTens = "forty";
                    break;
                case 5:
                    strTens = "fifty";
                    break;
                case 6:
                    strTens = "sixty";
                    break;
                case 7:
                    strTens = "seventy";
                    break;
                case 8:
                    strTens = "eighty";
                    break;
                case 9:
                    strTens = "ninety";
                    break;
            }

            System.out.println(strHundreds + " hundreds and " + strTens + strOnes );
        }
    }
}
