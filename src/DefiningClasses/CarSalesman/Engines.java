package DefiningClasses.CarSalesman;

public class Engines {
    private String model;
    private int power;
    private String displacement;
    private String efficiency;

    public Engines(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement =  "n/a";
        this.efficiency = "n/a";
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public int getPower() {
        return power;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public String getModel() {
        return model;
    }
}
