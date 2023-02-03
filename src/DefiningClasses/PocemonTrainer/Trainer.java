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
    public void ifContain(String command){
        for (Pokemon pokemon: this.collection){
          if ( pokemon.getElement().equals(command)){
              this.badgeNumber+=1;
          }else allLose10();

          }
        }

    private void allLose10() {
        for (Pokemon pokemon: collection){
            pokemon.setHealth(pokemon.getHealth()-10);

        }
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i).getHealth()<=0){
                collection.remove(i);
                i--;
            }
        }
    }
}

