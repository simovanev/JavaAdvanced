package MultidimensionalArrays;

import java.util.Scanner;

public class IntersectionOfTwoMatrices {
    public static <symbols> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        String[][] lettersFirst = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] symbols = scanner.nextLine().split(" ");
            for (int col = 0; col < columns; col++) {
                lettersFirst[row][col] = symbols[col];
            }
        }
        String[][] lettersSecond = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] symbols = scanner.nextLine().split(" ");
            for (int col = 0; col < columns; col++) {
                lettersSecond[row][col] = symbols[col];
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (lettersFirst[row][col].equals(lettersSecond[row][col])){
                    System.out.print(lettersFirst[row][col]+" ");
                }else System.out.print("*"+ " ");
            }
                System.out.println();
        }
    }
}
