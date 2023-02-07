package DefiningClasses.RawData;

import java.util.List;

public class Car {
    //model, engine, cargo, and a collection of exactly 4 tires
    private String model;
    private  Engine engine;
    private Cargo cargo;
    private List<Tires> tires;

    public Car(String model, Engine engine, Cargo cargo, List<Tires> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }
}
