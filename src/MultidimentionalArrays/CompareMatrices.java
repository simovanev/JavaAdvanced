package MultidimentionalArrays;

import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        int rowsFirst = Integer.parseInt(data[0]);
        int columFirst = Integer.parseInt(data[1]);
        int[][] firstMatrix = new int[rowsFirst][columFirst];
        for (int i = 0; i < rowsFirst; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < columFirst; j++) {
                firstMatrix[i][j] = Integer.parseInt(input[j]);

            }

        }
         data = scanner.nextLine().split(" ");
        int rowsSecond = Integer.parseInt(data[0]);
        int columSecond = Integer.parseInt(data[1]);
        int[][] secondMatrix = new int[rowsSecond][columSecond];
        for (int i = 0; i < rowsSecond; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (int j = 0; j < columSecond; j++) {
                secondMatrix[i][j] = Integer.parseInt(input[j]);
            }
        }
        if (rowsFirst!=rowsSecond || columFirst!=columSecond){
            System.out.println("not equal");
            return;
        }else {
            for (int i = 0; i < rowsFirst; i++) {
                for (int j = 0; j < columFirst; j++) {
                    if (firstMatrix[i][j]!=secondMatrix[i][j]){
                        System.out.println("not equal");
                        return;
                    }
                }
            }
        }
        System.out.println("equal");
    }
}
