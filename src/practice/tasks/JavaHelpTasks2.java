package practice.tasks;

public class JavaHelpTasks2 {

    public static void main(String[] args) {

        //====================task2.1==============================
        double number = 0.1;
        System.out.println(isInteger(number));
        //=========================================================
    }

    //====================task2.1==============================
    private static String isInteger(double number) {
        return number + (number % 1 == 0 ? " - it is integer" : " - it is not integer");
    }
    //=========================================================

    //====================task2.2==============================

    //=========================================================
}
