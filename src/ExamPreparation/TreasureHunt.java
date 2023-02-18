package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size= scanner.nextLine().split(" ");
        int rows = Integer.parseInt(size[0]);
        int columns = Integer.parseInt(size[0]);
        int rowHunter = -1;
        int colHunter = -1;
        String[][] matrix = new String[rows][columns];
        List<String> commandList = new ArrayList<>();
        for (int row = 0; row < rows; row++) {
            String[] input = scanner.nextLine().split(" ");
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = input[col];
                if (input[col].equals("Y")) {
                    rowHunter = row;
                    colHunter = col;
                }

            }

        }
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {

            switch (command) {
                case "up":
                    if (rowHunter > 0  ) {
                        if (!(matrix[rowHunter - 1][colHunter].equals("T"))){

                        rowHunter -= 1;
                        commandList.add(command);
                        }
                    }
                    break;
                case "down":
                    if (rowHunter < rows - 1  ) {
                        if (!(matrix[rowHunter + 1][colHunter].equals("T"))){

                        rowHunter += 1;
                        commandList.add(command);
                        }
                    }
                    break;
                case "left":
                    if (colHunter > 0  ) {
                        if (!(matrix[rowHunter][colHunter - 1].equals("T"))){

                        colHunter -= 1;
                        commandList.add(command);
                        }
                    }
                    break;
                case "right":
                    if (colHunter < columns - 1  ) {
                        if (!(matrix[rowHunter][colHunter + 1].equals("T"))){

                        colHunter += 1;
                        commandList.add(command);
                        }
                    }
                    break;
            }

            command = scanner.nextLine();
        }
        String rightPat= String.join(", ", commandList);
        if (matrix[rowHunter][colHunter].equals("X")){
            System.out.println("I've found the treasure!");
            System.out.printf("The right path is %s",rightPat);
        }else System.out.println("The map is fake!");
    }
}
