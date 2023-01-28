package FunctionalPrograming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>,Integer> minNumber= e-> Collections.min(e);
        int min= minNumber.apply(numbers);
        System.out.println(min);
    }
}
