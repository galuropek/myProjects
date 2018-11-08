package practice.practiceBook;

import practice.practiceBook.util.Alpha221;
import practice.practiceBook.util.Bravo221;

public class OverrideMethodDemo221 {

    public static void main(String[] args) {
        Alpha221 objA = new Alpha221("objA");
        Bravo221 objB = new Bravo221("objB", 123);
        objA.show();
        objB.show();
    }
}
