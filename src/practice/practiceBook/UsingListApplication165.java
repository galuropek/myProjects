package practice.practiceBook;

import javax.swing.*;

public class UsingListApplication165 {

    public static void main(String[] args) {
        String[] txt = {"Волк", "Лиса", "Медведь", "Енот"};
        String[] files = {"wolf.jpg", "fox.jpg", "bear.jpg", "raccoon.jpg"};
        String folder = "d:/img/";
        String msg = "Кого показать?";
        String title = "В мире животных";
        ImageIcon img = new ImageIcon(folder + "giraffe.jpg");
        String animal;
        animal = (String) JOptionPane.showInputDialog(null,
                msg, title,JOptionPane.PLAIN_MESSAGE, img, txt, txt[0]);
        if (animal == null)
            System.exit(0);
        for (int i = 0; i < txt.length; i++) {
            if (animal.equals(txt[i])){
                img = new ImageIcon(folder + files[i]);
                break;
            }
        }
        JOptionPane.showMessageDialog(null, img, animal, JOptionPane.PLAIN_MESSAGE);
    }
}
