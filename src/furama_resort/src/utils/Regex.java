package src.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String CODE_VILLA_REGEX = "^SVVL-\\d{4}$";
    public static final String CODE_ROOM_REGEX = "^SVRO-\\d{4}$";
    public static final String NAME_REGEX = "[A-Z][a-z]+";
    public static final String AREA_AND_SIZE_SWIMMING_POOL_REGEX = "[3-9][0-9]";
    public static final String PRICE_REGEX = "[0-9]+";
    public static final String CAPACITY_REGEX = "[1][0-9]|[0][1-9]";
    public static final String NUMBER_OF_FLOOR_REGEX = "[0-9]+";
    public static final String RENTAL_TYPE_REGEX = "[A-Z][a-z]+";
    public static final String Birth_DAY_REGEX = "^\\d{2}/\\d{2}/\\d{4}$";


    public static boolean checkInput(String regex,String data) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }
}
