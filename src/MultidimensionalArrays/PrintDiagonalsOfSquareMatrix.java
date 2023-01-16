package MultidimensionalArrays;

import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            String[] data = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(data[col]);

            }
        }
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col] + " ");

                }
            }
        }
        System.out.println();
        for (int row = size - 1; row >= 0; row--) {
            for (int col = 0; col < size; col++) {
                if (col==(size-1)-row){
                System.out.print(matrix[row][col] + " ");

                }

            }

        }

    }
}

