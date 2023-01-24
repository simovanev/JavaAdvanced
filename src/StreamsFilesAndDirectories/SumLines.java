package StreamsFilesAndDirectories;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {
        String path= "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> line= Files.readAllLines(Path.of(path));
        for (String input:line){
        int sum=0;
            for (int i = 0; i < input.length(); i++) {
                sum+=input.charAt(i);
            }
            System.out.println(sum);
        }

    }
}
