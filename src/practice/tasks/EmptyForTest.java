package practice.tasks;

import java.util.Arrays;
import java.util.HashMap;

public class EmptyForTest {

    public static void main(String[] args) {

//        int[] array = {8, 7, 7, 2, 2, 1, 7, 8, 3, 8};
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(getMode(array));

    }

    public static HashMap<Integer, Integer> getMode(int[] inputData) {

        int[] sortArray = inputData;
        Arrays.sort(sortArray);
        int counter = 0;
        HashMap<Integer, Integer> result = new HashMap<>();
        for (int i = 0; i < sortArray.length - 1; i++) {
            if (sortArray[i] == sortArray[i + 1]) {
                int index = i + 1;
                int count = 1;
                while (sortArray[i] == sortArray[index]) {
                    count++;
                    if (index < sortArray.length - 1)
                        index++;
                    else
                        break;
                }
                if (count > counter || count == counter) {
                    counter = count;
                    result.put(sortArray[i], counter);
                    i = index - 1;
                }
            }
        }
        return result;
    }
}
