package rubbish.tasks;

//найти единственный дубликат в массиве от 1 до 100

import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        array[58] = 63;
        Arrays.sort(array);
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("i: " + i + "; " + "num: " + array[i]);
            sum += array[i];
            sum2 += i;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1])
                System.out.println("индекс: " + i + "; " + "число: " + array[i]);
        }
        System.out.println("sum: " + sum);
        System.out.println("sum2: " + sum2);
        System.out.println("result: " + (sum - sum2));
    }
}
