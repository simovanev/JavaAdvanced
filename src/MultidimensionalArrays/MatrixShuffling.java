package MultidimensionalArrays;

import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        String[][] matrix = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split(" \\s+");
        }
        String[] command = scanner.nextLine().split("\\s+");
        if (CommandIsValid(command,matrix)){
            //todo switch
        }

    }

    private static boolean CommandIsValid(String[] command, String [][] matrix) {

        if (command.length != 5) {
            return false;
        }
        int row1=Integer.parseInt(command[1]);
        int col1=Integer.parseInt(command[2]);
        int row2=Integer.parseInt(command[3]);
        int col2=Integer.parseInt(command[4]);
        if (!command[0].equals("swap")) {
            return false;
        }
        else if (row1<0 || row2<0 ||col1<0 || col2<0 ||
                row1>matrix.length-1 || row2> matrix.length-1 ||
                col1>matrix[0].length-1 || col2>matrix[0].length-1)  {
            return false;

        }
        return true;
    }
}
