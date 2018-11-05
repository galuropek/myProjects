package rubbish.practiceBook;

import javax.swing.*;

public class Using2DcharsArrayApplication185 {

    public static void main(String[] args) {
        int[] size = {3, 12, 4, 7};
        char[][] symbs=new char[size.length][];
        char s ='A';
        StringBuilder txt= new StringBuilder();
        for (int i = 0; i < symbs.length; i++) {
            symbs[i] = new char[size[i]];
            for (int j = 0; j < symbs[i].length; j++) {
                symbs[i][j]=s;
                s++;
                txt.append("|").append(symbs[i][j]).append(" ");
            }
            txt.append("|\n");
        }
        JOptionPane.showMessageDialog(null, txt, "Массив со строками разной длинны", JOptionPane.PLAIN_MESSAGE);
    }
}
