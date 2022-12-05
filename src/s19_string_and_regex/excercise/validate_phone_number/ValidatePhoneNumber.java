package excercise.validate_phone_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER_REGEX = "^[(]\\d{2}[)]-[(]0\\d{9}[)]";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phoneNumber = sc.nextLine();
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean isPhoneNumber = matcher.matches();
        System.out.println(phoneNumber + " is phone number:" + isPhoneNumber);
    }
}
