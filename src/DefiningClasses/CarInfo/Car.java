package DefiningClasses.CarInfo;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return this.horsepower;
    }

    public void setHp(int hp) {
        this.horsepower = hp;
    }

    public Car(String brand) {
        this.brand = brand;
        this.model="unknown";
        this.horsepower=-1;

    }
    public Car(String brand,String model,int hp){
        this.brand=brand;
        this.model=model;
        this.horsepower=hp;
    }

    public String CarInfo() {
        return "The car is: " + this.brand + " " + this.model + " - " + this.horsepower + " HP.";
    }
}

