package MultidimensionalArrays;

import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] borders = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(borders[0]);
        int columns = Integer.parseInt(borders[1]);
        int sum=0;
        for (int row = 0; row < rows; row++) {
            String[] data=scanner.nextLine().split(", ");
            for (int col = 0; col < columns; col++) {
               sum+=Integer.parseInt(data[col]);

            }
        }
        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);


    }
}
