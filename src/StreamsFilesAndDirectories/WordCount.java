package StreamsFilesAndDirectories;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) throws IOException {
        String pathInWord = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        String pathInToCheck = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";

        String pathOut = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\results.txt";

        List<String> words = Files.readAllLines(Path.of(pathInWord));
        List<String> wordsToCheck = Files.readAllLines(Path.of(pathInToCheck));
        Map<String, Integer> wordCount = new HashMap<>();

        for (String item : words) {
            String[] word = item.split(" ");
            for (int i = 0; i < word.length; i++) {
                wordCount.putIfAbsent(word[i], 0);

            }
        }
        for (String check : wordsToCheck) {
            String[] word = check.split(" ");
            for (String element : word) {
                if (wordCount.containsKey(element)) {
                    wordCount.put(element, wordCount.get(element) + 1);
                }
            }
        }

        PrintWriter out = new PrintWriter(new FileWriter(pathOut));
        wordCount.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).collect(Collectors.toList())
                .forEach(entry -> out.println(entry.getKey() + " - " + entry.getValue()));
        out.close();
    }
}
