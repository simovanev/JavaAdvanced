package FunctionalPrograming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numbers.removeIf(e->e%2!=0);
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i)+", ");
        }
        System.out.println(numbers.get(numbers.size()-1));
        numbers.sort((a,b)-> a.compareTo(b));
        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.print(numbers.get(i)+", ");
        }
        System.out.println(numbers.get(numbers.size()-1));


    }
}
