package practice.tasks;

import java.util.Arrays;

public class JavaHelpTasks {

    //java-help.ru tasks
    public static void main(String[] args) {
        //=========task3====================
//        double[] array = {1, 2, 3, 4, 7, 8, 9, 5, 1};
//        increaseElementInsideArray(array, 2, 10);
        //==================================

        //=========task4====================
        String text = "Смотри, какие лапки грязные, — бяка! " +
                "Ну конечно, этот нехороший стульчик, это он, бяка, " +
                "сделал Вовочке бо-бо! Существуют, видите ли, такие " +
                "законодательные понятия, как аффилированность, " +
                "крупные, заинтересованные сделки, — словом, всякая бяка.";
        censure(text);
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
