package DefiningClasses.PocemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    //The trainer has a name, a number of badges, and a collection of pokemon
    private  String trainerName;
    private  int badgeNumber;
    private List<Pokemon> collection;

    public List<Pokemon> getCollection() {
        return collection;
    }

    public Trainer(String trainerName, List<Pokemon> value) {
        this.trainerName = trainerName;
        this.badgeNumber=0;
        this.collection= new ArrayList<>();
    }
}
