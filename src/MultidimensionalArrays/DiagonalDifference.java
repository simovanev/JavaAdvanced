package MultidimensionalArrays;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }

        System.out.println(Math.abs(FirstDiagonal(matrix)-SecondDiagonal(matrix)));
    }

    private static int SecondDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {

            sum += matrix[matrix.length - 1 - row][row];

        }
        return sum;
    }


    private static int FirstDiagonal(int[][] matrix) {
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                if (row == col) {
                    sum += matrix[row][col];

                }
            }
        }
        return sum;
    }
}
