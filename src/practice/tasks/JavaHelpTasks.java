package practice.tasks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaHelpTasks {

    //java-help.ru tasks
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //=========task3====================
//        double[] array = {1, 2, 3, 4, 7, 8, 9, 5, 1};
//        increaseElementInsideArray(array, 2, 10);
        //==================================

        //=========task4====================
//        String text = "Смотри, какие лапки грязные, — бяка! " +
//                "Ну конечно, этот нехороший стульчик, это он, бяка, " +
//                "сделал Вовочке бо-бо! Существуют, видите ли, такие " +
//                "законодательные понятия, как аффилированность, " +
//                "крупные, заинтересованные сделки, — словом, всякая бяка.";
//        censure(text);
        //==================================

        //=========task5====================
//        distanceToLightningStrike(7.2);
        //==================================

        //=========task6====================
        System.out.println("Welcome to the simple game!\n" +
                "Guess the letter in fewer steps.\n" +
                "What letter did the computer pick?");
        String letter = String.valueOf(randomLetterForGame());
        String input;
        int counter = 0;
        while (!(input = scanner.nextLine()).equalsIgnoreCase("end")) {
            counter++;
            if (!testOnChar(input)) {
                System.out.println("Incorrect expression: " + input + ".\n" +
                        "Enter only A-Z letter!\n" +
                        "Try again:");
            } else if (findMatch(input, letter)) {
                break;
            }
        }
        if (input.equalsIgnoreCase("end"))
            System.out.println("Thank you for game!\nLucky next time!");
        else
            System.out.println("Congratulations, you guessed it in " + counter + " steps.");
        //==================================
    }

    //task 3
    private static void increaseElementInsideArray(double[] array, int element, int percent) {
        double[] copyArray = Arrays.copyOf(array, array.length);
        copyArray[element] += copyArray[element] * percent / 100;
        printArray(array);
        printArray(copyArray);
    }

    //task 4
    private static void censure(String text) {
        String result = text.replaceAll("бяка", "[ВЫРЕЗАНО ЦЕНЗУРОЙ]");
        System.out.println(result);
    }

    //task 5
    private static void distanceToLightningStrike(double interval) {
        System.out.println("Distance to lightning strike: " + interval * 1100 + " pounds.");
    }

    //====================task 6 start===============================
    private static char randomLetterForGame() {
        char letter = 'A';
        int num = (int) (Math.random() * 26);
        return (char) (letter + num);
    }

    private static boolean testOnChar(String input) {
        char[] chars = input.trim().toUpperCase().toCharArray();
        char[] alphabet = new char[26];
        char letter = 'A';
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char) (letter + i);
            if (chars[0] == alphabet[i])
                return true;
        }
        return false;
    }

    private static boolean findMatch(String input, String letter) {
        char[] inputChars = input.trim().toUpperCase().toCharArray();
        char[] pickChars = letter.trim().toUpperCase().toCharArray();
        char inputChar = inputChars[0];
        char pickChar = pickChars[0];
        if (inputChar == pickChar) {
            return true;
        } else if (inputChar > pickChar) {
            System.out.println("You’re too high.");
        } else {
            System.out.println("You’re too low.");
        }
        return false;
    }
    //====================task 6 end=================================

    //print any arrays
    private static void printArray(double[] array) {
        String separator = "";
        System.out.print("{");
        for (double element : array) {
            System.out.print(separator + element);
            separator = ", ";
        }
        System.out.println("}");
    }
}
