package rubbish.tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Task1 {

    private static int counter1 = 0;
    private static int counter2 = 0;

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 30; i++) {
            list.add(i);
        }
        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasPrevious()) {
            System.out.println(integerListIterator.previous());
        }
    }
}
