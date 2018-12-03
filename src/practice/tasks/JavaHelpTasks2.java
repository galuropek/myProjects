package practice.tasks;

import java.util.Arrays;

public class JavaHelpTasks2 {

    public static void main(String[] args) {

        //====================task 2.1=============================
//        double number = 0.1;
//        System.out.println(isInteger(number));
        //=========================================================
        //====================task 2.1=============================
        int[][] ints = Util.generateMatrix(3, 3);
        System.out.println(Util.printMatrix(ints));
        int[][] ints1 = resetColumn(ints, 1);
        System.out.println(Util.printMatrix(ints1));
        //=========================================================
    }

    //====================decision 2.1=========================
    private static String isInteger(double number) {
        return number + (number % 1 == 0 ? " - it is integer" : " - it is not integer");
    }

    //=========================================================
    //====================decision 2.2=========================
    private static int[][] resetColumn(int[][] matrix, int columnNumber) {
        int[][] result = Arrays.copyOf(matrix, matrix.length);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                if (j == columnNumber)
                    result[i][j] = 0;
            }
        }
        return result;
    }
    //=========================================================
}
