import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] matrix_4x4 = new int[][] {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println("Normal: ");
        printMatrix(matrix_4x4);

        System.out.println("Rotate 90 degree: ");
        rotate90Degree(matrix_4x4);
        printMatrix(matrix_4x4);

    }

    public static void rotate90Degree(int[][] userMatrix) {
        transposeMatrix(userMatrix);
        reverseRow(userMatrix);
    }

    public static int[][] transposeMatrix(int[][] usermatrix) {
        for (int i = 0; i < usermatrix.length; i++) {
            for (int j = 0; j < i; j++) {
                swap_for_transpose(usermatrix, i, j);
            }
        }
        return usermatrix;
    }

    public static void swap_for_transpose(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static int[][] reverseRow(int[][] usermatrix) {
        int matrixLength = usermatrix.length;
        for (int i = 0; i < matrixLength; i++) {
            for (int j = 0; j < matrixLength / 2; j++) {
                int temp = usermatrix[i][j];
                usermatrix[i][j] = usermatrix[i][matrixLength - 1 - j];
                usermatrix[i][matrixLength - 1 - j] = temp;
            }
        }
        return usermatrix;
    }

    public static void printMatrix(int[][] userMatrix) {
        for (int i = 0; i < userMatrix.length; i++) {
            System.out.println(Arrays.toString(userMatrix[i]));
            // for (int j = 0; j < matrix[i].length; j++) {
            // }
        }
    }
}
