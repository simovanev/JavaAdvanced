package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(", ");
        int sum = 0;
        if (numbers.length < 2) {
            System.out.println("Count = " + numbers.length);
            System.out.println("Sum = " + numbers[0]);
        } else {
            Function<String, Integer> parser = e -> Integer.parseInt(e);
            for (String item : numbers) {
                sum += parser.apply(item);
            }
        }
        System.out.println("Count = " + numbers.length);
        System.out.println("Sum = " + sum);
    }
}
