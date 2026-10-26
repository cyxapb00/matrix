public class Main {
    public static void main(String[] args) {
        int matrix[][] = Create.createMatrix(8);

        System.out.println("Оригинальная матрица:");
        Print.printMatrix(matrix);

        int result[][] = Rotate.rotateMatrix(matrix);

        System.out.println("Повернутая матрица:");
        Print.printMatrix(result);
    }
}
