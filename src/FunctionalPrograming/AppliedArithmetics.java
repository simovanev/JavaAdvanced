package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List<Integer> numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> updateByAdd= e->e.stream().map(x->x+=1).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> updateByMultiply= e->e.stream().map(x->x*=2).collect(Collectors.toList());
        Function<List<Integer>,List<Integer>> updateBySubtract= e->e.stream().map(x->x-=1).collect(Collectors.toList());
        Consumer<List<Integer>> print= e-> {
            e.forEach(x -> System.out.print(x + " "));
            System.out.println();
        };
        String command= scanner.nextLine();
        while (!command.equals("end")){
            switch (command){
                case "add":
                    numbers=updateByAdd.apply(numbers);
                    break;
                case "subtract":
                    numbers=updateBySubtract.apply(numbers);

                    break;
                case "multiply":
                   numbers= updateByMultiply.apply(numbers);
                    break;
                case "print":
                    print.accept(numbers);
                    break;

            }
                    command= scanner.nextLine();
        }
    }

}
