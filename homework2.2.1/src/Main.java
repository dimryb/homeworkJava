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
                // %4d означает, что мы под каждый номер резервируем 4 знака
                // (незанятые будут заполнены пробелами)
                // таким образом, у нас получится ровная таблица
                System.out.format("%4d", colors[i][j]);
            }
            // Переход на следующую строку
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int SIZE = 8;
        int[][] colors = new int[SIZE][SIZE];

        genRandomMatrix(colors, SIZE);

        System.out.println("Матрица:");
        printMatrix(colors, SIZE);
    }
}
