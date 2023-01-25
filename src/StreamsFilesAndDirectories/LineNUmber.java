package StreamsFilesAndDirectories;

import java.io.*;

public class LineNUmber {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";
        String pathOut="C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";

        BufferedReader input= new BufferedReader(new FileReader(pathIn));
        BufferedWriter out= new BufferedWriter(new FileWriter(pathOut));
        String line= input.readLine();
        int counter=1;
        while (line!= null){
            out.write(counter+". "+line);
            out.newLine();
            counter++;
            line= input.readLine();
        }
        out.close();
    }
}
