package practice.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

    static HashMap<Integer, Integer> findDuplicates(int[] array) {
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

    public static void main(String[] args) {
        int[] array = {1, 2, 23, 34, 34, 4, 54, 56, 5, 6, 6, 67, 7, 7, 1};

        System.out.println(findDuplicates(array));
    }
}
