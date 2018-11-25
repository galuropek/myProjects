package practice.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

    private static HashMap<Integer, Integer> findDuplicates(int[] array) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        for (int element : array) {
            if (counter.get(element) != null) {
                int value = counter.get(element);
                counter.put(element, ++value);
            } else {
                counter.put(element, 1);
            }
        }
        return counter;
    }

    private static void printArray(int[] array) {
        String separator = "";
        System.out.print("{");
        for (int element : array) {
            System.out.print(separator + element);
            separator = ", ";
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 23, 34, 34, 4, 6, 56, 5, 6, 6, 67, 7, 7, 1};
        printArray(array);
        System.out.println(findDuplicates(array));
    }
}
