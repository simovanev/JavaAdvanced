package StreamsFilesAndDirectories;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        BufferedReader input= new BufferedReader(new FileReader(path));
        String line= input.readLine();
        long totalSum=0;
        while (line!=null){
            for (int i = 0; i < line.length(); i++) {
                totalSum+=line.charAt(i);
            }

            line=input.readLine();
        }
        System.out.println(totalSum);
    }
}
