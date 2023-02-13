package ExamPreparation;

import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] territory = new char[n][n];
        int rowSnake = -1;
        int colSnake = -1;
        for (int row = 0; row < n; row++) {
            String input = scanner.nextLine();
            for (int col = 0; col < n; col++) {
                territory[row][col] = input.charAt(col);
                if (territory[row][col] == 'S') {
                    rowSnake = row;
                    colSnake = col;
                }
            }
        }
        String command = scanner.nextLine();
        int food = 0;

        while (food < 10) {


            if (command.equals("up")) {

                territory[rowSnake][colSnake] = '.';
                rowSnake -= 1;
                if (rowSnake < 0) {
                    System.out.println("Game over!");
                    break;
                }
                if (territory[rowSnake][colSnake] == '*') {
                    food++;

                }
                if (territory[rowSnake][colSnake] == 'B') {
                    territory[rowSnake][colSnake] = '.';
                    for (int row = 0; row < n; row++) {
                        for (int col = 0; col < n; col++) {
                            if (territory[row][col] == 'B') {
                                rowSnake = row;
                                colSnake = col;
                            }
                        }
                    }
                }
                territory[rowSnake][colSnake] = 'S';
            }
            if (command.equals("down")) {

                territory[rowSnake][colSnake] = '.';
                rowSnake += 1;
                if (rowSnake > n - 1) {
                    System.out.println("Game over!");
                    break;
                }
                if (territory[rowSnake][colSnake] == '*') {
                    food++;

                }
                if (territory[rowSnake][colSnake] == 'B') {
                    territory[rowSnake][colSnake] = '.';
                    for (int row = 0; row < n; row++) {
                        for (int col = 0; col < n; col++) {
                            if (territory[row][col] == 'B') {
                                rowSnake = row;
                                colSnake = col;
                            }
                        }
                    }
                }
                territory[rowSnake][colSnake] = 'S';
            }
            if (command.equals("left")) {

                territory[rowSnake][colSnake] = '.';
                colSnake -= 1;
                if (colSnake < 0) {
                    System.out.println("Game over!");
                    break;
                }
                if (territory[rowSnake][colSnake] == '*') {
                    food++;

                }
                if (territory[rowSnake][colSnake] == 'B') {
                    territory[rowSnake][colSnake] = '.';
                    for (int row = 0; row < n; row++) {
                        for (int col = 0; col < n; col++) {
                            if (territory[row][col] == 'B') {
                                rowSnake = row;
                                colSnake = col;
                            }
                        }
                    }
                }
                territory[rowSnake][colSnake] = 'S';
            }
            if (command.equals("right")) {

                territory[rowSnake][colSnake] = '.';
                colSnake += 1;
                if (colSnake > n - 1) {
                    System.out.println("Game over!");
                    break;
                }
                if (territory[rowSnake][colSnake] == '*') {
                    food++;

                }
                if (territory[rowSnake][colSnake] == 'B') {
                    territory[rowSnake][colSnake] = '.';
                    for (int row = 0; row < n; row++) {
                        for (int col = 0; col < n; col++) {
                            if (territory[row][col] == 'B') {
                                rowSnake = row;
                                colSnake = col;
                            }
                        }
                    }
                }
                territory[rowSnake][colSnake] = 'S';
            }
            if (food == 10) {
                System.out.println("You won! You fed the snake.");
                break;
            }

            command = scanner.nextLine();
        }

        System.out.println("Food eaten: " + food);
        print(territory);
    }

    private static void print(char[][] territory) {
        for (int row = 0; row < territory.length; row++) {
            for (int col = 0; col < territory[row].length; col++) {
                System.out.print(territory[row][col]);
            }
            System.out.println();
        }
    }
}
