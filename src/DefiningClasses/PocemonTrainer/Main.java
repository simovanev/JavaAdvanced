package DefiningClasses.PocemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,List<Pokemon>> trainersByName= new HashMap<>();
        //"{TrainerName} {PokemonName} {PokemonElement} {PokemonHealth}
        String input = scanner.nextLine();
        while (!input.equals("Tournament")){
            String[] info = input.split("\\s+");
            String trainerName = info[0];
            String pokemonName = info[1];
            String element = info[2];
            int health= Integer.parseInt(info[3]);

            Pokemon pokemon= new Pokemon(pokemonName,element,health);
           trainersByName.putIfAbsent(trainerName,new ArrayList<>());
           trainersByName.get(trainerName).add(pokemon);


            input= scanner.nextLine();
        }
        List<Trainer> trainersList= trainersByName.entrySet().stream()
                .map(e->new Trainer(e.getKey(),e.getValue()))
                .collect(Collectors.toList());


        String command = scanner.nextLine();
        while (!command.equals("End")){
            for (Trainer trainer:trainersList){
                trainer.execute(command);
            }



            command= scanner.nextLine();
        }
        trainersList.stream()
                .sorted(Comparator.comparing(Trainer::getBadges).reversed())
                .forEach(System.out::println);



    }
}
