package FunctionalPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] input= scanner.nextLine().split(" ");
        Predicate<String> isUpperCase= e->Character.isUpperCase(e.charAt(0));
        List<String > wordsUpperCase= new ArrayList<>();
        for (String word: input){
            if (isUpperCase.test(word)){
                wordsUpperCase.add(word);
            }
        }
        System.out.println(wordsUpperCase.size());
        wordsUpperCase.forEach(e-> System.out.println(e));

    }
}
