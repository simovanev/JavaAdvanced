package DefiningClasses.RawData;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Car {
    //model, engine, cargo, and a collection of exactly 4 tires
    private String model;
    private  Engine engine;
    private Cargo cargo;
    private List<Tires> tires;

    public Engine getEngine() {
        return engine;
    }

    public List<Tires> getTires() {
        return tires;
    }

    public Car(String model, Engine engine, Cargo cargo, List<Tires> tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;
    }
    public void ifFragile(){
        for (Tires tire: tires){
            double pressure= tire.getPressure();
            if (pressure<1){
                System.out.println(model);
                break;
            }
            break;
        }
    }
    public void ifFlamable(){
        int enginePower= getEngine().getPower();
        if (enginePower>250){
            System.out.println(model);

        }

    }
}
