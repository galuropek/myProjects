package practice.tasks;

import java.util.LinkedList;

public class AvgLinkedList {

    private static int getAverageLinkedList(LinkedList<Integer> list) {

        int mean = 0;

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            if (i % 2 == 0 && i > 0) {
                mean++;
            }
        }
        return list.get(mean);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.addLast((int) (Math.random() * 10 + 1));
        }
        System.out.println(list);
        System.out.println(getAverageLinkedList(list));
    }
}
