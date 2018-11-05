package rubbish.practiceBook.Util;

import javax.swing.*;

public class MyPane198 extends JOptionPane {
    public static void showMessage(String txt, String title) {
        //можно добавить картинку, добавив после PLAIN_MESSAGE (new ImageIcon("dir файла"))
        showMessageDialog(null, txt, title, PLAIN_MESSAGE);
    }

    public static void showMessage(String txt) {
        showMessage(txt, "Сообщение");
    }

    public static int getInteger(String txt) {
        String res = showInputDialog(null, txt, "Число (по умолчанию 10)", QUESTION_MESSAGE);
        if (res == null)
            return 10;
        else
            return Integer.parseInt(res);
    }
}
