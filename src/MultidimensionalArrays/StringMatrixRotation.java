package MultidimensionalArrays;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] matrix=new char[1000][1000];
        String regex="\\d+";
        Pattern pattern=Pattern.compile(regex);
        String input= scanner.nextLine();
        Matcher matcher= pattern.matcher(input);
        int command=-1;
        if (matcher.find()){
        String angle= matcher.group();
         command= Integer.parseInt(angle);

        }
        String fill= scanner.nextLine();
        while (!fill.equals("END")){
            char[] item=fill.toCharArray();

            fill= scanner.nextLine();
        }

    }
}
