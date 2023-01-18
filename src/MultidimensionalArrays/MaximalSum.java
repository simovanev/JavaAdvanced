package MultidimensionalArrays;

import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] rowsAndColumns=scanner.nextLine().split("\\s+");
        int rows= Integer.parseInt(rowsAndColumns[0]);
        int columns= Integer.parseInt(rowsAndColumns[1]);
        int[][] matrix=new int[rows][columns];
        int maxSum=Integer.MIN_VALUE;
        int maxRow=0;
        int maxCol=0;
        for (int row = 0; row < rows; row++) {
            String[] input=scanner.nextLine().split("\\s+");
            for (int col = 0; col < columns; col++) {
                matrix[row][col]= Integer.parseInt(input[col]);
            }
        }
        for (int i = 1; i <rows-1 ; i++) {
            for (int j = 1; j <columns-1 ; j++) {
                int sum=matrix[i-1][j-1]+matrix[i-1][j]+matrix[i-1][j+1]+
                        matrix[i][j-1]+matrix[i][j]+matrix[i][j+1]+
                        matrix[i+1][j-1]+matrix[i+1][j]+matrix[i+1][j+1];
                if (sum>maxSum){
                    maxSum=sum;
                    maxRow=i;
                    maxCol=j;
                }
            }

        }
        System.out.println("Sum = "+maxSum);
        for (int i = maxRow-1; i <=maxRow+1 ; i++) {
            for (int j = maxCol-1; j <=maxCol+1 ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
