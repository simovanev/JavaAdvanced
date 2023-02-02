package DefiningClasses.CarSalesman;

public class Engine5 {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine5(String model, int power, int displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = "n/a";
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public String getModel() {
        return model;
    }
}
