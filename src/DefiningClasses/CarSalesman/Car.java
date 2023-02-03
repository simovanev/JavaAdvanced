package DefiningClasses.CarSalesman;

public class Car {
    //model, engine, weight, and color.
    private String model;
    private Engines engine;
    private  String weight;
    private String colour;

    public Car(String model, Engines engine) {
        this.model = model;
        this.engine = engine;
        this.weight = "n/a";
        this.colour="n/a";
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public Engines getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        //"{CarModel}:
        //{EngineModel}:
        //Power: {EnginePower}
        //Displacement: {EngineDisplacement}
        //Efficiency: {EngineEfficiency}
        //Weight: {CarWeight}
        //Color: {CarColor}"
        return String.format("%s:%n%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s",
                getModel(),getEngine().getModel(),getEngine().getPower(),getEngine().getDisplacement(),getEngine().getEfficiency()
        ,getWeight(),getColour());
    }
}
