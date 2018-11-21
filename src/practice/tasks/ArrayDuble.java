package practice.tasks;

public class ArrayDuble {

    private static int sumArrayElements(int[] array) {

        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i+1;
            System.out.println(array[i]);
        }
        int sumArray = sumArrayElements(array);


    }
}
