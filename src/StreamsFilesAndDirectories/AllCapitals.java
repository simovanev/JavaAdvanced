package StreamsFilesAndDirectories;

import java.io.*;

public class AllCapitals {
    public static void main(String[] args) throws IOException {
        String pathIn="C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOut="C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        BufferedReader in= new BufferedReader(new FileReader(pathIn));
        BufferedWriter out= new BufferedWriter(new FileWriter(pathOut));
        String line= in.readLine();
        while (line!=null){

           out.write(line.toUpperCase());
           out.newLine();

            line=in.readLine();
        }
        out.close();
    }
}
