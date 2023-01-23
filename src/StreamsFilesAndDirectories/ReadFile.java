package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path="C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream stream=new FileInputStream(path);
            int oneBite=stream.read();
            while (oneBite>=0){
                System.out.printf("%s ",Integer.toBinaryString(oneBite));

                oneBite= stream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
