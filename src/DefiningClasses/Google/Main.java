package DefiningClasses.Google;

import DefiningClasses.PocemonTrainer.Pokemon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String,Person> personMap= new HashMap<>();
        while (!input.equals("End")) {
            String[] info = input.split("\\s+");
            personMap.putIfAbsent(info[0],new Person(info[0]));

            String command = info[1];
            switch (command) {
                case "company":
                    String companyName = info[2];
                    String department = info[3];
                    String salary = info[4];
                    Company company= new Company(companyName,department,salary);
                    personMap.get(info[0]).setCompany(company);
                    break;
                case "pokemon":
                     String pokemonName=info[2];
                     String type= info[3];
                    Pokemons pokemon= new Pokemons(pokemonName,type);
                    personMap.get(info[0]).getPokemonList().add(pokemon);
                    break;
                case "parents":
                    String parentName=info[2];
                    String bDay= info[3];
                    Parens parent= new Parens(parentName,bDay);
                    personMap.get(info[0]).getParentList().add(parent);
                    break;
                case "children":
                    String childName=info[2];
                    String birthDay= info[3];
                    Children child= new Children(childName,birthDay);
                    personMap.get(info[0]).getChildrenList().add(child);
                    break;
                case "car":
                    String model=info[2];
                    String speed= info[3];
                    Car car= new Car(model,speed);
                    personMap.get(info[0]).setCar(car);
                    break;
            }


            input = scanner.nextLine();
        }
        String searchName = scanner.nextLine();
        System.out.println(personMap.get(searchName));


    }
}
