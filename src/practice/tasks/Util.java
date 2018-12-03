package practice.tasks;

public class Util {

    public static int[][] generateMatrix(int sizeRow, int sizeColomn) {
        int[][] matrix = new int[sizeRow][sizeColomn];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColomn; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
        return matrix;
    }

    public static String printMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        sb.append("{{");
        String bracket = "";
        for (int i = 0; i < matrix.length; i++) {
            String separator = "";
            sb.append(bracket);
            for (int j = 0; j < matrix[0].length; j++) {
                sb.append(separator).append(matrix[i][j]);
                separator = ", ";
                bracket = "}, {";
            }
        }
        sb.append("}}");
        return sb.toString();
    }
}
