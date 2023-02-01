package DefiningClasses.OpinionPoll;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        Map<String ,Person> peoples= new TreeMap<>();
        for (int i = 0; i < count; i++) {
            String[] input = scanner.nextLine().split("\\s");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person= new Person(name,age);
            if (age>30){
            peoples.put(name,person);

            }
        }
        for (Map.Entry<String, Person> item : peoples.entrySet()) {
            System.out.println(item.getValue().toString());
        }


    }
}
