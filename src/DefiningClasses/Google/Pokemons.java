package DefiningClasses.Google;

public class Pokemons {
    private String name;
    private String type;

    public Pokemons(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
