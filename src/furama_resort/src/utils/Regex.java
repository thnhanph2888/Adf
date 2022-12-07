package src.utils;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String CODE_VILLA_REGEX = "^SVVL-\\d{4}$";
    public static final String CODE_ROOM_REGEX = "^SVRO-\\d{4}$";
    public static final String NAME_REGEX = "[A-Z][a-z]+";
    public static final String AREA_AND_SIZE_SWIMMING_POOL_REGEX = "[3-9][0-9]";
    public static final String PRICE_REGEX = "^[0-9]+$";
    public static final String CAPACITY_REGEX = "^1[0-9]|0?[1-9]$";
    public static final String NUMBER_OF_FLOOR_REGEX = "^[0-9]+$";
    public static final String RENTAL_TYPE_REGEX = "[A-Z][a-z]+";
    public static final String BIRTH_DAY_REGEX = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    public static String enterAndCheckBirthDay() {
        Scanner sc = new Scanner(System.in);
        String birthDay;
        System.out.println("Enter birthDay: ");
        do {
            birthDay = sc.nextLine();
                if (checkInput(BIRTH_DAY_REGEX, birthDay)) {
                    LocalDate localDate = LocalDate.now();
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate dayOfBirth = LocalDate.parse(birthDay, dateTimeFormatter);
                    int age = Period.between(dayOfBirth, localDate).getYears();
                    try {
                        if (18 > age || age > 100) {
                            throw new InputBirthDayException("Under 18 year old or over 100 year old");
                        } else {
                            return birthDay;
                        }
                    } catch (InputBirthDayException e) {
                        e.printStackTrace();
                        System.out.println("Please re-enter!");
                    }

                } else {
                    System.err.println("Wrong format! Please re-enter!");
                }
        } while (true);


    }

    public static boolean checkInput(String regex, String data) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }

    public static int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            try {
                number = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number!");
            }
        } while (true);

        return number;
    }
}
