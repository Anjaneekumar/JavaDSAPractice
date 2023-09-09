public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        print_2D_Array(matrix);
        System.out.println("Transpose of matrix: ");
        print_2D_Array(transposeInPlace(matrix));
        // print_2D_Array(matrix);
    }

    public static int[][] transposeInPlace(int[][] userInput) {
        if (userInput.length != 0) {

            // for (int column = 0; column < userInput[0].length; column++) {
            // for (int row = 0; row < userInput.length; row++) {
            // result[column][row] = userInput[row][column]; // 00 -> 00 , 10 -> 01
            // }
            // }
            for (int row = 0; row < userInput.length; row++) {
                for (int column = 0; column < row; column++) {
                    int temp = userInput[row][column];
                    userInput[row][column] = userInput[column][row];
                    userInput[column][row] = temp;
                }
            }

            return userInput;
        }
        return userInput;
    }

    public static void print_2D_Array(int[][] userInput) {
        for (int row = 0; row < userInput.length; row++) {
            System.out.print("[");
            for (int column = 0; column < userInput[0].length; column++) {
                System.out.print(userInput[row][column] + " ");
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
