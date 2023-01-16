package MultidimensionalArrays;

import java.util.Scanner;

public class MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] borders = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(borders[0]);
        int columns = Integer.parseInt(borders[1]);
        int[][] matrix = new int[rows][columns];
        int maxSum = 0;
        int maxRow = -1;
        int maxCol = -1;
        for (int row = 0; row < rows; row++) {
            String[] data = scanner.nextLine().split(", ");
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = Integer.parseInt(data[col]);

            }
        }
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < columns - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        // for (int row = 0; row < rows; row++) {
        //   for (int col = 0; col < columns; col++) {
        System.out.println(matrix[maxRow][maxCol] + " " + matrix[maxRow][maxCol + 1]);
        System.out.println(matrix[maxRow + 1][maxCol] + " " + matrix[maxRow + 1][maxCol + 1]);
        System.out.println(maxSum);
    }
}


