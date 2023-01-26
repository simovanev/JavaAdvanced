package FunctionalPrograming;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        Map<String,Integer> people=new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input= scanner.nextLine().split(", ");
            people.put(input[0],Integer.parseInt(input[1]));
        }
        String condition= scanner.nextLine();
        int age= Integer.parseInt(scanner.nextLine());
        String printing= scanner.nextLine();

        Predicate<Integer> filters= getPredicate(age,condition);
        Consumer<Map.Entry<String,Integer>> print=getPrint(printing);

        people.entrySet().stream()
                .filter(e->filters.test(e.getValue()))
                .forEach(e->print.accept(e));
    }

    private static Consumer<Map.Entry<String, Integer>> getPrint(String printing) {
        if (printing.equals("name")){
            return e-> System.out.println(e.getKey());
        } else if (printing.equals("age")) {
            return e-> System.out.println(e.getValue());
        } else if (printing.equals("name age")) {
            return e-> System.out.println(e.getKey()+" - "+e.getValue());
        }
        return null;


    }

    private static Predicate<Integer> getPredicate(int age, String condition) {
        if (condition.equals("older")){
            return x->x>=age;
        } else if (condition.equals("younger")) {
            return x->x<=age;
        }return x->x==age;
    }
}
