package practice.tasks;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void generateMatrix() {
        int[][] matrix;
        assertNotNull(matrix = Util.generateMatrix(3,3));
        matrix = Util.generateMatrix(3,4);
        assertTrue(matrix.length == 3 && matrix[0].length == 4);
    }

    @Test
    public void printMatrix() {
    }
}