package practice.tasks;

import java.util.LinkedList;

public class AvgLinkedList {

    static int getAverageLinkedList(LinkedList list) {

        int mean = 0;

        int listSize = list.size();

        for (int i = 0; i < listSize; i++) {
            if (i % 2 == 0) {
                mean += 1;
            }
        }
        return mean;
    }
}
