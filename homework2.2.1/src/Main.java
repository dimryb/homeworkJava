import java.util.Random;

public class Main {

    public static void genRandomMatrix(int[][] colors, int size){
        Random random = new Random();
        for (int i = 0; i< size; i++) {
            for (int j = 0; j< size; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
    }

    public static void printMatrix(int[][] colors, int size){
        for (int i = 0; i< size; i++) {
            for (int j = 0; j< size; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] rotateMatrix(int[][] colors, int size){
        int[][] result = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = colors[size - j - 1][i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];
        genRandomMatrix(colors, SIZE);

        System.out.println("Исходная матрица:");
        printMatrix(colors, SIZE);

        colors = rotateMatrix(colors, SIZE);

        System.out.println();
        System.out.println("Повернутая матрица:");
        printMatrix(colors, SIZE);
    }
}
