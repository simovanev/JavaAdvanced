package DefiningClasses.RawData;

import java.util.ArrayList;
import java.util.List;

public class Tires {

private double pressure;
private int age;

    public double getPressure() {
        return pressure;
    }

    public Tires(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }
}
