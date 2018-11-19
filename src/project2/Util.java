package project2;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Util {


    static boolean isItQuestion(String message) {
        Pattern pattern = Pattern.compile("\\?");
        Matcher matcher = pattern.matcher(message);
        return matcher.find();
    }


    static String parseMessage(Message message) {
        String file = "";
        String path = getDirectory(Util.class);
        if ((message.getName()).equals("question")) {
            file = "ansver_question.txt";
        }
        String txt = getTxt(file, path);
        String replace = txt.replace('=', '\n');
        String[] split = replace.split("\n");

        //============test split
//        for (String s : split) {
//            System.out.println(s);
//        }
        //============

        //============problem place
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < split.length - 1; i++) {
            map.put(split[i], split[i + 1]);
            i++;
        }
        //============

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String ansver = "пока нет реакции =(";
        String value = message.getValue().toLowerCase();
        Pattern pattern;
        Matcher matcher;
        while (iterator.hasNext()) {
            String key = iterator.next().getKey();
            pattern = Pattern.compile(key);
            matcher = pattern.matcher(value);
            if (matcher.find()) {
                ansver = map.get(key);
                break;
            }
        }
        return ansver;
    }

    private static String getTxt(String file, String path) {
        StringBuilder txt = new StringBuilder();
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(path.concat(file)))
        ) {
            while (reader.ready()) {
                txt.append(reader.readLine()).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return txt.toString();
    }

    private static String getDirectory(Class<?> clss) {
        StringBuilder path = new StringBuilder();
        String dir = clss.getName().replace(".", File.separator).replace(clss.getSimpleName(), "");
        path.append(System.getProperty("user.dir")).append(File.separator);
        path.append("src").append(File.separator).append(dir);
        return path.toString();
    }
}
