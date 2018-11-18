package project2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Util {

    static boolean isItQuestion(String message) {
        Pattern pattern = Pattern.compile("[А-я]+\\s?\\?");
        Matcher matcher = pattern.matcher(message);
        return matcher.matches();
    }
}
