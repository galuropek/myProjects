package practice.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class JavaHelpTasks2 {

    public static void main(String[] args) {

        //====================task 2.1=============================
//        double number = 0.1;
//        System.out.println(isInteger(number));
        //=========================================================
        //====================task 2.1=============================
//        int[][] ints = Util.generateMatrix(3, 3);
//        System.out.println(Util.printMatrix(ints));
//        int[][] ints1 = resetColumn(ints, 1);
//        System.out.println(Util.printMatrix(ints1));
        //=========================================================
        //====================task 2.3=============================
//        getName();
        //=========================================================
        //====================task 2.4=============================
//        salaryForWeek(10, 50);
        //=========================================================
        //====================task 2.5=============================
        isItPalindrome(321654);
        isItPalindrome(123321);
        isItPalindrome(465909564);
        isItPalindrome(975345345);
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
    //====================decision 2.3=========================
    private static void getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        System.out.println("Your name is "
                + scanner.nextLine());
    }

    //=========================================================
    //====================decision 2.4=========================
    private static void salaryForWeek(double salaryForHour, double hours) {
        double salary;
        if (hours > 40 && hours <= 60 && salaryForHour >= 8) {
            salary = salaryForHour * 40 + (hours - 40) * 1.5;
            System.out.println(salary);
        } else if (hours <= 40 && salaryForHour >= 8) {
            salary = salaryForHour * hours;
            System.out.println(salary);
        } else {
            if (hours < 8)
                System.out.println("Employee can not have salary less than 8 dollars per hour");
            else
                System.out.println("Employee can not working more than 60 hours a week");
        }
    }

    //=========================================================
    //====================decision 2.5=========================
    private static void isItPalindrome(int number) {
        char[] chars = String.valueOf(number).toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        int inversion = Integer.valueOf(sb.toString());
        if (inversion == number)
            System.out.println(number + " - is Palindrome =)");
        else
            System.out.println(number + " - is not Palindrome =(");
    }
    //=========================================================
}
