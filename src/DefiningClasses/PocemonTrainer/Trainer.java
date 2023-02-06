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

    public Trainer(String trainerName, List<Pokemon> collection) {
        this.trainerName = trainerName;
        this.badgeNumber=0;
        this.collection= collection;

    }
    private boolean isExist(String command) {
        for (Pokemon pokemon : collection) {
            if (pokemon.getElement().equals(command)) {
                return true;
            }
        }
        return false;
    }
    public void commandExecuting(String command) {

        if (isExist(command)) {
            badgeNumber += 1;
        } else {

            for (int i = 0; i < collection.size(); i++) {
                collection.get(i).setHealth(collection.get(i).getHealth() - 10);
                if (collection.get(i).getHealth() <= 0) {
                    collection.remove(i);
                    i--;
                }
            }
        }
    }




    public int getBadgeNumber() {
        return badgeNumber;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d",trainerName,this.badgeNumber,collection.size());
    }
}

