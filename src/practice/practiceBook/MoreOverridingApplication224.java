package practice.practiceBook;

import practice.practiceBook.util.Alpha224;
import practice.practiceBook.util.Bravo224;

public class MoreOverridingApplication224 {

    public static void main(String[] args) {
        Alpha224 objA = new Alpha224("objA");
        Bravo224 objB = new Bravo224("objB", 123);
        objA.show();
        objB.show();
    }
}
