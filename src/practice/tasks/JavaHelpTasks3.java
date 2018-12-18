package practice.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaHelpTasks3 {

    public static void main(String[] args) {
        //========================3.1.==============================
//        System.out.println(integerToArray(523));
        //==========================================================
        //========================3.2.==============================
        bigPrintNumber(101001);
        //==========================================================
    }

    private static List<Integer> integerToArray(int number) {

        List<Integer> list = new ArrayList<>();
        String num = String.valueOf(number);
        if (num.length() < 2) {
            System.out.println(number + " - one rank. For array need more then one rank!");
            return null;
        }
        Pattern compile = Pattern.compile("\\d");
        Matcher matcher = compile.matcher(num);
        while (matcher.find()) {
            String group = matcher.group();
            Integer integer = Integer.valueOf(group);
            list.add(integer);
        }
        return list;
    }

    private static void bigPrintNumber(int number) {
        List<Integer> integers = integerToArray(number);
        int sizeList = integers.size();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < sizeList; j++) {
                System.out.println(BigPrintNambers.numbers[i][j]);
            }
        }

    }
}
