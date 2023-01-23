package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        String pathIn = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\02.WriteToFileOutput.txt";
        List<Character> symbols = new ArrayList<>();
        Collections.addAll(symbols, '.', ',', '!', '?');

        try {
            FileInputStream inputFile = new FileInputStream(pathIn);
            FileOutputStream outputFile = new FileOutputStream(pathOut);
            int oneByte = inputFile.read();
            while (oneByte >= 0) {
                if (!symbols.contains((char)oneByte)){
                    outputFile.write(oneByte);
                }

                oneByte = inputFile.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
