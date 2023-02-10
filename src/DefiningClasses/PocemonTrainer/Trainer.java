package DefiningClasses.PocemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //The trainer has a name, a number of badges, and a collection of pokemon
    private String name;
    private int badges;
    private List<Pokemon> pokemonList;

    public Trainer(String name, List<Pokemon> value) {
        this.name = name;
        this.badges = 0;
        this.pokemonList = value;
    }

    public List<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public String getName() {
        return name;
    }

    public void execute(String command) {
        if (exist(command)) {
            badges++;
        } else {
            for (int i = 0; i < pokemonList.size(); i++) {
                pokemonList.get(i).setHealth(pokemonList.get(i).getHealth() - 10);
                if (pokemonList.get(i).getHealth() <= 0) {
                    pokemonList.remove(i);
                    i--;
                }
            }


        }
    }

    private boolean exist(String command) {
        for (Pokemon pokemon : pokemonList) {
            if (pokemon.getElement().equals(command)) {
                return true;
            }
        }
        return false;
    }

    public int getBadges() {
        return badges;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",name,badges,pokemonList.size());
    }
}

