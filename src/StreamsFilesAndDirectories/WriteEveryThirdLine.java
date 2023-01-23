package StreamsFilesAndDirectories;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {
        String pathIn = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\05.WriteEveryThirdLineOutput.txt";
        try{
        BufferedReader in= new BufferedReader(new FileReader(pathIn));
            PrintStream out= new PrintStream(new FileOutputStream(pathOut));
            String line= in.readLine();
                    int counter=1;
                    while (line!=null){
                        if (counter%3==0){
                            out.println(line);
                        }
                            counter++;
                            line= in.readLine();
                    }

    } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
