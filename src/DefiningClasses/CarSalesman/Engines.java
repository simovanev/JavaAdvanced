package DefiningClasses.CarSalesman;

public class Engines {
//a model, power, displacement, and efficiency
    private  String model;
    private int power;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    private String displacement;
    private String efficiency;

    public Engines(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = "n/a";
        this.efficiency = "n/a";
    }
}
