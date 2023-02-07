package DefiningClasses.OpinionPoll;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personsList=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] input= scanner.nextLine().split("\\s+");
            String name= input[0];
            int age=Integer.parseInt(input[1]);
            Person person= new Person(name,age);
            personsList.add(person);

        }
        personsList.stream().filter(e->e.getAge()>30)
                .sorted(Comparator.comparing(p->p.getName()))
                .forEach(r-> System.out.println(r));
    }
}
