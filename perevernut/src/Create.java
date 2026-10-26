import java.util.Random;

public class Create {
    public static int[][] createMatrix(int size) {
        int[][] matrix = new int[size][size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }
        return matrix;
    }
}
