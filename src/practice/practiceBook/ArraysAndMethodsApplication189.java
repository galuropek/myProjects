package practice.practiceBook;

public class ArraysAndMethodsApplication189 {

    private static void show1D(int[] nums) {
        for (int num : nums) {
            System.out.printf("%4d", num);
        }
        System.out.println();
    }

    private static void show2D(int[][] nums) {
        for (int[] num : nums) {
            for (int n : num) {
                System.out.printf("%4d", n);
            }
            System.out.println();
        }
    }

    private static int[] prod(int[][] matrix, int[] vector) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = 0;
            for (int j = 0; j < vector.length; j++) {
                result[i] += matrix[i][j] * vector[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 0, 3, -1}, {2, -1, -2, 3}, {-1, 1, 0, 2}};
        int[] vector = {1, -1, 3, 2};
        int[] result = prod(matrix, vector);
        System.out.println("Матрица A:");
        show2D(matrix);
        System.out.println("Вектор B:");
        show1D(vector);
        System.out.println("Результат A*B:");
        show1D(result);
    }
}
