package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> dividers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        BiFunction<Integer, List<Integer>, Boolean> isDivisible = ((number, list) -> {
            for (int numInList : list) {
                if (number % numInList != 0) {
                    return false;
                }
            }

            return true;
        });

        for (int number = 1; number <= n; number++) {
            if (isDivisible.apply(number, dividers)) {
                System.out.print(number + " ");
            }
        }
        }
}
