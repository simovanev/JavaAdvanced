package StreamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        String pathIn = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\03.CopyBytesOutput.txt";

        try {
            FileInputStream inFile=new FileInputStream(pathIn);
            FileOutputStream outFile=new FileOutputStream(pathOut);

            int oneByte= inFile.read();
            while (oneByte>=0){
                if (oneByte==10 || oneByte==32){
                    outFile.write(oneByte);
                }else  {
                    String digit= String.valueOf(oneByte);
                    for (int i = 0; i < digit.length(); i++) {
                        outFile.write(digit.charAt(i));
                    }
                }
                oneByte= inFile.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
