package practice.itmathrepetitor.tasks;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(getFactorial(5));
    }

    private static int getFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
