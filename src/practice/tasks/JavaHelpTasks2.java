package practice.tasks;

public class JavaHelpTasks2 {

    public static void main(String[] args) {

        //====================task1================================
        double number = 5.1;
        System.out.println(isInteger(number));
        //=========================================================
    }

    //====================task1================================
    private static boolean isInteger(double number) {
        return (number > 0 && number % 1 == 0);
    }
    //=========================================================
}
