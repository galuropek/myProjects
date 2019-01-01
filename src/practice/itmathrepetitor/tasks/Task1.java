package practice.itmathrepetitor.tasks;

public class Task1 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print("i: " + i + " ");
            System.out.printf("%7d ", getFactorial(i));
            System.out.printf("%7d \n", getFactorialRecursion(i));
        }
    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }

    private static int getFactorialRecursion(int number) {
        int defaultIndex = 1;
        int defaultResult = 1;
        return getFactorialRecursion(number, defaultIndex, defaultResult);
    }

    private static int getFactorialRecursion(int number, int index, int result) {
        while (index <= number) {
            result = result * index;
            index++;
            getFactorialRecursion(number, index, result);
        }
        return result;
    }
}
