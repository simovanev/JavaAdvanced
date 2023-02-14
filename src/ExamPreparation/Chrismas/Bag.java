package ExamPreparation.Chrismas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bag {

    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count() {
        return data.size();
    }

    public void add(Present present) {
        if (data.size() < capacity) {
            data.add(present);
        }
    }

    public boolean remove(String name) {

        return this.data.removeIf(e -> e.getName().equals(name));
    }
    //•	heaviestPresent() method – returns the heaviest present
    public Present heaviestPresent(){
       return this.data.stream()
               .sorted(Comparator.comparingDouble(Present::getWeight).reversed())
               .collect(Collectors.toList())
               .get(0);
    }
    //•	getPresent(String name) method – returns the present with the given name
    public  Present getPresent(String name){
       return this.data.stream()
               .filter(e -> e.getName().equals(name))
               .toList()
               .get(0);
    }
    //•	report() method – returns a string in the following format (print the presents in order of appearance):
    //o	"{color of Bag} bag contains:
    //{Present1}
    //{Present2}
    public  String report(){
       String currentPresent= this.data.stream().map(p->p.toString()).collect(Collectors.joining("%n"));
        return String.format("%s bag contains:%n%s",getColor(),currentPresent);
    }
}
