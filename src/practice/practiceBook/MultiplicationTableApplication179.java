package practice.practiceBook;

public class MultiplicationTableApplication179 {

    public static void main(String[] args) {
        int rows = 9;
        int cols = 9;
        int[][] table = new int[rows][cols];
        StringBuilder txt = new StringBuilder("\t|\t");
        for (int i = 1; i <= cols; i++) {
            txt.append(i).append("\t");
        }
        txt.append("\n");
        for (int i = 1; i <= 10 + 8 * cols; i++) {
            txt.append("-");
        }
        for (int i = 0; i < table.length; i++) {
            txt.append("\n").append(i + 1).append("\t|\t");
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                txt.append(table[i][j]).append("\t");
            }
        }
        System.out.println("Таблица умножения:");
        System.out.println(txt);
    }
}
