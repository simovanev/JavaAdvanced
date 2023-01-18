package MultidimensionalArrays;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(", ");
        int n = Integer.parseInt(data[0]);
        String pattern = data[1];
        int[][] matrix = new int[n][n];
        if (pattern.equals("A")) {
            PatternAFilling(matrix, n);
        } else if (pattern.equals("B")) {
            PatternBFilling(matrix, n);
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col]+ " ");
            }
            System.out.println();
        }
    }

    private static void PatternBFilling(int[][] matrix, int n) {
        int counter = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col % 2 != 0) {
                    matrix[n-1 - row][col] = counter;
                } else {
                    matrix[row][col] = counter;
                }
                counter++;
            }
        }
    }

    private static void PatternAFilling(int[][] matrix, int n) {
        int counter = 1;
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                matrix[row][col] = counter;
                counter++;
            }
        }
    }
}
