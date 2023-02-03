package DefiningClasses.PocemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();
        Map<String, List<Pokemon>> allTrainers= new HashMap<>();
        while (!input.equals("Tournament")){
            String[] info= input.split("\\s+");
            String trainerName=info[0];
            String pokemonName=info[1];
            String element=info[2];
            int health=Integer.parseInt(info[3]);

            Pokemon pokemon=new Pokemon(pokemonName,element,health);
           allTrainers.putIfAbsent(trainerName,new ArrayList<>());
           allTrainers.get(trainerName).add(pokemon);


            input= scanner.nextLine();
        }
    }
}
