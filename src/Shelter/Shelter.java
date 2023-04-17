package Shelter;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.capacity = capacity;
        data = new ArrayList<>();

    }

    public void add(Animal animal) {
        if (data.size() < capacity) {
            data.add(animal);
        }
    }

    public boolean remove(String rex) {
        Animal animalToRemove = data.stream()
                .filter(a -> a.getName().equals(rex))
                .collect(Collectors.toList()).stream().findFirst().orElse(null);
        return data.remove(animalToRemove);
    }

    public Animal getOldestAnimal() {
        Animal oldestOne = data.stream()
                .sorted(Comparator.comparingInt(a -> a.getAge()))
                .collect(Collectors.toList())
                .get(data.size() - 1);
        return oldestOne;
    }

    public Animal getAnimal(String bela, String sia) {
        Animal animalByNameAndCaretaker = data.stream()
                .filter(a -> a.getName().equals(bela))
                .filter(a -> a.getCaretaker().equals(sia))
                .collect(Collectors.toList())
                .stream().findFirst().orElse(null);
        return animalByNameAndCaretaker;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        StringBuilder sb= new StringBuilder();
        sb.append("The shelter has the following animals:"+System.lineSeparator());
        for (Animal animal: data){
            sb.append(animal.getName()+" "+animal.getCaretaker()+System.lineSeparator());
        }

        return sb.toString();
    }
}
