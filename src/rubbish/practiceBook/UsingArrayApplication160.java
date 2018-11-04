package rubbish.practiceBook;

import javax.swing.*;

public class UsingArrayApplication160 {

    public static void main(String[] args) {

        String input, title = "Биноминальные коэффициенты";
        input = JOptionPane.showInputDialog(null, "Укажите значаение" +
                "нижнего индекса", title, JOptionPane.QUESTION_MESSAGE);
        if (input == null) {
            System.exit(0);
        }
        int n = Integer.parseInt(input);
        if (n < 0) {
            JOptionPane.showMessageDialog(null, "Указан неверный параметр!",
                    title, JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        int[] binoms = new int[n + 1];
        binoms[0] = 1;
        StringBuilder txt = new StringBuilder("Содержимое массива: \n|" + binoms[0] + "|");
        for (int i = 1; i < binoms.length; i++) {
            binoms[i] = binoms[i - 1] * (n - i + 1) / i;
            txt.append(" ").append(binoms[i]).append("|");
        }
        JOptionPane.showMessageDialog(null, txt.toString(), title, JOptionPane.INFORMATION_MESSAGE);

    }
}
