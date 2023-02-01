package DefiningClasses.OpinionPoll;

public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    private  int getAge(){
        return  this.age;
    }
    private  String getName(){
        return  this.name;
    }

    @Override
    public String toString() {
        return name+" - "+age;
    }
}
