package practice.tasks;

import java.util.Arrays;
import java.util.Scanner;

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
        while (!(input = scanner.nextLine()).equals(letter)) {
            counter++;
        }
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

    //task 6
    private static char randomLetterForGame() {
        char letter = 'A';
        int num = (int) (Math.random() * 26);
        return (char) (letter + num);
    }

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
