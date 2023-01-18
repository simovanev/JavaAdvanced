package MultidimensionalArrays;

import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int rows= scanner.nextInt();
        int columns= scanner.nextInt();
        String[][] matrix= new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                StringBuilder input=new StringBuilder("aaa");
                char firstAndLast = (char) (row+97);
                char middle=(char)(row+col+97);
                input.replace(0,1, String.valueOf(firstAndLast));
                input.replace(1,2, String.valueOf(middle));
                input.replace(2,3, String.valueOf(firstAndLast));
                matrix[row][col]=input.toString();
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
