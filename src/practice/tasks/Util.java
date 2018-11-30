package practice.tasks;

public class Util {

    public static int[][] generateMatrix(int sizeRow, int sizeColomn){
        int[][] matrix = new int[sizeRow][sizeColomn];
        for (int i = 0; i < sizeRow; i++) {
            for (int j = 0; j < sizeColomn; j++) {
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
