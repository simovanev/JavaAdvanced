package rabbits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {
    //•	name: String
    //•	capacity: int
    //•	data: List<Rabbit> that holds added rabbits
    private String name;
    private int capacity;
    private List<Rabbit> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data= new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Rabbit rabbit) {
        if (this.capacity> data.size()){
            this.data.add(rabbit);
        }
    }

    public int count() {
        return this.data.size();
    }

    public boolean removeRabbit(String item) {

        if (this.data.removeIf(r->r.getName().equals(item))){
        return true ;

        }
        return false;

    }
    public void removeSpecies(String species){
        for (int i = 0; i < this.data.size(); i++) {
            if (this.data.get(i).getSpecies().equals(species)){
                this.data.remove(i);
            }
        }
    }

    public String sellRabbit(String bunny) {
        String forSale="";
        for (Rabbit rabbit:this.data){
            if (rabbit.getName().equals(bunny)){
                rabbit.setAvailable(false);
                forSale=rabbit.toString();
            }
        }
        return forSale;
    }

    public List<Rabbit> sellRabbitBySpecies(String s) {
        for (Rabbit bunny:this.data){
            if (bunny.getSpecies().equals(s)){
                bunny.setAvailable(false);
            }
        }

        return this.data.stream().filter(e->e.getSpecies().equals(s)).collect(Collectors.toList());
    }

    public String report() {
        String notSold=this.data.stream()
                .filter(r->r.isAvailable())
                .map(e->e.toString())
                .collect(Collectors.joining("\n"));

        return String.format("Rabbits available at %s:%n%s",this.name,notSold);
    }
}
