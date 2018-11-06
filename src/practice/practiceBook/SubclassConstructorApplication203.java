package practice.practiceBook;

import practice.practiceBook.util.Bravo203;

public class SubclassConstructorApplication203 {

    public static void main(String[] args) {
        Bravo203 obj;
        obj = new Bravo203();
        obj = new Bravo203("Красный");
        obj = new Bravo203(100);
        obj = new Bravo203("Зеленый", 200);
        obj = new Bravo203('Y');
        obj = new Bravo203("Синий", 300, 'Z');
    }
}
