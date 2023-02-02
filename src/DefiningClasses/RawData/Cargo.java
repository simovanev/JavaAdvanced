package DefiningClasses.RawData;

public class Cargo {
    private int cargoWeight;
    private  String type;

    public String getType() {
        return type;
    }

    public Cargo(int cargoWeight, String type) {
        this.cargoWeight = cargoWeight;
        this.type = type;

    }
}
