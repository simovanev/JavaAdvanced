package DefiningClasses.RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tires tires;

    public Car(String model, Engine engine, Cargo cargo, Tires tires) {
        this.model = model;
        this.engine = engine;
        this.cargo = cargo;
        this.tires = tires;


    }

    public void extract (String command) {
        switch (command) {
            case "fragile":
                double tirePressure = tires.getMinPressure();
                if (tirePressure < 1) {
                    System.out.println(model);
                }
                break;
            case "flamable":

                if (engine.getEnginePower() > 250) {
                    System.out.println(model);

                }
                break;

        }
    }
}
