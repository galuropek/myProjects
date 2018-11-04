package rubbish.tasks;

public class Task4BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int)(Math.random()*10+1);
        }
        System.out.println("Рандомный массив чисел:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("A[%2d]=%2d  ", i, array[i]);
        }
        System.out.println();
        bubbleSortArray(array);
        System.out.println("Отсортированный массив чисел:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("A[%2d]=%2d  ", i, array[i]);
        }
        System.out.println();
    }

    private static void bubbleSortArray(int[] array) {
        for (int i = array.length-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
