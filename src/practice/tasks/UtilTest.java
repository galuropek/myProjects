package practice.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void generateMatrix() {
        int[][] matrix;
        assertNotNull(matrix = Util.generateMatrix(3, 3));
        matrix = Util.generateMatrix(3, 4);
        assertTrue(matrix.length == 3 && matrix[0].length == 4);
    }

    @Test
    public void printMatrix() {
        int[][] matrix = {{2, 3, 4}, {3, 4, 6}, {8, 0, 1}, {2, 7, 1}};
        assertEquals("{{2, 3, 4}, {3, 4, 6}, {8, 0, 1}, {2, 7, 1}}"
                , Util.printMatrix(matrix));
        int[][] matrix2 = {{1, 2, 3}, {3, 2, 1}, {1, 2, 3}};
        assertEquals("{{1, 2, 3}, {3, 2, 1}, {1, 2, 3}}"
                , Util.printMatrix(matrix2));
    }
}