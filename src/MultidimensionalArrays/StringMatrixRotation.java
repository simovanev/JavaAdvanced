package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\d+";
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        Matcher matcher = pattern.matcher(input);
        int command = -1;
        if (matcher.find()) {
            String angle = matcher.group();
            command = Integer.parseInt(angle);

        }
        ArrayList<String> charsToFill = new ArrayList<>();
        int maxLength = 0;
        String fill = scanner.nextLine();
        while (!fill.equals("END")) {
            charsToFill.add(fill);
            fill = scanner.nextLine();
            if (fill.length() > maxLength) {
                maxLength = fill.length();
            }
        }
        int rows = charsToFill.size();
        int columns = maxLength;

        char[][] matrix = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (col < charsToFill.get(row).length()) {
                    matrix[row][col] = charsToFill.get(row).charAt(col);
                } else matrix[row][col] = ' ';
            }
        }
        Rotate(command,matrix);
           

    }

    private static void Rotate(int command, char[][] matrix) {
        if (command%360==90){
            for (int col = 0; col <matrix[0].length ; col++) {
                for (int row = matrix.length-1; row >=0 ; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (command%360==180) {
            for (int row = matrix.length-1; row >=0 ; row--) {
                for (int col =matrix[0].length-1; col >=0 ; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (command%360==270) {
            for (int col =matrix[0].length-1; col >=0 ; col--) {
                for (int row = 0; row < matrix.length; row++){
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }else for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
