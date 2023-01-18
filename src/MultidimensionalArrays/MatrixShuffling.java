package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matrixSize= Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(Integer::parseInt).
                toArray();
        int rows = matrixSize[0];
        int columns = matrixSize[1];
        String[][] matrix = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] item = scanner.nextLine().split("\\s+");
            for (int col = 0; col < columns; col++) {
                matrix[row][col]=item[col];
            }
        }
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] command = input.split("\\s+");
            if (CommandIsValid(command, matrix)) {
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);
                String first = matrix[row1][col1];
                String second = matrix[row2][col2];
                matrix[row1][col1] = second;
                matrix[row2][col2] = first;
                for (int row = 0; row < rows; row++) {
                    for (int col = 0; col < columns; col++) {
                        System.out.print(matrix[row][col] + " ");
                    }
                    System.out.println();
                }

            } else System.out.println("Invalid input!");


            input = scanner.nextLine();
        }


    }

    private static boolean CommandIsValid(String[] command, String[][] matrix) {

        if (command.length != 5) {
            return false;
        }
        int row1 = Integer.parseInt(command[1]);
        int col1 = Integer.parseInt(command[2]);
        int row2 = Integer.parseInt(command[3]);
        int col2 = Integer.parseInt(command[4]);
        if (!command[0].equals("swap")) {
            return false;
        } else if (row1 < 0 || row2 < 0 || col1 < 0 || col2 < 0 ||
                row1 > matrix.length - 1 || row2 > matrix.length - 1 ||
                col1 > matrix[0].length - 1 || col2 > matrix[0].length - 1) {
            return false;

        }
        return true;
    }
}
