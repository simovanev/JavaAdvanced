package DefiningClasses.CarSalesman;

public class Car {
    //model, engine, weight, and color.
    private String model;
    private Engines engine;
    private String weight;
    private  String color;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engines getEngine() {
        return engine;
    }

    public void setEngine(Engines engine) {
        this.engine = engine;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(String model, Engines engine) {
        this.model = model;
        this.engine = engine;
        this.weight="n/a";
        this.color="n/a";
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
        return String.format("%s:%n%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s"
                ,model,engine.getModel(),engine.getPower(),engine.getDisplacement(),engine.getEfficiency()
                ,weight,color);
    }
}
