package practice.practiceBook;

import practice.practiceBook.util.MyPane198;

public class ExtendingJOptionPaneApplication198 {

    public static void main(String[] args) {
        MyPane198.showMessage("Всем привет!");
        int number = MyPane198.getInteger("Введите целое число");
        StringBuilder txt = new StringBuilder("Числа от 1 до " + number + ":\n");
        for (int i = 1; i <= number; i++) {
            txt.append(i).append(" ");
        }
        MyPane198.showMessage(txt.toString(), "Целые числа");
    }
}
