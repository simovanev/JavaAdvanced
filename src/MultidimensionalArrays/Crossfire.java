package MultidimensionalArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Crossfire {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] size= scanner.nextLine().split(" ");
        int rows= Integer.parseInt(size[0]);
        int columns= Integer.parseInt(size[1]);
        List<List<Integer>> matrix = new ArrayList<>();
        int counter=1;
        for (int row = 0; row < rows; row++) {
            matrix.add(new ArrayList<>());
            for (int col= 0; col <columns ; col++) {
               matrix.get(row).add(counter);
                counter++;
            }
        }
        String command= scanner.nextLine();
        while (!command.equals("Nuke it from orbit")) {
            int commandRow = Integer.parseInt(command.split(" ")[0]);
            int commandColumn = Integer.parseInt(command.split(" ")[1]);
            int radius = Integer.parseInt(command.split(" ")[2]);
            for (int row = commandRow-radius; row <=commandRow+radius ; row++) {
                if (row>=0 &&  row<matrix.size()  && commandColumn>=0  && commandColumn<matrix.get(row).size()){
                    matrix.get(row).remove(commandColumn);
                }

            }
            for (int col = commandColumn+radius; col >=commandColumn-radius ; col--) {
                if (col>=0 &&  col<matrix.get(commandRow).size() ){
                    matrix.get(commandRow).remove(col);


                }
            }matrix.removeIf(List::isEmpty);

            command = scanner.nextLine();
        }
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
