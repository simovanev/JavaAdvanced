package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseMatrixDiagonals {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[ ] dimensions= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows= dimensions[0];
        int columns= dimensions[1];
        int [][] matrix=new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] input=scanner.nextLine().split(" ");
            for (int col = 0; col < columns; col++) {
                matrix[row][col]=Integer.parseInt(input[col]);
            }

        }
        int row=rows-1;
        int col=columns-1;
        while (row!=-1){
            int r =row;
            int c= col;
            while (c<columns && r>=0){
                System.out.print(matrix[r--][c++]+" ");
            }
            System.out.println();
            col--;
            if (col==-1){
                col=0;
                row--;
            }

        }
    }
}
