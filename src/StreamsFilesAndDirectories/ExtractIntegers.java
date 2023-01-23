package StreamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        String pathIn = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\04.ExtractIntegersOutput.txt";
        FileInputStream inFile=new FileInputStream(pathIn);
        Scanner scanner= new Scanner(inFile);
        PrintWriter out= new PrintWriter(new FileOutputStream(pathOut));
        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }

            scanner.next();
        }
        out.close();
    }
}
