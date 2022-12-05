package excercise.validate_name_class;

import java.util.Scanner;

public class ValidateClass {
    private static final String NAME_REGEX = "^[CAP][0-9]{4}[G-M]$";

    public ValidateClass () {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.matches(NAME_REGEX));
    }
}
