package StreamsFilesAndDirectories;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        String pathOut = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\06.SortLinesOutput.txt";
        Scanner scanner=new Scanner(new FileInputStream(pathIn));
        PrintWriter print= new PrintWriter(new FileOutputStream(pathOut));
        List<String> lines= Files.readAllLines(Path.of(pathIn));
        lines=lines.stream().filter(l->!l.isBlank()).collect(Collectors.toList());
        Collections.sort(lines);
        Files.write(Path.of(pathOut),lines);
        print.close();

    }
}
