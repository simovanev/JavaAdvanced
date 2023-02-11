package DefiningClasses.Google;

import DefiningClasses.PocemonTrainer.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parens> parentList;
    private List<Children> childrenList;
    private List<Pokemons> pokemonList;

    public void setCompany(Company company) {
        this.company = company;
    }

    public Person(String name) {
        this.name = name;
        this.parentList = new ArrayList<>();
        this.childrenList = new ArrayList<>();
        this.pokemonList = new ArrayList<>();

    }


    public void setCar(Car car) {
        this.car = car;
    }

    public void setParentList(List<Parens> parentList) {
        this.parentList = parentList;
    }

    public List<Parens> getParentList() {
        return parentList;
    }

    public List<Children> getChildrenList() {
        return childrenList;
    }

    public void setChildrenList(List<Children> childrenList) {
        this.childrenList = childrenList;
    }

    public void setPokemonList(List<Pokemons> pokemonList) {
        this.pokemonList = pokemonList;
    }

    public List<Pokemons> getPokemonList() {
        return pokemonList;
    }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(name);
        output.append(System.lineSeparator());
        output.append("Company:").append(System.lineSeparator());
        if (company != null) {

            output.append(company.getCompanyName()).append(" ")
                    .append(company.getDepartment()).append(" ")
                    .append(company.getSalary())
                    .append(System.lineSeparator());
        }
        output.append("Car:").append(System.lineSeparator());
        if (car != null) {
            output.append(car.getModel()).append(" ")
                    .append(car.getSpeed())
                    .append(System.lineSeparator());
        }
        output.append("Pokemon:").append(System.lineSeparator());
        if (pokemonList.size() > 0) {
            for (Pokemons pokemon : pokemonList) {
                output.append(pokemon.getName()).append(" ")
                        .append(pokemon.getType())
                        .append(System.lineSeparator());
            }
        }

        output.append("Parents:").append(System.lineSeparator());
        if (parentList.size() > 0) {
            for (Parens parent : parentList) {
                output.append(parent.getName()).append(" ")
                        .append(parent.getbDay())
                        .append(System.lineSeparator());
            }

        }
        output.append("Children:").append(System.lineSeparator());
        if (childrenList.size()>0){
            for (Children child: childrenList){
            output.append(child.getName()).append(" ")
                    .append(child.getbDay())
                    .append(System.lineSeparator());

            }
        }

        return output.toString();
}
}
