public class Rotate {
    public static int[][] rotateMatrix(int[][] matrix) {
        int size = matrix.length;
        int result[][] = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[size - j - 1][i];
            }
        }
        return result;
    }
}
