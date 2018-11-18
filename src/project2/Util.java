package project2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Util {

    static boolean isItQuestion(String message) {
        Pattern pattern = Pattern.compile("\\?");
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }
}
