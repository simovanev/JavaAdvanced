package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] rowsColumns= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows=rowsColumns[0];
        int columns=rowsColumns[1];
        int [][] matrix= new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] line= scanner.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col]=Integer.parseInt(line[col]);
            }
        }
        boolean isFound=false;
        int search=Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col]==search){
                    System.out.println(row+" "+col);
                    isFound=true;
                }
            }
        }
        if (!isFound){
            System.out.println("not found");
        }
    }
}
