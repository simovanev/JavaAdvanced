package StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String pathIn = "C:\\Users\\20161004\\Desktop\\Java\\JavaAdvancedLabAnd Exersises\\StreamsFilesAndDirectories\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> lines = Files.readAllLines(Path.of(pathIn));
        int vowels = 0;
        int symbols = 0;
        int punctuation = 0;
        for (String input:lines){
            for (int i = 0; i < input.length(); i++) {
                char symbol= input.charAt(i);
                if (symbol=='a' || symbol== 'e'|| symbol=='o'|| symbol=='u' || symbol=='i'){
                    vowels++;
                } else if (symbol=='.'|| symbol=='?'|| symbol=='!'|| symbol==',') {
                    punctuation++;

                }else if (symbol!=32){
                    symbols++;
                }
            }

        }
        //Vowels: 41
        //Other symbols: 72
        //Punctuation: 6
        System.out.println("Vowels: "+vowels);
        System.out.println("Other symbols: "+symbols);
        System.out.println("Punctuation: "+punctuation);

    }
}
