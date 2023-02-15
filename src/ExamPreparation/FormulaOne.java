package ExamPreparation;

import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        char[][] track = new char[n][n];
        int pollRow = -1;
        int pollcol = -1;
        boolean win= false;
        for (int row = 0; row < n; row++) {
            String input = scanner.nextLine();
            for (int col = 0; col < n; col++) {
                track[row][col] = input.charAt(col);
                if (input.charAt(col) == 'P') {
                    pollRow = row;
                    pollcol = col;
                }

            }
        }

        for (int i = 0; i < numberOfCommands; i++) {
            track[pollRow][pollcol] = '.';
            String command = scanner.nextLine();
            if (command.equals("up")) {
                pollRow -= 1;
                pollRow=checkRow(pollRow,n);

                if (track[pollRow][pollcol] == 'B') {
                    pollRow -= 1;
                    pollRow= checkRow(pollRow,n);

                } else if (track[pollRow][pollcol] == 'T') {
                    pollRow += 1;
                    pollRow=checkRow(pollRow,n);
                }
            }
            if (command.equals("down")) {
                pollRow += 1;
                pollRow=checkRow(pollRow,n);

                if (track[pollRow][pollcol] == 'B') {
                    pollRow += 1;
                    pollRow=checkRow(pollRow,n);

                } else if (track[pollRow][pollcol] == 'T') {
                    pollRow -= 1;
                    pollRow=checkRow(pollRow,n);
                }
            }
            if (command.equals("left")) {
                pollcol -= 1;
                pollcol=checkCol(pollcol,n);

                if (track[pollRow][pollcol] == 'B') {
                    pollcol -= 1;
                    pollcol=checkCol(pollcol,n);

                } else if (track[pollRow][pollcol] == 'T') {
                    pollcol += 1;
                    pollcol= checkCol(pollcol,n);
                }
            }

            if (command.equals("right")) {
                pollcol += 1;
                pollcol= checkCol(pollcol,n);

                if (track[pollRow][pollcol] == 'B') {
                    pollcol += 1;
                    pollcol=  checkCol(pollcol,n);

                } else if (track[pollRow][pollcol] == 'T') {
                    pollcol -= 1;
                    pollcol=  checkCol(pollcol,n);

                }
            }

            if (track[pollRow][pollcol] == 'F') {
                track[pollRow][pollcol] = 'P';
                System.out.println("Well done, the player won first place!");
                win= true;
                break;
            }
            track[pollRow][pollcol] = 'P';
        }
        if (!win){
            System.out.println("Oh no, the player got lost on the track!");
        }
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(track[row][col]);
            }
            System.out.println();
        }
    }


    private static int checkRow(int pollRow,int n) {
        if (pollRow == -1) {
            pollRow = n-1;
        }
        if (pollRow == n) {
            pollRow = 0;
        }return pollRow;
    }
    private static int checkCol(int pollcol,int n){
        if (pollcol == -1) {
            pollcol = n-1;
        }
        if (pollcol == n) {
            pollcol = 0;
        }return pollcol;
    }
}

