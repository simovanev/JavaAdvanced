package DefiningClasses.PocemonTrainer;

public class Pokemon {
    //Pokemon has a name, an element, and health
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }
}
