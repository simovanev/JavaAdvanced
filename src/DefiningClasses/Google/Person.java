package DefiningClasses.Google;

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
        StringBuilder output= new StringBuilder();
        output.append(name);
        output.append(System.lineSeparator());
        output.append("Company:").append(System.lineSeparator());
        if (company!=null){

        output.append(company.getCompanyName()).append(" ")
                .append(company.getDepartment()).append(" ")
                .append(company.getSalary())
                .append(System.lineSeparator());
        }

        return output.toString();
    }
}
