package DefiningClasses.RawData;

public class Tires {
    private  double pressure1;
    private  double age1;
    private  double pressure2;
    private  double age2;
    private  double pressure3;
    private  double age3;
    private  double pressure4;
    private  double age4;

    public double getMinPressure() {
        double min1=Math.min(pressure1,pressure2);
        double min2=Math.min(pressure3,pressure4);
        return Math.min(min1,min2);
    }
    public double getMaxPressure() {
        double max1 = Math.max(pressure1, pressure2);
        double max2 = Math.max(pressure3, pressure4);
        return Math.max(max1, max2);
    }

    public Tires(double pressure1, double age1, double pressure2, double age2, double pressure3, double age3, double pressure4, double age4) {
        this.pressure1 = pressure1;
        this.age1 = age1;
        this.pressure2 = pressure2;
        this.age2 = age2;
        this.pressure3 = pressure3;
        this.age3 = age3;
        this.pressure4 = pressure4;
        this.age4 = age4;


    }
}
